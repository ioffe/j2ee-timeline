package polytech.ent.timeline.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import polytech.ent.timeline.domain.Event;
import polytech.ent.timeline.domain.Timeline;
import polytech.ent.timeline.service.EventService;
import polytech.ent.timeline.service.TimelineService;

@Controller
public class EventListController {
	@Autowired
	private TimelineService tlService;
	@Autowired
	private EventService eventService;
	
	@RequestMapping(value = "/events/list/{tlid}", method = RequestMethod.GET) 
	public String timeline(@PathVariable("tlid") Integer tlid, Map<String, Object> map) {
		
		Timeline t = tlService.getTimeline(tlid);
		
		map.put("eventList", t.getEvents());
		map.put("tl", t);
		
		return "event-list";
	}
	
	@RequestMapping("/events/delete/{eventId}")
	public String deleteEvent(@PathVariable("eventId") Integer eventId) {
		Event e = eventService.getEvent(eventId);
		Integer tlid = e.getTimeline().getId();
		
		eventService.removeEvent(eventId);
		return "redirect:/events/list/" + tlid;
	}
	
	@RequestMapping(value = "/events/do-add/{tlid}", method = RequestMethod.POST)
	public String doAddEvent(@PathVariable("tlid") Integer tlid, @ModelAttribute("event") Event event, BindingResult result) {
		Timeline t = tlService.getTimeline(tlid);
		if (t == null)
			throw new IdNotFoundException();
		
		event.setTimeline(t);
		eventService.addEvent(event);
		return "redirect:/events/list/" + tlid;
	}
	
	@RequestMapping("/events/add/{tlid}")
	public String addEvent(@PathVariable("tlid") Integer tlid, Map<String, Object> map, @ModelAttribute("event") Event event, BindingResult result) {
		
		map.put("tlid", tlid);
		
		return "event-add";
	}
	

}
