package Basic_Programs;

import java.util.Scanner;

public class Find_Sum_of_Fibonacci_Series_Numbers_of_First_N_Even_Indexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter integer: ");
        num = sc.nextInt();
        int a = 0, b = 1;
        int sum = 0;
        if (num < 0) {
            System.out.println("Incorrect number ");
        } else if (num == 0 || num == 1) {
            System.out.println(sum);
        } else {
            for (int i = 2; i <= num * 2 + 1; i++) {
                int temp = a + b;
                a = b;
                b = temp;
                if (i % 2 != 0) {
                    sum += a;
                }
            }
            System.out.println(sum);
        }
    }
}
