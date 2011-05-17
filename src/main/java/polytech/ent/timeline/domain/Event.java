package polytech.ent.timeline.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EVENT")
public class Event {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name = "STARTDATE")
	private String startDate;
	
	@Column(name = "ENDDATE")
	private String endDate;
	
	@Column(name = "CAPTION")
	private String caption;
	
	@Column(name = "`DESC`")
	private String desc;
	
	@ManyToOne
	@JoinColumn(name = "timelineId", nullable = false)
	private Timeline timeline;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setTimeline(Timeline timeline) {
		this.timeline = timeline;
	}

	public Timeline getTimeline() {
		return timeline;
	}
	
}
