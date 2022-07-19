package PractiseCode.Java.Arrays;

// Java program to demonstrate working of Comparatorinterface
import java.util.*;
import java.lang.*;


// Driver class
class sortUsingComparator {
    public static void main(String[] args)
    {
        Student[] studentObjArr = { new Student(151, "Rajiv", "london"),
                new Student(131, "Avyan", "nyc"),
                new Student(161, "Praveen", "jaipur") };

        System.out.println("Unsorted");
        for (int i = 0; i < studentObjArr.length; i++)
            System.out.println(studentObjArr[i]);

        //Arrays.sort(studentObjArr, new Sortbyrollno());
        //OR
        Comparator<Student> sortbyRollnoComparator = Comparator.comparing(Student::getRollno);
        Arrays.sort(studentObjArr, sortbyRollnoComparator);

        System.out.println("\nSorted by rollno");
        for (int i = 0; i < studentObjArr.length; i++)
            System.out.println(studentObjArr[i]);


        //Arrays.sort(studentObjArr, new SortbyName());
        //OR
        Comparator<Student> sortbyNameComparator = Comparator.comparing(Student::getName);
        Arrays.sort(studentObjArr, sortbyNameComparator);

        System.out.println("\nSorted by Name");
        for (int i = 0; i < studentObjArr.length; i++)
            System.out.println(studentObjArr[i]);
    }
}



// A class to represent a student.
class Student {
    private int rollno;
    private String name, address;

    // Constructor
    public Student(int rollno, String name,
                   String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " "
                + this.name + " "
                + this.address;
    }
}


class Sortbyrollno implements Comparator<Student> {

    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return a.getRollno() - b.getRollno();
    }
}


class SortbyName implements Comparator<Student> {

    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        //Ascending
        return a.getName().compareTo(b.getName());

        //Descending
        //return b.getName().compareTo(a.getName());
    }
}



