package lab1;

//import lab1.Course;
//import lab1.Student;

import java.util.Arrays;

public class Test{
        public static void main(String[] args){
            int arg = 1;
            //arg = Integer.parseInt(args[0]);

            Course c = new Course();
            c.setTitle("Titlu");
            c.setDescription("NU");
            Student[] stud = new Student[5];
            stud[0] = c.setStudent("Ana",1);
            stud[1] = c.setStudent("Ana",1);
            stud[2] = c.setStudent("Dana",1);
            stud[3] = c.setStudent("Ene",2);
            stud[4] = c.setStudent("Ada",2);

            /*stud[0] = new Student();
            stud[1] = new Student();
            stud[2] = new Student();
            stud[3] = new Student();
            stud[4] = new Student();

            stud[0].setName("Ana");
            stud[0].setYear(1);
            stud[1].setName("Ana");
            stud[1].setYear(1);
            stud[2].setName("Dana");
            stud[2].setYear(1);
            stud[3].setName("Ene");
            stud[3].setYear(2);
            stud[4].setName("Ada");
            stud[4].setYear(2);*/
            c.setStudents(stud);

            /*c.students[1] = new Student();
            c.students[2] = new Student();
            c.students[3] = new Student();
            c.students[4] = new Student();

            c.students[0].name = "Ana";
            c.students[0].year = 1;
            c.students[1].name = "Ana";
            c.students[1].year = 1;
            c.students[2].name = "Dana";
            c.students[2].year = 2;
            c.students[3].name = "Ada";
            c.students[3].year = 1;
            c.students[4].name = "Ene";
            c.students[4].year = 2;
            */
            c.setList(c.filterYear(arg));

            String lista  = Arrays.toString(c.getList());
            System.out.println(lista);

            //System.out.println(c.students[0].equals(c.students[1]));
            //afiseaza false

            //dupa optimizare afiseaza tot false
            System.out.println(c.getStudent(0).equals(c.getStudent(1)));
        }
}
