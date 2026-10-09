package edu.neu.mgen;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab1 {
    public static void main(String[] args) {
    //Part 1
    System.out.println("Lab 1 part 1 - Array");
    
    int[] x = {1, 36, 5, 55, 10};
    int[] y = {2, 25, 71, 9, 80};

    //Created array of length 5
    int[] z = new int[5];

    //Finding max of x and y
    for( int i = 0; i <5; i++) {
        z[i] = Math.max(x[i], y[i]);
    }

    System.out.println("\n");

    System.out.println("Array x = " + Arrays.toString(x));

    System.out.println("\n");

    System.out.println("Array y = " + Arrays.toString(y));

    System.out.println("\n");

    System.out.println("Array z = x + y = " + Arrays.toString(z));

    System.out.println("\n");

    
    //Part 2
    System.out.println("Lab 1 part 2 - ArrayList");

    ArrayList<String> names = new ArrayList<>();
    names.add("Jonathan");
    names.add("Samantha");
    names.add("John");
    names.add("Lucy");
    names.add("Katy");

    ArrayList<String> switchedNames = new ArrayList<>();
    for (String name : names) {
        //Swap first and last character of the name
        String swap = name.substring(name.length() - 1) + name.substring(1, name.length() - 1) + name.substring(0, 1);

        //Maintain the case of the first character and convert the rest to lowercase
        switchedNames.add(swap.substring(0, 1).toUpperCase() + swap.substring(1).toLowerCase());
    }

        System.out.println("\n");

        System.out.println("Names = { " + String.join(", ", names) + " }");

        System.out.println("\n");

        System.out.println("Names (switched) = { " + String.join(", ", switchedNames) + " }");
    }
}

    

