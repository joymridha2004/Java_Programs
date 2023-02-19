package Basic_Programs;

import java.util.Scanner;

public class Swap_Two_Numbers {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter integer number 2: ");
        num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping :-");
        System.out.println("Number 1 is: " + num1);
        System.out.println("Number 2 is: " + num2);
    }
}
