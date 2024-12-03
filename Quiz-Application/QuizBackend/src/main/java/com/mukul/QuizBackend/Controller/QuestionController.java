package com.mukul.QuizBackend.Controller;

import com.mukul.QuizBackend.Entity.QuizQuestion;
import com.mukul.QuizBackend.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @PostMapping(value = "/java/save")
    public QuizQuestion addQuestions(@RequestBody QuizQuestion q){
        return questionService.addQuizQuestion(q);
    }

    @GetMapping("/java/all")
    public List<QuizQuestion> getAll(){
        return questionService.getAllQuestion();
    }

    @DeleteMapping("/java/delete/{id}")
    public String deleteById(@PathVariable long id){
        return questionService.deletebyid(id);
    }
}
