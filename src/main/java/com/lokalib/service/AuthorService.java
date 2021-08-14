package com.lokalib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lokalib.entity.Author;
import com.lokalib.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository repository;
	
	public Author saveAuthor(Author author) {
		return repository.save(author);
	}
	
	public List<Author> getAuthors() {
		System.out.println(repository.findAll().toString());
		return repository.findAll();
	}
	
	public Author getAuthorById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public String deleteAuthorById(int id) {
		repository.deleteById(id);
		return "author removed with id : "+id;
	}
	
	
}
