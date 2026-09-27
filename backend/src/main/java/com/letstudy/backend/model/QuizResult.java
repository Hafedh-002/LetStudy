package com.letstudy.backend.model;
import jakarta.persistence.*;
@Entity @Table(name="quiz_results")
public class QuizResult {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private int totalQuestions; private int correctAnswers; private int score; private double percentage;
 public QuizResult(){} public QuizResult(int total,int correct,int score,double percentage){this.totalQuestions=total;this.correctAnswers=correct;this.score=score;this.percentage=percentage;}
 public Long getId(){return id;} public void setId(Long v){id=v;} public int getTotalQuestions(){return totalQuestions;} public void setTotalQuestions(int v){totalQuestions=v;} public int getCorrectAnswers(){return correctAnswers;} public void setCorrectAnswers(int v){correctAnswers=v;} public int getScore(){return score;} public void setScore(int v){score=v;} public double getPercentage(){return percentage;} public void setPercentage(double v){percentage=v;}
}
