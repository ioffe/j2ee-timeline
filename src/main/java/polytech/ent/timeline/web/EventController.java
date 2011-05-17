package polytech.ent.timeline.web;

import java.util.Map;

import polytech.ent.timeline.domain.Event;
import polytech.ent.timeline.service.EventService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

	@Autowired
	private EventService eventService;

//	@RequestMapping("/index")
//	public String listEvents(Map<String, Object> map) {
//
//		map.put("event", new Event());
//		map.put("eventList", eventService.listEvent());
//
//		return "event";
//	}
//
//	@RequestMapping("/")
//	public String home() {
//		return "redirect:/index";
//	}
//
//	@RequestMapping(value = "/add", method = RequestMethod.POST)
//	public String addEvent(@ModelAttribute("event") Event event, BindingResult result) {
//		eventService.addEvent(event);
//		return "redirect:/index";
//	}
//
//	@RequestMapping("/delete/{eventId}")
//	public String deleteEvent(@PathVariable("eventId") Integer eventId) {
//		eventService.removeEvent(eventId);
//		return "redirect:/index";
//	}
}
