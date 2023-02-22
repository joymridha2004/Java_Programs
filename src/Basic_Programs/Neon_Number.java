package Basic_Programs;

import java.util.Scanner;

public class Neon_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter integer: ");
        num = sc.nextInt();
        int temp = (int) Math.pow(num, 2);
        int neon = 0;
        while (temp != 0) {
            neon += temp % 10;
            temp /= 10;
        }
        if (num == neon) {
            System.out.println(num + " it is a neon number");
        } else {
            System.out.println(num + " this is not neon number");
        }
    }
}
