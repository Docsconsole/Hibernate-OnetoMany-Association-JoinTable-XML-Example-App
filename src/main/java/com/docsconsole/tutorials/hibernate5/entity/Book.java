package com.docsconsole.tutorials.hibernate5.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter

public class Book {

	public Book() {
	}

	public Book( String bookName, Double bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	private Long bookId;
	private String bookName;
	private Double bookPrice;



}