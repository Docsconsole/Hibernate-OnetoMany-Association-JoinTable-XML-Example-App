package com.docsconsole.tutorials.hibernate5.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class Author {

	public Author() {
	}

	public Author(String authorName) {
		this.authorName = authorName;
	}
	private long authorId;
	private String authorName;
	private Set<Book> Books;

}