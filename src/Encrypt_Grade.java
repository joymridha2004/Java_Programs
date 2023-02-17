import java.util.Scanner;

public class Encrypt_Grade {
    public static void main(String[] args) {
        char grade = 'A';
        System.out.print("After your Grade (Encrypt): ");
        grade = (char) (grade + 8);
        System.out.println(grade);
        System.out.print("Before your Grade (Decrypt): ");
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}
