package dupli;

import java.util.Scanner;

public class KirtanMatrix{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of rows in the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns in the first matrix: ");
        int cols1 = scanner.nextInt();


        System.out.print("Enter the number of rows in the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns in the second matrix: ");
        int cols2 = scanner.nextInt();


        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Error: Matrices must have the same dimensions for addition.");
            return;
        }


        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] sumMatrix = new int[rows1][cols1];


        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Enter element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                matrix1[i][j] = scanner.nextInt();
            }
        }


        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Enter element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the matrices:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
