package com.project.quizzapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.quizzapp.model.Questions;
import com.project.quizzapp.repository.QuestionDao;

import java.util.*;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<List<Questions>> getAllQuestions() {
        return new ResponseEntity<>(questionDao.findAll(),HttpStatus.OK);
    }

    public ResponseEntity<List<Questions>> getQuestionsByCategory(String category) {
        return new ResponseEntity<>(questionDao.findByCategory(category),HttpStatus.OK);
    }

    public ResponseEntity<String> addQuestion(Questions questions){
        questionDao.save(questions);
        return new ResponseEntity<>("Successfully Added", HttpStatus.CREATED);
    }

    public ResponseEntity<String> deleteQuestion(Integer i){
        questionDao.deleteById(i);
        return new ResponseEntity<>("Delete Successful", HttpStatus.ACCEPTED);
    }

    public ResponseEntity<String> updateQuestion(Integer i, Questions questions ){
        Optional<Questions> existQues = questionDao.findById(i);

        if (existQues.isPresent()) {
            Questions ques = existQues.get();
            ques.setCategory(questions.getCategory());
            ques.setDifficultLevel(questions.getDifficultLevel());
            ques.setQuestionTitle(questions.getQuestionTitle());
            ques.setOption1(questions.getOption1());
            ques.setOption2(questions.getOption2());
            ques.setOption3(questions.getOption3());
            ques.setOption4(questions.getOption4());
            ques.setRightAnswer(questions.getRightAnswer());

            questionDao.save(ques);

            return new ResponseEntity<>("Update Successful", HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>("Update Not Successful", HttpStatus.NO_CONTENT);
    }
}
