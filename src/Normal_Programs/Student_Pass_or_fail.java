package Normal_Programs;

import java.util.Scanner;

public class Student_Pass_or_fail {
    public static void main(String[] args) {
        byte Marks[] = new byte[5];
        Double Total_Marks = 0.0;
        Scanner sc = new Scanner(System.in);
        for (byte i = 0; i < 5; i++) {
            System.out.println("Enter Your Marks of Subject (out of 100)" + i);
            Marks[i] = sc.nextByte();
            if (Marks[i] > 33) {
                Total_Marks += Marks[i];
            } else {
                System.out.println("Fail");
                return;
            }
        }
        if (Total_Marks / 5 > 40) {
            System.out.println("Pass");
            System.out.println("Your Percentage is :" + Total_Marks / 5);
            return;
        }
        System.out.println("Fail");
        System.out.println("Your Percentage is :" + Total_Marks / 5);
    }
}
