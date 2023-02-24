package Pattern_Programs;

import java.util.Scanner;

public class Pyramid_Number_Pattern {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter the number of line: "));
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int blank = num - i;
            int object = i * 2 - 1;
            int value = i - 1;
            int flag = 0;
            for (int j = 1; j <= blank; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= object; j++) {
                if (value < object && flag == 0) {
                    System.out.print(++value);

                } else {
                    flag = 1;
                    System.out.print(--value);
                }
            }
            System.out.println();
        }
    }
}
