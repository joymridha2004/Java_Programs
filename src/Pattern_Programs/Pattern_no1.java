package Pattern_Programs;

import java.util.Scanner;

public class Pattern_no1 {
    public static void main(String[] args) {
        int line;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter number of line: ");
        line = sc.nextInt();
        int count = line - 2;
        for (int i = 1; i <= line; i++) {
            int blank = 0, object = 0;

            /*------------Find blank space-----------------*/

            if (i < line / 2 + 1) {
                blank = (line / 2 + 1) - i;
            } else if (i > line / 2 + 1) {
                blank = i - (line / 2 + 1);
            }

            /*------------print blank space-----------------*/

            if (i != (line / 2 + 1)) {
                for (int j = 1; j <= blank; j++) {
                    System.out.print("   ");
                }
            }

            /*------------object number count-----------------*/

            if (i < line / 2 + 1) {
                object = i * 2 - 1;
            } else if (i > line / 2 + 1) {
                object = count;
                count = count - 2;
            } else if (i == line / 2 + 1) {
                object = line;
            }

            /*------------print object-----------------*/

            for (int j = 1; j <= object; j++) {
                if (j % 2 != 0 && i != (line / 2 + 1)) {
                    System.out.print("\\*/");
                } else if (j % 2 == 0 && i != (line / 2 + 1)) {
                    System.out.print("/#\\");
                } else if (j == line / 2 + 1 && i == (line / 2 + 1)) {
                    System.out.print(name.substring(0, 3));
                } else {
                    System.out.print("|#|");
                }
            }

            /*------------print next line-----------------*/

            System.out.println();
        }
    }
}
