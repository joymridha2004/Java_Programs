package Basic_Programs;

import java.util.Scanner;

public class Calculate_Simple_Interest {
    public static void main(String[] args) {
        float principal_amount, rate, time;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        principal_amount = sc.nextFloat();
        System.out.print("Enter rate: ");
        rate = sc.nextFloat();
        System.out.print("Enter Time: ");
        time = sc.nextFloat();
        System.out.println("Your interest is: " + (principal_amount * rate * time) / 100);
    }
}
