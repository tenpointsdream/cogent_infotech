package pkg.codingChallenge;

import java.util.List;

interface BookDAO {
	void add(List<Object> books, Object book);
	void print(List<Object> books);
	void find(List<Object> books, int id);
	void update(List<Object> books, int id);
	void delete(List<Object> books, int id);
}
