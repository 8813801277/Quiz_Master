package com.mukul.QuizBackend.Service;

import com.mukul.QuizBackend.Entity.PythonQuiz;
import com.mukul.QuizBackend.Repo.PythonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PythonService {

    @Autowired
    PythonRepo pythonRepo;

    public PythonQuiz createpython(PythonQuiz p){
        return pythonRepo.save(p);
    }

    public List<PythonQuiz> getallpython(){
        return pythonRepo.findAll();
    }

    public String deletebyid(Long id){
        Optional<PythonQuiz> byid = pythonRepo.findById(id);
        if(byid.isPresent()){
            PythonQuiz pq = byid.get();
            pythonRepo.delete(pq);
            return "Deleted Successfully";
        }
        else return "Data not found";
    }
}
