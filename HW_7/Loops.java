package edu.neu.mgen;

public class Loops {
    public static void main(String[] args) {
        int[][] A = {{2, 3, 4}, {3, 4, 5}};
        int[][] B = {{1, 2}, {3, 4}, {5, 6}};

        //Check if matrices can be multiplied
        if (A[0].length != B.length) {
            System.out.println("Matrices cannot be multiplied");
            return;
        }
         int[][] C = new int[A.length][B[0].length];

            //Multiply matrices
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < A[0].length; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            //Print result of matrix multiplication
            System.out.println("Result of A * B = ");
            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < C[0].length; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
      
    }
}
