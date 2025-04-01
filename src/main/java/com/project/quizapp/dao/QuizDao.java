package com.project.quizapp.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
    
}
