package com.nitin.assignment.repository;
import org.springframework.data.repository.CrudRepository;

import com.nitin.assignment.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
