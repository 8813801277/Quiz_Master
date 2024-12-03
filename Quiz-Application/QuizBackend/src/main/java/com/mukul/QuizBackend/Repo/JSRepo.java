package com.mukul.QuizBackend.Repo;

import com.mukul.QuizBackend.Entity.JSQuiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JSRepo extends JpaRepository<JSQuiz,Long> {
}
