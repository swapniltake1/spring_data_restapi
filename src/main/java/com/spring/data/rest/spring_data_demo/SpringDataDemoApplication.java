package com.spring.data.rest.spring_data_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.data.rest.spring_data_demo.Repo.BookRepository;
import com.spring.data.rest.spring_data_demo.entity.Book;

@SpringBootApplication
public class SpringDataDemoApplication  implements CommandLineRunner{

	@Autowired
	private BookRepository bookRepository;

	///@Autowired
	//private Book book;


	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);

        

	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// Creating books 
		Book book1 = new Book();
		
		book1.setTitle("Java Programming");
		book1.setAuthor("Sun Microsystem");
		book1.setPages(200);
		book1.setAbout("Book Related to java Progrfamming");

		Book book2 = new Book();
		
		book2.setTitle("Python Programming");
		book2.setAuthor("Sun Microsystem");
		book2.setPages(250);
		book2.setAbout("Book Related to Python Progrfamming");

		//Saving books 
             this.bookRepository.save(book1);
			 this.bookRepository.save(book2);


	}

}
