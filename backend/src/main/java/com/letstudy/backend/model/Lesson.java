package com.letstudy.backend.model;
import jakarta.persistence.*;
@Entity @Table(name="lessons")
public class Lesson {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false) private String title;
 @Column(columnDefinition="TEXT") private String content;
 @ManyToOne @JoinColumn(name="topic_id",nullable=false) private Topic topic;
 public Lesson(){} public Lesson(String title,String content,Topic topic){this.title=title;this.content=content;this.topic=topic;}
 public Long getId(){return id;} public String getTitle(){return title;} public void setTitle(String v){title=v;} public String getContent(){return content;} public void setContent(String v){content=v;} public Topic getTopic(){return topic;} public void setTopic(Topic v){topic=v;}
}
