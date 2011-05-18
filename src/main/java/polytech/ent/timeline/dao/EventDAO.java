package polytech.ent.timeline.dao;

import java.util.List;
import polytech.ent.timeline.domain.Event;

public interface EventDAO {
	
	public void addEvent(Event event);
	
	public List<Event> listEvent();
	
	public void removeEvent(Integer id);
	
	public Event getEvent(Integer id);
}
