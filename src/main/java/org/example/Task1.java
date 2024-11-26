package org.example;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<List<Book>> books = List.of(
                List.of(new Book("Книга1", "Достоевский", 1000),
                        new Book("Книга2", "Достоевский", 500),
                        new Book("Книга3", "Толстой", 700),
                        new Book("Книга4", "Пушкин", 600)),
                List.of(new Book("Книга5", "Чехов", 1000),
                        new Book("Книга6", "Пушкин", 700))
        );

     /*
    1. Сгруппировать книги по автору
        (Map<String, List<Book>> map)
     */

        /*
    2. Сгруппировать книги по автору, а внутри группы отсортировать по количеству страниц (по возрастанию)
        (Map<String, List<Book>> map)

    3. Сгруппировать книги авторам, затем внутри группы оставить только название книг
    (без имени автора, количества страниц)
        (Map<String, List<String>> map)
     */



    }

}
