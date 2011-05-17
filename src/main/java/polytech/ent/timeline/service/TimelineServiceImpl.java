package polytech.ent.timeline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import polytech.ent.timeline.dao.TimelineDAO;
import polytech.ent.timeline.domain.Timeline;

@Service
public class TimelineServiceImpl implements TimelineService {
	
	@Autowired
	private TimelineDAO tlDAO;

	public void addTimeline(Timeline t) {
		tlDAO.addTimeline(t);
	}

	public List<Timeline> listTimeline() {
		return tlDAO.listTimeline();
	}

	public void removeTimeline(Integer id) {
		tlDAO.removeTimeline(id);
	}

	public Timeline getTimeline(Integer id) {
		return tlDAO.getTimeline(id);
	}

}
