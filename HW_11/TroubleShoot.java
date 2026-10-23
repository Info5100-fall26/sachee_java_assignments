package edu.neu.mgen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TroubleShoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        try {
            System.out.println("Enter a number between 1 and 10: ");
            int number = sc.nextInt();
            if (number < 1 || number > 10) {
                throw new IllegalArgumentException("Number must be between 1 and 10.");
            }
            System.out.println("Thanks! You entered " + number + " which is a valid number.");
            break;
        } catch (InputMismatchException e) {
            System.out.println("That's not a whole number. Please try again.");
            sc.nextLine(); // Clear the invalid input
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        }

        sc.close();
        
    }

}
