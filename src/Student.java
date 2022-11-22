import java.util.ArrayList;
import java.util.Scanner;


 class Student {
     String name;
     long admissionNumber;
     int rollNumber;
     String college;

     public Student(String name, long admissionNumber, int rollNumber, String college) {
         this.name = name;
         this.admissionNumber = admissionNumber;
         this.rollNumber = rollNumber;
         this.college = college;
     }
 }

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> studentList = new ArrayList<Student>();
    static void addStudent() {
        System.out.print("Enter Student name:");
        String name = sc.next();
        System.out.print("Enter admission number:");
        long admissionNumber = sc.nextLong();
        System.out.print("Enter roll number:");
        int rollNumber = sc.nextInt();
        System.out.print("Enter college:");
        String college = sc.next();
        Student st = new Student(name,admissionNumber, rollNumber, college);
        studentList.add(st);
        System.out.println("Student Added Successfully");
    }