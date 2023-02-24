package Pattern_Programs;

import java.util.Scanner;

public class Mirror_Lower_Star_Triangle_Pattern {
    public static void main(String[] args) {
        int line;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of line: ");
        line = sc.nextInt();
        int blank = 0, object = line * 2 + 1;
        for (int i = 1; i <= line * 2; i++) {

            /*------------Find blank space-----------------*/

            if (i <= line) {
                blank = i - 1;
            } else if (i > line + 1) {
                blank--;
            }

            /*------------print blank space-----------------*/

            for (int j = 1; j <= blank; j++) {
                System.out.print(" ");
            }

            /*------------object number count-----------------*/

            if (i <= line) {
                object -= 2;
            } else if (line + 1 == i) {
                object = 1;
            } else {
                object = (i - line) * 2 - 1;
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
