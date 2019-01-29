package com.bj.KnowledgeTransfer.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.bj.KnowledgeTransfer.model.TopicModel;

@Repository
public class TopicDAO {

	private static final Map<String, TopicModel> TOPIC_MAPS = new HashMap<>();

	static {
		initData();
	}

	private static void initData() {
		TopicModel mytopic1 = new TopicModel("0", "topic 1", "topic desc 1", "trainer 1", "lead 1", "2019-01-02",
				"Done");
		TopicModel mytopic2 = new TopicModel("1", "topic 2", "topic desc 2", "trainer 2", "lead 2", "2019-01-02",
				"Done");
		TopicModel mytopic3 = new TopicModel("2", "topic 3", "topic desc 3", "trainer 3", "lead 3", "2019-01-02",
				"Not Done");
		TopicModel mytopic4 = new TopicModel("3", "topic 4", "topic desc 4", "trainer 4", "lead 4", "2019-01-02",
				"Done");

		TOPIC_MAPS.put(mytopic1.getId(), mytopic1);
		TOPIC_MAPS.put(mytopic2.getId(), mytopic2);
		TOPIC_MAPS.put(mytopic3.getId(), mytopic3);
		TOPIC_MAPS.put(mytopic4.getId(), mytopic4);

	}

	public List<TopicModel> getAllTopics() {
		List<TopicModel> myTopics = new ArrayList<>();
		myTopics.addAll(TOPIC_MAPS.values());
		return myTopics;
	}

}
