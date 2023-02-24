package Pattern_Programs;

import java.util.Scanner;

public class Mirror_Upper_Star_Triangle_Pattern {
    public static void main(String[] args) {
        int line;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of line: ");
        line = sc.nextInt();
        int count = line * 2 - 2;
        for (int i = 1; i <= line * 2; i++) {
            int blank = 0, object = 0;

            /*------------Find blank space-----------------*/

            if (i < line) {
                blank = (line) - i;
            } else if (i > line + 1) {
                blank = i - line - 1;
            }

            /*------------print blank space-----------------*/

            for (int j = 1; j <= blank; j++) {
                System.out.print(" ");
            }

            /*------------object number count-----------------*/

            if (i < line) {
                object = i * 2 - 1;
            } else if (i > line + 1) {
                object = count;
                count = count - 2;
            } else if (i == line || i == line + 1) {
                object = line * 2 - 1;
            }

            /*------------print object-----------------*/

            for (int j = 1; j <= object; j++) {
                if (j % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            /*------------print next line-----------------*/

            System.out.println();
        }
    }
}
