/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

public class StudentInformationSystem {

    public static void main(String[] args) {
        // i. Display student name and student ID
        System.out.println("Student Name: John Doe");
        System.out.println("Student ID: S1234567");
        System.out.println("-----------------------------------");

        // ii. Store two marks using variables
        double mark1 = 42.5;
        double mark2 = 38.0;

        // iii. Calculate the total mark
        double totalMark = mark1 + mark2;

        // iv. Display the total
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + totalMark);

        // v. Display a message based on the total
        System.out.print("Result Status: ");
        if (totalMark >= 80) {
            System.out.println("Excellent");
        } else if (totalMark >= 50) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
    }
}