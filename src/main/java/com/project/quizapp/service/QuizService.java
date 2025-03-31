package com.project.quizapp.service;
import com.project.quizapp.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;
}
