package Basic_Programs;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter integer: ");
        num = sc.nextInt();
        String snum = num + "";
        int power = snum.length();
        int temp = num;
        int armstrong = 0;
        while (temp != 0) {
            armstrong += (int) Math.pow(temp % 10, power);
            temp /= 10;
        }
        if (num == armstrong) {
            System.out.println(num + " it is a armstrong number");
        } else {
            System.out.println(num + " this is not armstrong number");
        }
    }
}
