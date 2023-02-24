package Pattern_Programs;

import java.util.Scanner;

public class Square_Star_Pattern {
    public static void main(String[] args) {
        int Row, column;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Row: ");
        Row = sc.nextInt();
        System.out.print("Enter number of Column: ");
        column = sc.nextInt();
        for (int i = 1; i <= Row; i++) {
            System.out.print("*");
            for (int j = 1; j < column - 1; j++) {
                if (i == 1 || i == Row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
}
