package com.bj.KnowledgeTransfer.model;

public class TopicModel {

	String id;
	String mainTopic;
	String topicDesc;
	String trainer;
	String lead;
	String date;
	String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMainTopic() {
		return mainTopic;
	}

	public void setMainTopic(String mainTopic) {
		this.mainTopic = mainTopic;
	}

	public String getTopicDesc() {
		return topicDesc;
	}

	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getLead() {
		return lead;
	}

	public void setLead(String lead) {
		this.lead = lead;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	/**
	 * 
	 * @param id
	 * @param mainTopic
	 * @param topicDesc
	 * @param trainer
	 * @param lead
	 * @param date
	 * @param status
	 */
	public TopicModel(String id, String mainTopic, String topicDesc, String trainer, String lead, String date,
			String status) {
		super();
		this.id = id;
		this.mainTopic = mainTopic;
		this.topicDesc = topicDesc;
		this.trainer = trainer;
		this.lead = lead;
		this.date = date;
		this.status = status;
	}

	public TopicModel() {

	}

	@Override
	public String toString() {
		return "TopicModel [id=" + id + ", mainTopic=" + mainTopic + ", topicDesc=" + topicDesc + ", trainer=" + trainer
				+ ", lead=" + lead + ", date=" + date + ", status=" + status + "]";
	}

	
	
}
