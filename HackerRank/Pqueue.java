import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Pqueue {

    static class Student {
        private int id;
        private String name;
        private double CGPA;

        public Student(String name, double cgpa, int id) {
            this.id = id;
            this.name = name;
            this.CGPA = cgpa;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public double getCGPA() {
            return this.CGPA;
        }

    }

    static class Priorities {
        private PriorityQueue<Student> pq = new PriorityQueue<>(
                Comparator.comparing(Student::getCGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId));

        public List<Student> getStudents(List<String> events) {

            for (String hp : events) {
                if (hp.equals("SERVED"))
                    pq.poll();
                else {
                    Scanner sc = new Scanner(hp);
                    sc.next();
                    Student newStd = new Student(sc.next(), sc.nextDouble(), sc.nextInt());
                    pq.add(newStd);
                }
            }

            List<Student> students = new ArrayList<>();
            while (!pq.isEmpty())
                students.add(pq.poll());

            return students;

        }
    }

     class Solution {
        private final static Scanner scan = new Scanner(System.in);
        private final static Priorities priorities = new Priorities();
        //just to keep it pretty
        public static void main(String[] args) {
            int totalEvents = Integer.parseInt(scan.nextLine());
            List<String> events = new ArrayList<>();

            while (totalEvents-- != 0) {
                String event = scan.nextLine();
                events.add(event);
            }

            List<Student> students = priorities.getStudents(events);

            if (students.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                for (Student st : students) {
                    System.out.println(st.getName());
                }
            }
        }
    }
}
