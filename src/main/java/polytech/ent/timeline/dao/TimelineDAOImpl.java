package polytech.ent.timeline.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import polytech.ent.timeline.domain.Timeline;

@Repository
@Transactional
public class TimelineDAOImpl implements TimelineDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addTimeline(Timeline t) {
		sessionFactory.getCurrentSession().save(t);
	}

	@SuppressWarnings("unchecked")
	public List<Timeline> listTimeline() {
		return sessionFactory.getCurrentSession().createQuery("from Timeline").list();
	}

	public void removeTimeline(Integer id) {
		Timeline t = (Timeline)sessionFactory.getCurrentSession().load(Timeline.class, id);
		if (t != null) {
			sessionFactory.getCurrentSession().delete(t);
		}
	}

	public Timeline getTimeline(Integer id) {
		return (Timeline)sessionFactory.getCurrentSession().load(Timeline.class, id);
	}
	
}
