package com.letstudy.backend.model;
import jakarta.persistence.*;
@Entity @Table(name="topics")
public class Topic {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false) private String name;
 @Column(nullable=false) private String formLevel;
 @ManyToOne @JoinColumn(name="subject_id",nullable=false) private Subject subject;
 public Topic(){} public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;} public String getFormLevel(){return formLevel;} public void setFormLevel(String v){formLevel=v;} public Subject getSubject(){return subject;} public void setSubject(Subject v){subject=v;}
}
