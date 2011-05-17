package polytech.ent.timeline.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import polytech.ent.timeline.domain.Timeline;
import polytech.ent.timeline.service.TimelineService;

@Controller
public class EventListController {
	@Autowired
	private TimelineService tlService;
	
	@RequestMapping(value = "/events-list", method = RequestMethod.GET) 
	public String timeline(@RequestParam Integer tlid, Map<String, Object> map) {
		
		Timeline t = tlService.getTimeline(tlid);
		
		map.put("eventList", t.getEvents());
		map.put("tl", t);
		
		return "event-list";
	}

}
