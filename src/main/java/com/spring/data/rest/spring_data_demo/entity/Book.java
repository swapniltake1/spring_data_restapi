package com.spring.data.rest.spring_data_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_collections")
public class Book {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
   private Integer id;
   private String title;
   private String about;
   private String author;
   private Integer pages;

   
public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
public String getAbout() {
    return about;
}
public void setAbout(String about) {
    this.about = about;
}
public String getAuthor() {
    return author;
}
public void setAuthor(String author) {
    this.author = author;
}
public Integer getPages() {
    return pages;
}
public void setPages(Integer pages) {
    this.pages = pages;
}

@Override
public String toString() {
    return "Book [id=" + id + ", title=" + title + ", about=" + about + ", author=" + author + ", pages=" + pages + "]";
}

   
   


}
