package com.lokalib.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lokalib.entity.Author;
import com.lokalib.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	private AuthorService service;
	
	@PostMapping("/authors")
	public Author addAuthor(@RequestBody Author author) {
		return service.saveAuthor(author);
	}
	
	@GetMapping("/authors")
	public List<Author> findAllAuthors() {
		return service.getAuthors();
	}
	
	@GetMapping("/authors/{id}")
	public Author getAuthor(@PathVariable int id) {
		return service.getAuthorById(id);
	}
	
}
