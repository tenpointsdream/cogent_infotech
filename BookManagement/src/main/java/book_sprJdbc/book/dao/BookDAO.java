package book_sprJdbc.book.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import book_sprJdbc.book.dto.Book;

@Component
public interface BookDAO {

	int create(Book book);

	int update(Book book);

	int delete(int id);

	Book read(int id);

	List<Book> read();
}
