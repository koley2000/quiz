package com.project.quizzapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.quizzapp.model.Questions;
import com.project.quizzapp.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allquestions")
    public ResponseEntity<List<Questions>> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Questions>> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("addquestion")
    public ResponseEntity<String> addQuestion(@RequestBody Questions questions) {
        return questionService.addQuestion(questions);
    }

    @PutMapping("updatequestion/{i}")
    public ResponseEntity<String> updateQuestion(@PathVariable Integer i, @RequestBody Questions questions) {
        return questionService.updateQuestion(i, questions);
    }

    @DeleteMapping("deletequestion/{i}")
    public ResponseEntity<String> deleteQueString (@PathVariable Integer i){
        return questionService.deleteQuestion(i);
    }
}
