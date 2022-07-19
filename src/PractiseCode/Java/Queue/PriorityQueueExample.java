package PractiseCode.Java.Queue;


import java.util.*;

class Student{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public double getCgpa(){
        return this.cgpa;
    }
}

class Priorities{
    public ArrayList<Student> getStudents(List<String> events)
    {
        int n = events.size();

        PriorityQueue<Student> pq = new PriorityQueue<>(
                Comparator.comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId));

        for(String i:events)
        {
            String[] s = new String[4];
            s = i.split(" ");
            if(s.length > 1)
            {
                pq.add(new Student(Integer.valueOf(s[3]), s[1], Double.valueOf(s[2])));
            }
            else
            {
                pq.poll();
            }
        }
        while(pq.size()>1)
        {
            System.out.println(pq.poll().getName());
        }
        return new ArrayList<Student>(pq);
    }
}


public class PriorityQueueExample {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

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
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
