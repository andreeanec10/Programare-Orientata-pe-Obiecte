package lab2.schelet.Four.src.com.oop_pub.constructori_referinte;
import java.io.*;
import java.util.*;

public class Book{
    private String title;
    private String author;
    private int year;

   // public Book(){
        //this.title = "Titlu";
        //this.author = "Autor";
        //this.year = 0;
    //}

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString(Book book) {
        return "Title:" + book.title + " " +
                "Author:"+ book.author + " " +
                "Year:" + book.year;
        //return null;
    }
}