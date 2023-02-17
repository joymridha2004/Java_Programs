import java.util.Scanner;
import java.util.SortedMap;

public class Replace_Space {
    public static void main(String[] args) {
        String name = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        name = sc.nextLine();
        name = name.replace(' ', '_');
        System.out.println(name);
    }
}
