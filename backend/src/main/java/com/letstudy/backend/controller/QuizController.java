package com.letstudy.backend.controller;
import com.letstudy.backend.model.QuizResult; import com.letstudy.backend.repository.QuizResultRepository; import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/quiz") public class QuizController {private final QuizResultRepository repo;public QuizController(QuizResultRepository repo){this.repo=repo;}@PostMapping("/submit") public QuizResult submit(@RequestBody QuizResult r){r.setId(null);return repo.save(r);}}
