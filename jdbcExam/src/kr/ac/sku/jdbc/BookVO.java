package kr.ac.sku.jdbc;

public class BookVO {
	private int bookNo;
	private String title;
	private String author;
	private String regDate;
	
	@Override
	public String toString() {
		return "BookVO [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", regDate=" + regDate + "]";
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
}
