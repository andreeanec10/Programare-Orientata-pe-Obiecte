package lab2.schelet.Two.src.com.oop_pub.constructori_referinte;
import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        Student student1 = new Student(42, "Decebal", "Popescu");
        /*
            noi dorim sa facem o copie a obiectului student1, numita student2
            apoi sa modificam copia respectiva
        */
        Student student2 = new Student(student1);
        //student2.Student(student1);
        student2.setName("Cezar");
        student2.setSurname("Ghiu");
        
        /*
            trebuie sa afiseze
            Name: Decebal
            Surname: Popescu
            Student ID: 42
        */
        student1.show();

        /*
            trebuie sa afiseze
            Name: Cezar
            Surname: Ghiu
            Student ID: 42
        */
        student2.show();
    }
}