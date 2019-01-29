package com.bj.KnowledgeTransfer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bj.KnowledgeTransfer.dao.TopicDAO;
import com.bj.KnowledgeTransfer.model.TopicModel;


@Service
public class KnowledgeTransferServiceImpl implements com.bj.KnowledgeTransfer.service.KnowledgeTransferService {

	@Autowired
	private TopicDAO topicDAO;

	@Override
	public List<TopicModel> getAllTopics() {

		return topicDAO.getAllTopics();
	}
	
	public TopicModel getTopic(String index) {
		return topicDAO.getAllTopics().get(Integer.valueOf(index));
	}

}
