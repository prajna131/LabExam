package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);

    List<Book> getAllBooks();

    Book getBookById(Long id);

    Book updateBook(Long id, Book updatedBook);

    void deleteBook(Long id);
}
