package Basic_Programs;

import java.util.Scanner;

public class Calculate_Compound_Interest {
    public static void main(String[] args) {
        float principal_amount, rate, time;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        principal_amount = sc.nextFloat();
        System.out.print("Enter rate: ");
        rate = sc.nextFloat();
        System.out.print("Enter Time: ");
        time = sc.nextFloat();
        double CI = principal_amount *
                (Math.pow((1 + rate / 100), time));
        System.out.println("Your interest is: " + CI);
    }
}
