package Basic_Programs;

import java.util.Scanner;

public class Find_Factorial_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter integer: ");
        num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(num + " this number factorial is: " + fact);
    }
}
