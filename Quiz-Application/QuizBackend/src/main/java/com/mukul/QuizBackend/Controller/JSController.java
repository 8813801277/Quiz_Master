package com.mukul.QuizBackend.Controller;

import com.mukul.QuizBackend.Entity.JSQuiz;
import com.mukul.QuizBackend.Service.JSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class JSController {

    @Autowired
    JSService jsService;

    @PostMapping("JS/save")
    public JSQuiz createJS(@RequestBody JSQuiz j){
        return jsService.createjs(j);
    }

    @GetMapping("JS/all")
    public List<JSQuiz> getAllJS(){
        return jsService.getalljs();
    }

    @DeleteMapping("/JS/delete/{id}")
    public String deleteJSbyId(@PathVariable long id){
        return jsService.deletejs(id);
    }
}
