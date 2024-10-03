/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1;

/**
 *
 * @author caleb
 */
import java.util.Scanner;
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many users would you like to input? ");
        int numberOfUsers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create arrays to store user information
        String[] fullNames = new String[numberOfUsers];
        int[] ages = new int[numberOfUsers];
        double[] weights = new double[numberOfUsers];
        double[] heights = new double[numberOfUsers];
        double[] bmis = new double[numberOfUsers];

        // Input user Information
        for (int i = 0; i < numberOfUsers; i++) {
            System.out.println("Enter details for User " + (i + 1) + ":");

            System.out.print("Enter full name: ");
            fullNames[i] = scanner.nextLine();

            System.out.print("Enter age: ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter weight (kg): ");
            weights[i] = scanner.nextDouble();

            System.out.print("Enter height (meters): ");
            heights[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Calculate BMI
            bmis[i] = weights[i] / (heights[i] * heights[i]);
        }

        // Display data in tabular format
        System.out.println("\nUser Data Table:");
        System.out.printf("%-20s %-5s %-10s %-10s %-10s%n", "Full Name", "Age", "Weight (kg)", "Height (m)", "BMI");

        for (int i = 0; i < numberOfUsers; i++) {
            System.out.printf("%-20s %-5d %-10.2f %-10.2f %-10.2f%n", fullNames[i], ages[i], weights[i], heights[i], bmis[i]);
        }

        scanner.close(); // Close the scanner  }
    }
}
