package Basic_Programs;

import java.util.Scanner;

public class Check_Even_or_Odd_Integers {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer number: ");
        num = sc.nextInt();
        Check(num);
    }

    private static void Check(int num) {
        if (num % 2 == 0) {
            System.out.println("integer number is even");
        } else {
            System.out.println("integer number is odd");
        }
    }
}
