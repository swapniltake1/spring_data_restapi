package com.spring.data.rest.spring_data_demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.data.rest.spring_data_demo.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{
    
   


}
