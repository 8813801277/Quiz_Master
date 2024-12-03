package com.mukul.QuizBackend.Repo;

import com.mukul.QuizBackend.Entity.NetQuiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetRepo extends JpaRepository<NetQuiz,Long> {
}
