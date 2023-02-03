package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    //making object of the BookService


   @Autowired
   BookService bookService;

    @PostMapping("/add-book")
    public String addBook(@RequestBody Book book)
    {
       return bookService.addBook(book);
    }
    @PostMapping("/add-author")
    public String addAuthor(@RequestBody Author author){
        return bookService.addAuthor(author);
    }

    @GetMapping("/book-name")
    public String bookName(){
        return bookService.bookName();
    }

    @PutMapping("/update-pages")
    public String updatePages(@RequestParam("bookName") String bookName,@RequestParam("pages") int pages){
        return bookService.updatePages(bookName,pages);
    }

    @GetMapping("/highest-no-pages-book")
    public Author highestNoPagesBook(){

        return bookService.highestNoPagesBook();
    }


}
