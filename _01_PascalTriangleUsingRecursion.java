import java.util.Scanner;

public class _01_PascalTriangleUsingRecursion {

    public static void main(String[] args) {

        System.out.println("Program to print Pascal`s Triangle using Recursion");

        // Program:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows to be in Pascal`s triangle");
        int noOfRows = sc.nextInt();

        for (int i = 0; i <= noOfRows - 1; i++) {

            // print blank space before the number
            for (int j = 0; j < noOfRows - i; j++) {

                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {

                int result = triangleUsingRecursion(i, k);
                System.out.print(result + "   ");       // it prints the blank space after the number
            }
            // changing the row
            System.out.println();
        }

    }

    public static int triangleUsingRecursion(int i, int j) {

        // base condition
        if (j == 0 || j == i)
            return 1;

        // recursive call
        int prev = triangleUsingRecursion(i - 1, j - 1);
        int next = triangleUsingRecursion(i - 1, j);
        return prev + next;
    }
}
