package librarymanager;

import java.io.Serializable;

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	private String isbn;
	private String title;
	private String author;
	private String category;
	private int totalCopies;
	private int availableCopies;
	private int year;

	public Book(String isbn, String title, String author, String category, int totalCopies, int year) {
		this.isbn = isbn.trim();
		this.title = title.trim();
		this.author = author.trim();
		this.category = category.trim();
		this.totalCopies = totalCopies;
		this.availableCopies = totalCopies;
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
		this.title = title.trim();
	}

	public void setAuthor(String author) {
		this.author = author.trim();
	}

	public void setCategory(String category) {
		this.category = category.trim();
	}

	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
		if (availableCopies > totalCopies) {
			availableCopies = totalCopies;
		}
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isAvailable() {
		return availableCopies > 0;
	}

	@Override
	public String toString() {
		return "ISBN: " + isbn + ", Title: " + title + ", Author: " + author + ", Category: " + category + ", Year: "
				+ year + ", Total: " + totalCopies + ", Available: " + availableCopies;
	}
}
