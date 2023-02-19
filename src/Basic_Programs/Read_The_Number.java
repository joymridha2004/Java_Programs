package Basic_Programs;

import java.util.Scanner;

public class Read_The_Number {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        num = sc.nextInt();
        System.out.println("Your integer is: " + num);
    }
}
