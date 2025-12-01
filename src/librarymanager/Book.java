package librarymanager;

import java.io.Serializable;

public class Book implements Serializable {

	private String isbn;
	private String title;
	private String author;
	private String category;
	private int totalCopies;
	private int availableCopies;
	private int year;

	public Book(String isbn, String title, String author, String category, int totalCopies, int availableCopies,
			int year) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.category = category;
		this.totalCopies = totalCopies;
		this.availableCopies = availableCopies;
		this.year = year;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCategory() {
		return category;
	}

	public int getTotalCopies() {
		return totalCopies;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public int getYear() {
		return year;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "ISBN: " + isbn + ", Title: " + title + ", Author: " + author + ", Category: " + category + ", Year: "
				+ year + ", Total: " + totalCopies + ", Available: " + availableCopies;
	}
}
