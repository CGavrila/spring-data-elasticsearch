package com.example.demo.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "books")
public class Book {

    @Id
    private String id;
    private String title;

    public Book() {
    }

}