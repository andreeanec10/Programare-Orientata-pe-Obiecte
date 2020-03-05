import javax.swing.event.TreeExpansionEvent;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class Test {
    public static void main(String args[]) {
        ArrayList <Student> studenti = new ArrayList<>();
        Student ob1 = new Student(1, "Ana", "Gherasim", 8.0F);
        Student ob2 = new Student(2, "Marius", "Gherghe", 8.0F);
        Student ob3 = new Student(3, "Alin", "Acucu", 5.5F);
        Student ob4 = new Student(4, "Vasile", "Vancea", 9.5F);
        Student ob5 = new Student(5, "Anton", "Ilie", 5.5F);
        studenti.add(ob1);
        studenti.add(ob2);
        studenti.add(ob3);
        studenti.add(ob4);
        studenti.add(ob5);
        System.out.println("~1 & 2~");
        Collections.sort(studenti);
        for (Student s: studenti ) {
            System.out.println(s);
        }

        System.out.println("\n~3~");
        PriorityQueue <Student> pq = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Long.compare(o1.getId(), o2.getId());
            }
        });
        pq.addAll(studenti);
        for (Student s: pq ) {
            System.out.println(s);
        }


        System.out.println("\n~4~");
        HashMap <Student, LinkedList<String>> col = new HashMap<>();
        LinkedList <String> materii = new LinkedList<>();
        materii.add("Mate");
        materii.add("Poo");
        materii.add("aa");
        col.put(ob1, materii);
        materii.add("fc");
        col.put(ob2, materii);
        col.entrySet().forEach(studentLinkedListEntry -> {System.out.println(studentLinkedListEntry.getKey()
                + " " + studentLinkedListEntry.getValue());});

        System.out.println("\n~5 si 6~");
        NumerePare nr = new NumerePare();
        nr.add(5);
        nr.add(4);
        nr.add(9);
        nr.add(2);
        nr.add(5);
        LinkedHashSet<Integer> test = new LinkedHashSet<>();
        test.add(1);
        test.add(10);
        test.add(3);
        test.add(12);
        test.add(5);
        nr.addAll(test);
        System.out.println(nr);
    }
}
