package PractiseCode.Java;

import java.util.*;

//You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their
//CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in
// alphabetical order. If those two students also have the same first name, then order them according to their ID.
// No two students have the same ID.
//Complete the code
/*
4
45 rajiv singh 8
56 riya singh 5
69 rajiv duggal 8
90 avyan singh 5
*/
public class SortUsingComparator
{

    public static void main(String[] args){
        System.out.println("Enter how many record you will pass: after that provide id fname lname cgpa in next line");
        Scanner in = new Scanner(System.in);
        int lineCount = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(lineCount > 0){
            int id = in.nextInt();
            String fname = in.next();
            String lname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, lname, cgpa);
            studentList.add(st);

            lineCount--;
        }

        //If the CGPA of the first object is greater than the second, we are returning a positive value. It can be
        // anyone such as 1, 2, 10.If the age of the first objct is less than the second object, we are returning a
        // negative value, it can be any negative value, and if the age of both objects is equal, we are returning 0.

        //we are using the compareTo() method of String class, which internally provides the comparison logic.

        Comparator<Student> compareByCGPAFNameLName = Comparator
                .comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getFname)
                .thenComparing(Student::getLname);

        Collections.sort(studentList, compareByCGPAFNameLName);

        for(Student st: studentList){
            System.out.println(st.getFname() + " " + st.getLname() + " "+ st.getCgpa());
        }
    }
}

class Student{
    private int id;
    private String fname;
    private String lname;
    private double cgpa;
    public Student(int id, String fname, String lname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public double getCgpa() {
        return cgpa;
    }
}




