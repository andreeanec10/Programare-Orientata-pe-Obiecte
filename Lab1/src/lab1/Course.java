package lab1;
//import lab1.Student;

public class Course {
    private String title;
    private String description;
    private Student[] students = new Student[5];
    private Student[] list = new Student[5];

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student[] getList() {
        return list;
    }

    public void setList(Student[] list) {
        this.list = list;
    }

    public Student getStudent(int i) {
        return students[i];
    }

    public Student setStudent(String name, int year){
        Student stud = new Student();
        stud.setName(name);
        stud.setYear(year);
        return stud;
    }

    public Student[] setStudents(Student[] students) {
        this.students = students;
        return this.students;
    }


    public Student[] filterYear (int year ) {
        int  i, j = 0;
        for( i = 0; i < students.length ; i++)
            if(students[i].getYear() == year) {
                list[j] = students[i];
                j++;
            }
        return list;
    }
}
