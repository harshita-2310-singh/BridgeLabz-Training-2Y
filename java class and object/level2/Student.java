package com.bridgelabz.oops.levelone;

public class Student {
		    String name;
		    int rollNumber;
		    double marks;
		    public String calculateGrade() {
		        if (marks >= 90) {
		            return "A+";
		        } else if (marks >= 80) {
		            return "A";
		        } else if (marks >= 70) {
		            return "B";
		        } else if (marks >= 60) {
		            return "C";
		        } else if (marks >= 50) {
		            return "D";
		        } else {
		            return "F (Fail)";
		        }
		    }
		    public void displayDetails() {
		        System.out.println("Student Name: " + name);
		        System.out.println("Roll Number: " + rollNumber);
		        System.out.println("Marks: " + marks);
		        System.out.println("Grade: " + calculateGrade());
		    }
		    public static void main(String[] args) {
		        Student student = new Student();
		        student.name = "Ananya Sharma";
		        student.rollNumber = 101;
		        student.marks = 87.5;

		        student.displayDetails();
		    }
		}
