package Basic_Programs;

import java.util.Scanner;

public class Find_HCF_of_Two_Numbers {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter integer number 2: ");
        num2 = sc.nextInt();
        System.out.println("LCM of " + num1 + " and " + num2
                + " is " + HCF(num1, num2));
    }

    static int HCF(int num1, int num2) {

        if (num1 == 0)
            return num2;
        if (num2 == 0)
            return num1;

        if (num1 == num2)
            return num1;

        if (num1 > num2)
            return HCF(num1 - num2, num2);
        return HCF(num1, num2 - num1);
    }
}
