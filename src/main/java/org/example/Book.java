package org.example;

import lombok.Data;

@Data
public class Book {

    private String name;
    private String author;
    private int pageSize;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, int pageSize) {
        this.name = name;
        this.author = author;
        this.pageSize = pageSize;
    }
}
