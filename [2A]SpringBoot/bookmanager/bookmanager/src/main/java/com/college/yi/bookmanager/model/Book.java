package com.college.yi.bookmanager.model;

import java.time.LocalDate;

public class Book {
	private String id; //ID
	private String title; //タイトル
	private String author; //筆者
	private String publisher; //出版社
	private LocalDate publishedDate; //出版日
	private int stock; //在庫数
	
	// 引数なしコンストラクタ
	public Book() {
		id = null;
		title = null;
		author = null;
		publisher = null;
		publishedDate = null;
		stock = -1;
	}
	
	// 全フィールド指定コンストラクタ
	public Book(String id, String title, String author, String publisher, LocalDate publicationDate, int stockQuantity) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishedDate = publicationDate;
		this.stock = stockQuantity;
	}
	
	// idのゲッターとセッター
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	// titleのゲッターとセッター
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	// authorのゲッターとセッター
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// publisherのゲッターとセッター
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// publicationDateのゲッターとセッター
	public LocalDate getPublicationDate() {
		return publishedDate;
	}
	public void setPublicationDate(LocalDate publicationDate) {
		this.publishedDate = publicationDate;
	}
	
	// stockQuantityのゲッターとセッター
	public int getStockQuantity() {
		return stock;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stock = stockQuantity;
	}

}
