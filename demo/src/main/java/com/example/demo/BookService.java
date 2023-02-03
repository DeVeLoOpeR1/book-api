package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class BookService {

    //GETTING OBJECT OF THE BOOKREPOSITARY CLASSS FROM IOC CONTAINER
   @Autowired
    BookRepositary bookRepositary;

    public String addBook(Book book) {
        return bookRepositary.addBook(book);
    }

    public String addAuthor(Author author) {
        return bookRepositary.addAuthor(author);
    }

    public String bookName() {
        return bookRepositary.bookName();
    }

    public String updatePages(String bookName , int pages) {

        return bookRepositary.updatePages(bookName,pages);
    }
    public Author highestNoPagesBook(){
        return bookRepositary.highestNoPagesBook();
    }
}
