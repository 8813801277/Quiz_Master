package com.mukul.QuizBackend.Controller;

import com.mukul.QuizBackend.Entity.PythonQuiz;
import com.mukul.QuizBackend.Service.PythonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class PythonController {

    @Autowired
    PythonService pythonService;

    @PostMapping("/python/save")
    public PythonQuiz createPython(@RequestBody PythonQuiz p){
        return pythonService.createpython(p);
    }

    @GetMapping("/python/all")
    public List<PythonQuiz> getAllPython(){
        return pythonService.getallpython();
    }

    @DeleteMapping("/python/delete/{id}")
    public String deleteById(@PathVariable long id){
        return pythonService.deletebyid(id);
    }
}
