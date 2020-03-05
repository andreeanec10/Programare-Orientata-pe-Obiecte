package lab2.schelet.Four.src.com.oop_pub.constructori_referinte;
//import java.awt.print.Book;
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Book b1 = new Book("Morometii", "Marin Preda", 1955);
        System.out.println(b1.toString(b1));

        Book b2 = new Book("Levantul", "Mircea Cărtărescu", 1990);
        System.out.println(b2.toString(b2));
    }
}