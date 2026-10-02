package edu.neu.mgen;
import java.util.ArrayList;

public class HomeworkFive {
    public static void main(String[] args) {
        //Part 1 : String operations
        String str = "Oakland";
        System.out.println("Length of the string : " + str.length());
        System.out.println("Character at index 2 : " +str.charAt(2));
        System.out.println("Susbtring of the string : " + str.substring(3, 7));
        System.out.println("Uppercase of the string : " + str.toUpperCase());

        System.out.println("\n");

        //Part 2 : Array operations
        int[] abc = {1, 3, 5, 2, 5};
        System.out.println("Length of the array : " +abc.length);
        System.out.println("Last member of the array :" + abc[abc.length - 1]);

        System.out.println("\n");

        //Part 3 : ArrayList creation and its operations
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Austin");
        cities.add("Houston");
        cities.add("Oakland");
        cities.add("Paris");
        cities.add("San Francisco");
        cities.add("Seattle");
        System.out.println("Cities in the ArrayList: " + cities);
        //Remove Paris from the ArrayList cities
        cities.remove(3);
        System.out.println("Cities in the ArrayList after removing Paris: " + cities);
            
    }
}