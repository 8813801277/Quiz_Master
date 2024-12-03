package com.mukul.QuizBackend.Service;

import com.mukul.QuizBackend.Entity.QuizQuestion;
import com.mukul.QuizBackend.Repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public QuizQuestion addQuizQuestion(QuizQuestion q){
        return questionRepo.save(q);
    }

    public List<QuizQuestion> getAllQuestion(){
        List<QuizQuestion> all_questions= questionRepo.findAll();
        return all_questions;
    }

    public String deletebyid(Long id){
        Optional<QuizQuestion> quiz = questionRepo.findById(id);
        if(quiz.isPresent()){
            QuizQuestion q = quiz.get();
            questionRepo.delete(q);
            return "Data deleted successfully";
        }
        else return "Entry not found";
    }
}
