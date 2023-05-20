import java.util.Scanner;

public class _01_PascalTriangleUsingIteration {

    public static void main(String[] args) {

        System.out.println("Program to print Pascal`s Triangle using Iteration");

        // Program:
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows to be in Pascal`s triangle");
        int noOfRows = sc.nextInt();

        // Outer loop
        for (int i = 0; i <= noOfRows - 1; i++) {

            // Loop to print blank space
            for (int j = 0; j <= noOfRows - i; j++) {

                System.out.print("  ");
            }

            // printing the coefficients
            for (int k = 0; k <= i; k++) {

                int result = coefficient(i, k);     // calculating the coefficient using nCr

                System.out.print(result + "     ");

            }

            // printing new line
            System.out.println();
        }
    }

    // program to calculate nCr
    public static int coefficient(int n, int r) {

        int nCr = 0;
        nCr = fact(n) / (fact(r) * fact(n - r));

        return nCr;
    }

    public static int fact(int f) {

        if (f <= 1) {

            return 1;
        }

        return f * fact(f - 1);
    }
}
