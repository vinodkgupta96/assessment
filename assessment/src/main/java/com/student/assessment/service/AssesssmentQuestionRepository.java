package com.student.assessment.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.student.assessment.model.Question;

@Service
public interface AssesssmentQuestionRepository extends JpaRepository<Question, Long>{

}
