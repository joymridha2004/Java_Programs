package Pattern_Programs;

import java.util.Scanner;

public class Diamond_Shape_Star_Pattern {
    public static void main(String[] args) {
        int line;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of line: ");
        line = sc.nextInt();
        int object = line * 2 + 1;
        int count = 1;
        for (int i = 1; i < line * 2; i++) {
            int blank = 0;

            /*------------Find blank space-----------------*/

            if (i < line) {
                blank = line - i;
            } else if (i > line) {
                blank = count;
                count++;
            }

            /*------------print blank space-----------------*/

                for (int j = 1; j <= blank; j++) {
                    System.out.print(" ");
                }

            /*------------object number count-----------------*/

            if (i < line) {
                object = i * 2 - 1;
            } else if (i > line) {
                object = object - 2;
            } else if (i == line) {
                object = line * 2 - 1;
            }

            /*------------print object-----------------*/

            for (int j = 1; j <= object; j++) {
                System.out.print("*");
            }

            /*------------print next line-----------------*/

            System.out.println();
        }
    }
}
