import java.util.*;
import java.lang.*;

public class Student implements Comparable<Student>{
    private long id;
    private String name;
    private String surname;
    private double averageGrade;

    public Student(long id, String name, String surname, double averageGrade) {
        this.id = id; 
        this.name = name;
        this.surname = surname;
        this.averageGrade = averageGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.averageGrade, averageGrade) == 0 &&
                name.equals(student.name) &&
                surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, averageGrade);
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAverageGrade() {
        return this.averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public int compareTo(Student stud) {
        if (this.averageGrade - stud.getAverageGrade() > 0) {
            return 1;
        }
        if (this.averageGrade - stud.getAverageGrade() < 0) {
            return -1;
        }
        if (this.averageGrade - stud.getAverageGrade() == 0) {
            if (this.surname.compareTo(stud.getSurname()) > 0) {
                return 1;
            }
            if (this.surname.compareTo(stud.getSurname()) < 0) {
                return -1;
            }
            if (this.surname.compareTo(stud.getSurname()) == 0) {
                if (this.name.compareTo(stud.getName()) > 0) {
                    return 1;
                }
                if (this.name.compareTo(stud.getName()) < 0) {
                    return -1;
                }
                if (this.name.compareTo(stud.getName()) == 0) {
                    return 0;
                }
            }
        }
        return 0;
    }

    public String toString() {
        return id + " " + name + " " + surname + " " + averageGrade;
    }
}