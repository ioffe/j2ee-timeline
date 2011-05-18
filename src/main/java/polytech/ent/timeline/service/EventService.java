package polytech.ent.timeline.service;

import java.util.List;
import polytech.ent.timeline.domain.Event;

public interface EventService {
	
	public void addEvent(Event e);
	
	public List<Event> listEvent();
	
	public void removeEvent(Integer id);
	
	public Event getEvent(Integer id);
	
}
