package com.mukul.QuizBackend.Repo;

import com.mukul.QuizBackend.Entity.PythonQuiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PythonRepo extends JpaRepository<PythonQuiz,Long> {
}