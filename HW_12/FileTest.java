package edu.neu.mgen;

import java.io.*;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new FileReader("my_test_file.txt")
        );

        System.out.println(br.readLine());
        br.close();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        FileWriter fw = new FileWriter("my_test_file.txt");
        fw.write(text);
        fw.close();

        System.out.println("File updated successfully");
        sc.close();
    }
}
