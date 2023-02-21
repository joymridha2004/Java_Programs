package Basic_Programs;

import java.util.Scanner;

public class Find_LCM_of_2_Number {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter integer number 2: ");
        num2 = sc.nextInt();
        System.out.println("LCM of " + num1 + " and " + num2
                + " is " + LCM(num1, num2));
    }

    static int GCD(int num1, int num2) {
        if (num1 == 0)
            return num2;
        return GCD(num2 % num1, num1);
    }

    static int LCM(int num1, int num2) {
        return (num1 / GCD(num1, num2)) * num2;
    }
}