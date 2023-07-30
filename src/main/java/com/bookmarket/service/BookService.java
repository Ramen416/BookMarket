package com.bookmarket.service;

import java.util.List;

import com.bookmarket.domain.Book;

public interface BookService {
	List<Book> getAllBookList();
	List<Book> getBookListByCategory(String category);
	Book getBookById(String bookId);
	void setNewBook(Book book);
}
