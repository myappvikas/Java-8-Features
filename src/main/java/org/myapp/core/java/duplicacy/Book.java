package org.myapp.core.java.duplicacy;

class Book {

	public int bookId;
	public String bookName;

	public Book(String bookName, int bookId) {
		this.bookId = bookId;
		this.bookName = bookName;
	}

	@Override
	public int hashCode() {
		//System.out.println("hashCode method called");
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		//System.out.println("equals method called");
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		Book other = (Book) obj;
		if (bookId != other.bookId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookId=" + bookId + "]";
	}
}
