package com.letstudy.backend.model;
import jakarta.persistence.*;
@Entity @Table(name="subjects")
public class Subject {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false) private String name;
 @Column(columnDefinition="TEXT") private String description;
 public Subject(){} public Subject(String name,String description){this.name=name;this.description=description;}
 public Long getId(){return id;} public void setId(Long v){id=v;} public String getName(){return name;} public void setName(String v){name=v;} public String getDescription(){return description;} public void setDescription(String v){description=v;}
}
