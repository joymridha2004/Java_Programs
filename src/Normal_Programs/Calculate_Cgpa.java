package Normal_Programs;

import java.util.Scanner;

public class Calculate_Cgpa {
    public static void main(String[] args) {
        byte Marks[] = new byte[3];
        Double Marks_Cgpa = 0.0;
        Scanner sc = new Scanner(System.in);
        for (byte i = 0; i < 3; i++) {
            System.out.println("Enter your marks of Subject " + i + " :");
            Marks[i] = sc.nextByte();
            Marks_Cgpa += Marks[i];
        }
        System.out.println("Your CGPA is :" + Marks_Cgpa / 30);
    }
}
