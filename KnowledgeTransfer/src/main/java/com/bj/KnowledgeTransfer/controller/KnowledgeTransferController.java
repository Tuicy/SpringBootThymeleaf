package com.bj.KnowledgeTransfer.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bj.KnowledgeTransfer.model.TopicModel;
import com.bj.KnowledgeTransfer.service.impl.KnowledgeTransferServiceImpl;

@Controller
public class KnowledgeTransferController {

	@Autowired
	private KnowledgeTransferServiceImpl knowledgeTransferServiceImpl;

	@InitBinder
	protected void InitBinder(WebDataBinder myBinder) {
		Object target = myBinder.getTarget();
		if (target == null) {
			return;
		}

	}

	@RequestMapping("/")
	public String viewDefault() {

		return "menu";
	}

	@RequestMapping(value= "/topics", method = RequestMethod.GET)
	public String getTopics(Model model) {

		List<TopicModel> myTopics = knowledgeTransferServiceImpl.getAllTopics();
		model.addAttribute("topics", myTopics);
		return "topics";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String initiateEdit(@ModelAttribute("topic") TopicModel topicModel, final Model model) {

		System.out.println("THIS IS A TEST!!!" + topicModel.getMainTopic());
		System.out.println("THIS IS A TEST!!!" + topicModel.getId());

		model.addAttribute("topics", topicModel);
		System.out.println(topicModel.toString());

		return "menu";

	}
	
	@RequestMapping(value = "/viewTopic/{id}", method = RequestMethod.GET)
	public String initiateEdit(@PathVariable String id, Model model) {

		System.out.println("THIS IS A TEST!!!" + id);
		
		TopicModel myTopic = knowledgeTransferServiceImpl.getTopic(id);
		
		model.addAttribute("topicsInd", myTopic);
		System.out.println(myTopic.getMainTopic());
		return "topic";

	}


}
