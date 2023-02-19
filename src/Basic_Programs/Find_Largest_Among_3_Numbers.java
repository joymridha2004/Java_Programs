package Basic_Programs;

import java.util.Scanner;

public class Find_Largest_Among_3_Numbers {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter integer number 2: ");
        num2 = sc.nextInt();
        System.out.print("Enter integer number 3: ");
        num3 = sc.nextInt();
        Find(num1, num2, num3);
        Find2(num1, num2, num3);
    }

    private static void Find(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println("Number 1 integer is largest here: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2 integer is largest here: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Number 3 integer is largest here: " + num3);
        } else if (num2 == num3 && num1 > num2) {
            System.out.println("Number 1 integer is largest here: " + num1);
        } else if (num1 == num3 && num2 > num3) {
            System.out.println("Number 2 integer is largest here: " + num2);
        } else if (num1 == num2 && num3 > num2) {
            System.out.println("Number 3 integer is largest here: " + num3);
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("All value are some");
        }
    }

    private static void Find2(int num1, int num2, int num3) {
        System.out.println(num3 > (num1 > num2 ? num1 : num2) ? num3 : (num1 > num2 ? num1 : num2) + " is Biggest number here");
    }

}
