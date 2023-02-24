package Pattern_Programs;

import java.util.Scanner;

public class Left_Triangle_Star_Pattern {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter the number of line: "));
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int blank = num - i;
            for (int j = 1; j <= blank; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
