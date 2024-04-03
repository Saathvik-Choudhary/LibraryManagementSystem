package com.example.LibraryManagementSystem;

import com.example.LibraryManagementSystem.library.domain.Book;
import com.example.LibraryManagementSystem.library.persistence.BookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookTests {

	@Autowired
	private BookRepository subject;

	@BeforeEach
	public void setup() {
		subject.save(new Book("author",
				0,
				"bookType",
				"isbn",
				"publisher",
				"title"));
	}
	@Test
	public void contextLoadsTest() {


		Assertions.assertNotNull(subject);
	}

	@Test
	public void findAllTest(){

		final var books=subject.findAll();

		Assertions.assertNotNull(subject);    /// this is not a valid test as this will always be true

		Assertions.assertTrue(books.iterator().hasNext());


	}
}
