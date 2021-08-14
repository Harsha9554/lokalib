package com.lokalib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lokalib.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
