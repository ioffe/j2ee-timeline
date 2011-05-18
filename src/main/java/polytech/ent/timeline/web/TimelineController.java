package polytech.ent.timeline.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import polytech.ent.timeline.domain.Event;
import polytech.ent.timeline.domain.Timeline;
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
	
	@RequestMapping(value = "/timeline/do-add", method = RequestMethod.POST)
	public String doAddEvent(@ModelAttribute("timeline") Timeline timeline, BindingResult result) {
		tlService.addTimeline(timeline);
		return "redirect:/timeline";
	}
	
	@RequestMapping("/timeline/add")
	public String addEvent(@ModelAttribute("timeline") Timeline timeline, BindingResult result) {
		return "timeline-add";
	}
	
}
