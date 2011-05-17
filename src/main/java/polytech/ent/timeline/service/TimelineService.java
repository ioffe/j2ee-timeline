package polytech.ent.timeline.service;

import java.util.List;
import polytech.ent.timeline.domain.Timeline;

public interface TimelineService {
	
	public void addTimeline(Timeline e);
	
	public List<Timeline> listTimeline();
	
	public void removeTimeline(Integer id);
	
	public Timeline getTimeline(Integer id);

}
