package edu.neu.mgen;

import java.util.Scanner;

/**
 * Hello world! 
 * 
 */
public class App
{
    /* 
    This is my first Java Assignment 
    This is the main class of the program
    */
    public static void main( String[] args )
    {
        //Print the below statement
        System.out.println( "It is my first Java program" );
        
        //Declare and initialize variables
        int int1 = 200 , int2 = 150;
        long long1 = 400000L , long2 = 300000L; 
        double d1 = 40.5 , d2 = 30.5;
        boolean b1 = true, b2 = false;
        char c1 = 'S' , c2 = 'N'; 

        //Convert int to long
        long intLong1 = int1;
        long intLong2 = int2;
        
        //Convert long to int
        int longInt1 = (int) long1;
        int longInt2 = (int) long2;
        
        System.out.print("\n");

        //Printing data type values
        System.out.println("Different variables values");
        System.out.println("Integer values:" + int1 + "," + int2 );
        System.out.println("Long values:" + long1 + "," + long2 );
        System.out.println("Double values:" + d1 + "," + d2 );
        System.out.println("Boolean values:" + b1 + "," + b2 );
        System.out.println("Char values:" + c1 + "," + c2 );

        System.out.print("\n");

        //Typecasting results
        System.out.println("Converted int to long:");
        System.out.println(int1 + "->" +intLong1);
        System.out.println(int2 + "->" +intLong2);
        System.out.print("\n");
        System.out.println("Converted long to int");
        System.out.println(long1 + "->" +longInt1);
        System.out.println(long2 + "->" +longInt2);

        //Taking input from terminal
        Scanner sc = new Scanner(System.in);

        System.out.print("\n");

        System.out.println("Enter two integer values");
        int1 = sc.nextInt();
        int2 = sc.nextInt();

        System.out.print("\n");
        
        System.out.println("Enter two long values");
        long1 = sc.nextLong();
        long2 = sc.nextLong();

        System.out.print("\n");
        
        System.out.println("Enter two double values");
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();

        System.out.print("\n");
        
        System.out.println("Enter two boolean values");
        b1 = sc.nextBoolean();
        b2 = sc.nextBoolean();

        System.out.print("\n");
        
        System.out.println("Enter two char values");
        c1 = sc.next().charAt(0);
        c2 = sc.next().charAt(0);

        System.out.print("\n");

        //Arithmetic operations on integers
        int sum = int1 + int2;
        int difference = int1 - int2;
        int product = int1 * int2;
        if (int2 !=0) {
            int intDiv = int1 / int2;
            int remainder = int1 % int2;
            System.out.println("Division of two integers:" +intDiv);
            System.out.println("Remainder of two integers:" +remainder);
        } else {
            System.out.println("Division by zero is not allowed");
        }
        
        System.out.println("Sum of two integers:" +sum);
        System.out.println("Difference of two integers:" +difference);
        System.out.println("Product of two integers:" +product);

        System.out.print("\n");

        //Arithmetic operations on long
        long sumLong = long1 + long2;
        long diffLong = long1 - long2;
        long productLong = long1 * long2;
        if (long2 !=0) {
            long divLong = long1 / long2;
            long remainderLong = long1 % long2;
            System.out.println("Division of two longs:" +divLong);
            System.out.println("Remainder of two longs:" +remainderLong);
        } else {
            System.out.println("Division by zero is not allowed");
        }

        System.out.println("Sum of two longs:" +sumLong);
        System.out.println("Difference of two longs:" +diffLong);
        System.out.println("Product of two longs:" +productLong);

        System.out.print("\n");

        //Aithmetic operations on double
        double sumDouble = d1 + d2;
        double diffDouble = d1 - d2;
        double productDouble = d1 * d2;
        if (d2 !=0) {
            double divDouble = d1 / d2;
            double remainderDouble = d1 % d2;
            System.out.println("Division of two doubles20:" +divDouble);
            System.out.println("Remainder of two doubles:" +remainderDouble);
        } else {
            System.out.println("Division by zero is not allowed");
        }

        System.out.println("Sum of two doubles:" +sumDouble);
        System.out.println("Difference of two doubles:" +diffDouble);
        System.out.println("Product of two doubles:" +productDouble);

        System.out.print("\n");

        //Arithmetic operations on char
        int charAdd = (char) (c1 + c2);
        int charSub = (char) (c1 - c2);
        char charIncre1 = (char) (++c1);
        char charDecr1 = c1 = (char) (--c1);
        char charIncre2 = (char) (++c2);
        char charDecr2 = c2 = (char) (--c2);

        System.out.println("Addition of two chars:" +charAdd);
        System.out.println("Subtraction of two chars:" +charSub);
        System.out.println("Increment of first char:" +charIncre1);
        System.out.println("Decrement of first char:" +charDecr1);
        System.out.println("Increment of second char:" +charIncre2);
        System.out.println("Decrement of second char:" +charDecr2);
        
        System.out.print("\n");

        //Logical operations on boolean
        boolean andResult = b1 && b2;
        boolean orResult = b1 || b2;
        boolean notResult1 = !b1;
        boolean notResult2 = !b2;

        System.out.println("AND of two booleans:" +andResult);
        System.out.println("OR of two booleans:" +orResult);
        System.out.println("NOT of first boolean:" +notResult1);
        System.out.println("NOT of second boolean:" +notResult2);
        
        sc.close();
    }
}