import java.util.Scanner;

public class Greet_Name {
    public static void main(String[] args) {
        String Name = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        Name = sc.nextLine();
        System.out.println("Hi " + Name + ",Have a good day");
    }
}
