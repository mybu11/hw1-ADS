import java.util.Scanner;

public class task1 {

    /* O(n) in time and space complexity. The fuction makes one recursive call for each number
    fron N to 0. then the running time grows linearly with N
     */
    public static int sumOfSquares(int n) {
        if (n <= 0) return 0;
        return sumOfSquares(n - 1) + n * n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(sumOfSquares(n));

        scanner.close();
    }
}