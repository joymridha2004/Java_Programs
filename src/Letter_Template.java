import java.util.Scanner;

public class Letter_Template {
    public static void main(String[] args) {
        String name = new String();
        System.out.println("Enter your name :");
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Dear "+name+", Thanks a lot");
        System.out.println("Have a good day");
    }
}
