package com.example.demo;

public class Author {
    private String authorName;
    private int noOfBooks;
    private int noOfPages;

    public Author(String authorName, int noOfBooks, int noOfPages) {
        this.authorName = authorName;
        this.noOfBooks = noOfBooks;
        this.noOfPages = noOfPages;
    }

    public Author() {
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}
