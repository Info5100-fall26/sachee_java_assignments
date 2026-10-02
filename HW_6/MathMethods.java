package edu.neu.mgen;


public class MathMethods {
    public static void main(String[] args) {
        //Math class methods
        int x = 10, y = 25;
        System.out.println("Maximum of x and y: " + Math.max(x, y));
        System.out.println("Minimum of x and y: " + Math.min(x, y));
        System.out.println("Square root of x: " + Math.sqrt(x));
        System.out.println("Result of x power y: " + Math.pow(x, y));
        System.out.println("Natural logarithm of x: " + Math.log(x));
        System.out.println("Decimal logarithm of x: " + Math.log10(x));
        System.out.println("Natural logarithm of (x+1): " + Math.log1p(x));
        System.out.println("Exponent of x: " + Math.exp(x));
        System.out.println("Inverse exponent of x: " + Math.expm1(x));
        
    }
}
