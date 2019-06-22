package com.student.assessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.assessment.model.Question;

public class QuestionService {
	
	@Autowired
	private AssesssmentQuestionRepository assesssmentQuestionRepository;
	
	
	public Question getQuestionById(Long id) {
		return assesssmentQuestionRepository.findOne(id);
	}

	public List<Question>getAllQuestion(){
		return assesssmentQuestionRepository.findAll();
	}
	
	public void saveQuestion(Question question) {
		assesssmentQuestionRepository.save(question);
	}
}
