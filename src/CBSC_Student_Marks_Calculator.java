import java.util.Scanner;

public class CBSC_Student_Marks_Calculator {
    public static void main(String[] args) {

        byte Marks[] = new byte[5];
        Double Marks_Percentage = 0.0;
        Scanner sc = new Scanner(System.in);

        for (byte i = 0; i < 5; i++) {
            System.out.printf("Enter Your Marks Of Subject %d (out of 100):\n", i + 1);

            Marks[i] = sc.nextByte();
            Marks_Percentage += Marks[i];
        }
        System.out.println("Your Marks Percentage is " + Marks_Percentage / 5);
    }
}
