package com.company;

import com.company.task1.*;
import com.company.task2.MyMatrix;
import com.company.task2.MyVector3;
import com.company.task2.Sumabil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Student  implements  Comparable<Student>{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Main {
    public static int addall(Collection<? extends Sumabil> ceva) {
        int sum = 0;
        for (Sumabil it : ceva) {
            sum += it.sum();//System.out.println(it.toString());
        }
        return sum;
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();

        myHashMap.put(new Integer(1), "Andrei");

        System.out.println(myHashMap.get(1));

        MyHashMap<Student, String> myHashMap1 = new MyHashMap<Student, String>();

        myHashMap1.put(new Student("Ionut"), "Busy");

        System.out.println(myHashMap1.get(new Student("anann")));
        Collection<Sumabil> ceva = new ArrayList<Sumabil>();
        //MyMatrix mat = new MyMatrix();
        MyVector3 vect = new MyVector3();
        vect.vector.add(6);
        vect.vector.add(9);
        vect.vector.add(10);
        MyVector3 vect1 = new MyVector3();
        vect1.vector.add(6);
        vect1.vector.add(9);
        vect1.vector.add(10);
        //System.out.println(addall(ceva));
        vect.addValue(vect1);
        //ceva.add(mat);
        //
        ceva.add(vect);
        System.out.println(addall(ceva));

    }
}
