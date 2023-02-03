package com.example.demo;

public class Book {
    private String bookName;
    private int noOfPages;
    private String authorName;

    public Book(String bookName, int noOfPages, String authorName) {
        this.bookName = bookName;
        this.noOfPages = noOfPages;
        this.authorName = authorName;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
