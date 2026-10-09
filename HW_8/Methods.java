package edu.neu.mgen;

public class Methods {

    public static String[] inverseArray(String[] original) {

        String[] inverse = new String[original.length];

        //Looping through the original array in reverse order
        for (int i = 0; i < original.length; i++) {
            String word = original[original.length - 1 - i];
            String reversed = "";

            // Reverse each word
            for (int j = word.length() - 1; j >= 0; j--) {
                reversed = reversed + word.charAt(j);
            }

            //First character to uppercase and the rest to lowercase
            reversed = reversed.substring(0, 1).toUpperCase()
                    + reversed.substring(1).toLowerCase();

            inverse[i] = reversed;
        }

        return inverse;
    }

    public static void printArray(String[] resultant) {

        for (int i = 0; i < resultant.length; i++) {
            System.out.println("\"" + resultant[i] + "\"");
        }

        System.out.println("End of the array");
    }

    public static void main(String[] args) {
        String[] array1 = {"Anne", "John", "Alex", "Jessica"};
        String[] array2 = {"Sun", "Mercury", "Venis", "Earth", "Mars", "Jupiter"};

        System.out.println("Array 1");
        System.out.println("Original array:");
        System.out.println("\n");
        printArray(array1);
        System.out.println("\n");
        System.out.println("=========");
        System.out.println("\n");

        System.out.println("Resultant array:");
        System.out.println("\n");
        printArray(inverseArray(array1));

        System.out.println("\n");
    
        System.out.println("Array 2");
        System.out.println("Original array:");
        System.out.println("\n");
        printArray(array2);
        System.out.println();
        System.out.println("=========");
        System.out.println("\n");

        System.out.println("Resultant array:");
        System.out.println("\n");
        printArray(inverseArray(array2));
    }
}