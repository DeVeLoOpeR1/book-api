package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BookRepositary {

    //using hashmap for the data storage
    HashMap<String,Book> bookdb;
    HashMap<String,Author> authordb;
    public BookRepositary(){
        bookdb =  new HashMap<>();
        authordb = new HashMap<>();
    }

    public String addBook(Book book)
    {
        bookdb.put(book.getBookName(),book);
        return "book is successfully added to database";
    }
    public String addAuthor(Author author){

        authordb.put(author.getAuthorName(),author);
        return "author is successfully added to database";
    }
    public String bookName(){
        int maxPages = 0;
        String bookName = null;
        for(String name : bookdb.keySet()){
            int pages = bookdb.get(name).getNoOfPages();
            if(maxPages < pages){
                maxPages = pages;
                bookName = bookdb.get(name).getBookName();
            }

        }
        return bookName;

    }
    public String updatePages(String bookName ,int pages) {

        bookdb.get(bookName).setNoOfPages(pages);
        return "pages updated suceessfully";

    }
    public Author highestNoPagesBook(){
        int maxPages = 0;
        Author author = null;
        for(String name : authordb.keySet()){
            int pages = authordb.get(name).getNoOfPages();
            if(maxPages < pages){
                maxPages = pages;
                author = authordb.get(name);
            }

        }
        return author;
    }

}
