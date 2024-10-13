package com.project.quizzapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.quizzapp.model.Quiz;

public interface QuizDao  extends JpaRepository<Quiz,Integer>  {
    
}
