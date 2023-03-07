package Basic_Programs;

import java.util.Scanner;

public class Add_Two_Binary_Strings {
    public static void main(String[] args) {
        String num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary integer number 1: ");
        num1 = sc.nextLine();
        System.out.print("Enter binary integer number 2: ");
        num2 = sc.nextLine();
        System.out.println("Adding two number: "+binary_To_Decimal(num1, num2));
    }

    private static  String binary_To_Decimal(String x, String y) {
        int num1 = Integer.parseInt(x,2);
        int num2 = Integer.parseInt(y,2);

        int sum = num1 + num2;

        return Integer.toBinaryString(sum);
    }
}
