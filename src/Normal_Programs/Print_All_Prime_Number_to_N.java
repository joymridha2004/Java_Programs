package Normal_Programs;

import java.util.Scanner;

public class Print_All_Prime_Number_to_N {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        num = sc.nextInt();
        Prime(num);
    }

    private static void Prime(int num) {
        int i, count;
        for (int j = 2; j <= num; j++) {
            count = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2) System.out.print(j + "  ");
        }
    }
}

