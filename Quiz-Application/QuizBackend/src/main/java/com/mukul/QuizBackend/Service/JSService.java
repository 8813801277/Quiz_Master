package com.mukul.QuizBackend.Service;

import com.mukul.QuizBackend.Entity.JSQuiz;
import com.mukul.QuizBackend.Repo.JSRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JSService {

    @Autowired
    JSRepo jsRepo;

    public JSQuiz createjs(JSQuiz j){
        return jsRepo.save(j);
    }

    public List<JSQuiz> getalljs(){
        return jsRepo.findAll();
    }

    public String deletejs(Long id){
        Optional<JSQuiz> temp = jsRepo.findById(id);
        if(temp.isPresent()){
            JSQuiz js = temp.get();
            jsRepo.delete(js);
            return "deleted Successfully";
        }
        else return "Data not found";
    }
}
