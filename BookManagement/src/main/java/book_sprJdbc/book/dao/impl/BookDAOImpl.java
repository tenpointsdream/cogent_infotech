package book_sprJdbc.book.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import book_sprJdbc.book.dao.BookDAO;
import book_sprJdbc.book.dto.Book;
import book_sprJdbc.book.rowmapper.BookRowMapper;

@Component("bookDAO")
public class BookDAOImpl implements BookDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbcTemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Book book) {
		String query = "insert into book value(?,?,?,?)";
		return jdbcTemplate.update(query, book.getId(), book.getName(), book.getAuthor(), book.getPrice());
	}

	@Override
	public int update(Book book) {
		String query = "update book set name=?, author=?, price=? where id=?";
		return jdbcTemplate.update(query, book.getName(), book.getAuthor(), book.getPrice(), book.getId());
	}

	@Override
	public int delete(int id) {
		String query = "delete from book where id=" + id;
		return jdbcTemplate.update(query);
	}

	@Override
	public Book read(int id) {
		String query = "select * from book where id =?";
		return jdbcTemplate.queryForObject(query, new Object[] { id }, new BookRowMapper());
	}

	@Override
	public List<Book> read() {
		String query = "select * from book";
		return jdbcTemplate.query(query, new BookRowMapper());
	}

}
