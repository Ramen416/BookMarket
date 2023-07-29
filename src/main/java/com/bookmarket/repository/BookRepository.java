package com.bookmarket.repository;

import java.util.List;

import com.bookmarket.domain.Book;

public interface BookRepository {
	List<Book> getAllBookList();
	List<Book> getBookListByCategory(String category);
	Book getBookById(String bookId);
}
