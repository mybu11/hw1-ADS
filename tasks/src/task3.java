import java.util.Scanner;

public class task3 {

    /*time space complexity O(n). funtion makes one recursive call for each exponent from n to 0.
    */
    public static int power(int b, int n) {
        if (n == 0) return 1;
        return b * power(b, n - 1);
    }

    public static int sum(int b, int n) {
        if (n == 0) return 1;
        return sum(b, n - 1) + power(b, n);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println( sum(b, n));

        scanner.close();
    }
}