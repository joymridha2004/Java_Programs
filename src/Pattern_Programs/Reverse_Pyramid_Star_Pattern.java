package Pattern_Programs;

import java.util.Scanner;

public class Reverse_Pyramid_Star_Pattern {
    public static void main(String[] args) {
        int num, object;
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter the number of line: "));
        num = sc.nextInt();
        object = num * 2 + 1;
        int blank = 1;
        for (int i = 1; i <= num; i++) {
            object -= 2;
            blank = i - blank;
            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= object; j++) {
                System.out.print("*");
            }
            blank = 1;
            System.out.println();
        }
    }
}
