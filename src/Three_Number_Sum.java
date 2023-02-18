import java.util.Scanner;

public class Three_Number_Sum {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        for (byte i = 0; i < 3; i++) {
            System.out.println("Enter The Number " + i + " :");
            num += sc.nextInt();
        }
        System.out.println("Sum of three number is :" + num);
    }
}
