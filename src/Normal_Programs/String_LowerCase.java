package Normal_Programs;

import java.util.Scanner;

public class String_LowerCase {
    public static void main(String[] args) {
        String name = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        name = sc.nextLine();
        name = name.toLowerCase();
        System.out.println(name);
    }
}
