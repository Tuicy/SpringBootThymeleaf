package com.bj.KnowledgeTransfer.service;

import java.util.List;

import com.bj.KnowledgeTransfer.model.TopicModel;

public interface KnowledgeTransferService {
	
	public List<TopicModel> getAllTopics();
	
	public TopicModel getTopic(String index);
	

}
