package Pattern_Programs;

import java.util.Scanner;

public class Star_Pascals_Triangle {
    public static void printPascal(int k) {
        for (int line = 1; line <= k; line++) {
            for (int b = 0; b <= k - line; b++) {
                System.out.print(" ");
            }
            int C = 1;
            for (int a = 1; a <= line; a++) {
                System.out.print(C + " ");
                C = C * (line - a) / a;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter the number of line: "));
        num = sc.nextInt();
        printPascal(num);
    }
}
