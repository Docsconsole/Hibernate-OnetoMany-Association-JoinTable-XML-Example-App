package com.docsconsole.tutorials.hibernate5.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
public class AuthorBook {
	public AuthorBook() {
	}

	public AuthorBook(long authorBookId, long authorId, long bookId) {
		this.authorBookId = authorBookId;
		this.authorId = authorId;
		this.bookId = bookId;
	}
	private long authorBookId;
	private long authorId;
	private long bookId;
	private Set<Book> Books;
}