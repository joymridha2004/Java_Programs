package Pattern_Programs;

import java.util.Scanner;

public class Downward_Triangle_Star_Pattern {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter the number of line: "));
        num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
