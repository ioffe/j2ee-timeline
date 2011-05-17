package polytech.ent.timeline.dao;

import polytech.ent.timeline.domain.Event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.SessionFactory;

@Repository
@Transactional
public class EventDAOImpl implements EventDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addEvent(Event event) {
		sessionFactory.getCurrentSession().save(event);
	}

	@SuppressWarnings("unchecked")
	public List<Event> listEvent() {
		return sessionFactory.getCurrentSession().createQuery("from Event").list();
	}

	public void removeEvent(Integer id) {
		Event e = (Event)sessionFactory.getCurrentSession().load(Event.class, id);
		if (e != null) {
			sessionFactory.getCurrentSession().delete(e);
		}
	}
	
}
