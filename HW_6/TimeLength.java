package edu.neu.mgen;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;


public class TimeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any word: ");
        LocalTime startTime = LocalTime.now();
        String word = sc.nextLine();
        LocalTime endTime = LocalTime.now();

        if(word.isEmpty()) {
            System.out.println("You entered an empty line. Please reenter");
        }
        else {
            int length = word.length();
            long reactionTime = Duration.between(startTime, endTime).toSeconds();

            String classification;
            if(length <= 5) {
                classification = "short";
            } else if(length > 5 && length < 10) {
                classification = "medium";
            } else {
                classification = "long";    
            }

            System.out.println("Your word is " +word);
            System.out.println("It is a "+ classification+ " word");
            System.out.println("The length of the word is " +length);
            System.out.println("Your reaction time is " + reactionTime + " seconds");

            sc.close();

        }
    }
}
