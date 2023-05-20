import java.util.HashMap;
import java.util.Scanner;

public class _01_PascalTriangleUsingMemoization {

    public static void main(String[] args) {

        System.out.println("Program to print Pascal`s Triangle using Memoization");

        // Program:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows to be in Pascal`s triangle");
        int noOfRows = sc.nextInt();

        for (int i = 0; i <= noOfRows - 1; i++) {

            for (int j = 0; j <= noOfRows - i; j++) {

                System.out.print("  ");
            }

            for (int k = 0; k <= i; k++) {

                int result = triangleUsingMemoization(i, k);
                System.out.print(result + "    ");
            }
            System.out.println();
        }
    }

    // Defining the memory named cache, because it act as a cache memory
    public static HashMap<Integer, HashMap<Integer, Integer>> cache = new HashMap<>();

    public static int triangleUsingMemoization(int i, int j) {


        if (j == 0 || j == i)
            return 1;

        // checking if the value is already present, if it is present return that value
        if (cache.containsKey(i) && cache.get(i).containsKey(j))
            return cache.get(i).get(j);

            // otherwise calculate it
        else {

            int prev = triangleUsingMemoization(i - 1, j - 1);
            int next = triangleUsingMemoization(i - 1, j);
            int result = prev + next;
            cache.putIfAbsent(i, new HashMap<>());
            cache.get(i).put(j, result);

            if (j == i - 1) {
                cache.get(i).put(j + 1, result);
            }

            return result;
        }
    }

}
