import java.util.Scanner;

public class task2 {
    public static int sum(int[] array, int n) {
        if (n <= 0) return 0;
        return sum(array, n - 1) + array[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(sum(array, n));

        scanner.close();
    }
}
/*
     time and space complexity also O(n). The function processes one array element
     in each recursive call and each element is visited one time

     */