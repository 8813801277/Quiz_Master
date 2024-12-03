package com.mukul.QuizBackend.Controller;

import com.mukul.QuizBackend.Entity.NetQuiz;
import com.mukul.QuizBackend.Service.NetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class NetController {

    @Autowired
    NetService netService;

    @PostMapping("/net/save")
    public NetQuiz createNet(@RequestBody NetQuiz n){
        return netService.createnet(n);
    }

    @GetMapping("/net/all")
    public List<NetQuiz> getAllNet(){
        return netService.getallnet();
    }

    @DeleteMapping("/net/delete/{id}")
    public String deleteById(@PathVariable long id){
        return netService.deletebyid(id);
    }
}
