import java.util.Scanner;

public class task4 {
    /*
     O(n). function reads one number in each recursive call and shows it while returning
     from recursion
     */

    public static void reverse(int n, Scanner scanner) {
        if (n == 0) return;

        int number = scanner.nextInt();
        reverse(n - 1, scanner);

        System.out.print(number + " ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        reverse(n, scanner);

        scanner.close();
    }
}