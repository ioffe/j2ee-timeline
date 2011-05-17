package polytech.ent.timeline.dao;

import java.util.List;

import polytech.ent.timeline.domain.Timeline;

public interface TimelineDAO {
	
	public void addTimeline(Timeline tl);
	
	public List<Timeline> listTimeline();
	
	public void removeTimeline(Integer id);
	
	public Timeline getTimeline(Integer id);
	
}
