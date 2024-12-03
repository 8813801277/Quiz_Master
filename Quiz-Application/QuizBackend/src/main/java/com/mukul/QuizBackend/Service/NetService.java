package com.mukul.QuizBackend.Service;

import com.mukul.QuizBackend.Entity.NetQuiz;
import com.mukul.QuizBackend.Repo.NetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NetService {
    @Autowired
    NetRepo netRepo;

    public NetQuiz createnet(NetQuiz n){
        return netRepo.save(n);
    }

    public List<NetQuiz> getallnet(){
        return netRepo.findAll();
    }

    public String deletebyid(Long id){
        Optional<NetQuiz> byid = netRepo.findById(id);
        if(byid.isPresent()){
            NetQuiz net = byid.get();
            netRepo.delete(net);
            return "Deleted successfully";
        }
        else return "Data not found";
    }
}
