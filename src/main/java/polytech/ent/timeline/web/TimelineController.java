package polytech.ent.timeline.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import polytech.ent.timeline.service.TimelineService;

@Controller
public class TimelineController {
	@Autowired
	private TimelineService tlService;
	
	@RequestMapping("/timeline") 
	public String timeline(Map<String, Object> map) {
		map.put("tls", tlService.listTimeline());
		return "timeline";
	}
	
	@RequestMapping("/timeline/delete/{tlid}") 
	public String deleteTL(@PathVariable("tlid") Integer tlid) {
		tlService.removeTimeline(tlid);
		return "redirect:/timeline";
	}
}
