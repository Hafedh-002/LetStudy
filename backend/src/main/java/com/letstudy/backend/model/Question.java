package com.letstudy.backend.model;
import jakarta.persistence.*;
@Entity @Table(name="questions")
public class Question {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false,columnDefinition="TEXT") private String questionText;
 @Column(nullable=false,columnDefinition="TEXT") private String optionA;
 @Column(nullable=false,columnDefinition="TEXT") private String optionB;
 @Column(nullable=false,columnDefinition="TEXT") private String optionC;
 @Column(nullable=false,columnDefinition="TEXT") private String optionD;
 @Column(nullable=false,length=1) private String correctAnswer;
 @Column(columnDefinition="TEXT") private String explanation;
 @ManyToOne @JoinColumn(name="topic_id",nullable=false) private Topic topic;
 public Question(){}
 public Long getId(){return id;} public void setId(Long v){id=v;} public String getQuestionText(){return questionText;} public void setQuestionText(String v){questionText=v;} public String getOptionA(){return optionA;} public void setOptionA(String v){optionA=v;} public String getOptionB(){return optionB;} public void setOptionB(String v){optionB=v;} public String getOptionC(){return optionC;} public void setOptionC(String v){optionC=v;} public String getOptionD(){return optionD;} public void setOptionD(String v){optionD=v;} public String getCorrectAnswer(){return correctAnswer;} public void setCorrectAnswer(String v){correctAnswer=v;} public String getExplanation(){return explanation;} public void setExplanation(String v){explanation=v;} public Topic getTopic(){return topic;} public void setTopic(Topic v){topic=v;}
}
