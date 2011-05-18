package polytech.ent.timeline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import polytech.ent.timeline.dao.EventDAO;
import polytech.ent.timeline.domain.Event;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventDAO eventDAO;

	@Transactional
	public void addEvent(Event e) {
		eventDAO.addEvent(e);
	}

	public List<Event> listEvent() {
		return eventDAO.listEvent();
	}

	public void removeEvent(Integer id) {
		eventDAO.removeEvent(id);
	}

	public Event getEvent(Integer id) {
		return eventDAO.getEvent(id);
	}

}
