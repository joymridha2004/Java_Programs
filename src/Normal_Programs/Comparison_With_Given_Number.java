package Normal_Programs;

import java.util.Scanner;

public class Comparison_With_Given_Number {
    public static void main(String[] args) {
        int Given_Num = 0, Num = 45;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        Given_Num = sc.nextInt();
        if (Given_Num > Num) {
            System.out.println("Grater Number");
        } else {
            System.out.println("Laser Number");
        }


    }
}
