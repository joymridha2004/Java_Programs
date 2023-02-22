package Basic_Programs;

import java.util.Scanner;

public class Perimeter_of_a_Rectangle {
    public static void main(String[] args) {
        double length, width;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of a rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter the length of a rectangle: ");
        width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("This rectangle perimeter is: " + perimeter);
    }
}
