package com.bookmarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmarket.domain.Book;
import com.bookmarket.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public List<Book> getAllBookList() {
		// TODO Auto-generated method stub
		return bookRepository.getAllBookList();
	}
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getBookListByCategory(String category) {
		List<Book> booksByCategory = bookRepository.getBookListByCategory(category);
		return booksByCategory;
	}
	
	public Book getBookById(String bookId) {
		Book bookById = bookRepository.getBookById(bookId);
		return bookById;
	}
	
	public void setNewBook(Book book) {
		bookRepository.setNewBook(book);
	}
}
