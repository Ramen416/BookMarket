package com.bookmarket.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bookmarket.domain.Book;
import com.springmvc.exception.BookIdException;

@Repository
public class BookRepositoryImpl implements BookRepository {
	
	@Override
	public List<Book> getAllBookList() {
		// TODO Auto-generated method stub
		return listOfBooks;
	}
	
	public List<Book> getBookListByCategory(String category) {
		List<Book> booksByCategory = new ArrayList<Book>();
		for (int i=0;i<listOfBooks.size(); i++) {
			Book book = listOfBooks.get(i);
			if (category.equalsIgnoreCase(book.getCategory()))
				booksByCategory.add(book);
		}
		return booksByCategory;
	}
	
	public Book getBookById(String bookId) {
		Book bookInfo = null;
		for (int i=0; i<listOfBooks.size(); i++) {
			Book book = listOfBooks.get(i);
			if (book != null && book.getBookId() != null && book.getBookId().equals(bookId)) {
				bookInfo = book;
				break;
			}
		}
		if (bookInfo == null) {
			throw new IllegalArgumentException("도서 ID가"+bookId+"인 도서를 찾을 수 없습니다.");
		
		}
		
		if(bookInfo == null)
			throw new BookIdException(bookId);
		
		return bookInfo;
	}
	
	private List<Book> listOfBooks = new ArrayList<Book>();
	
	public BookRepositoryImpl() {
		Book book1 = new Book("ISBN1234", "소문", 12000);
		book1.setAuthor("히로유키");
		book1.setDescription("한밤중 시부야에 뉴욕에서 온 살인마 레인맨이 나타나서 소녀들을 죽이고 발목을 잘라 간대. 그것도 양쪽 발목을 다! 그치만 뮈리엘 로즈를 뿌리면괜찮대. 진짜라니까.. ");
		book1.setPublisher("A출판사");
		book1.setCategory("미스테리");
		book1.setUnitsInStock(1000);
		book1.setReleaseDate("2018/04/15");
		
		Book book2 = new Book("ISBN1235", "Snow Blind", 15000);
		book2.setAuthor("라그나르 오나슨");
		book2.setDescription("새하얀 눈밭에서 발견된 반라의 시체! 톱니바퀴처럼 엮인 3개의 미스테리 사건! 그 누구도 결말을 예측할수 없다.. ");
		book2.setPublisher("B출판사");
		book2.setCategory("추리");
		book2.setUnitsInStock(1000);
		book2.setReleaseDate("2020/12/04");
		
		Book book3 = new Book("ISBN1236", "어나더", 13000);
		book3.setAuthor("아야츠키 유히토");
		book3.setDescription("설명 추가 예정 ");
		book3.setPublisher("인스미디어");
		book3.setCategory("호러");
		book3.setUnitsInStock(1000);
		book3.setReleaseDate("2021/06/29");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
		
		
		
	}
	
	public void setNewBook(Book book) {
		listOfBooks.add(book);
	}
	
	

}
