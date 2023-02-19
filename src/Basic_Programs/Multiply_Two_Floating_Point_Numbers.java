package Basic_Programs;

import java.util.Scanner;

public class Multiply_Two_Floating_Point_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two floating number: ");
        System.out.println("Your answer is: "+Multiply(sc.nextFloat(), sc.nextFloat()));
    }

    private static float Multiply(float num1, float num2) {
        return num1 * num2;
    }
}
