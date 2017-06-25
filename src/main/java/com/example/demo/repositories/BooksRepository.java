package com.example.demo.repositories;

import com.example.demo.entities.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

public interface BooksRepository extends ElasticsearchCrudRepository<Book, String> {

}
