package NumberSystem;

import static java.lang.Math.pow;

public class Octal_to_Decimal {
    public static void main(String[] args) {
        int Octal = 12345;
        int dec = Oct_To_Dec(Octal);
        System.out.println(dec);
    }

    private static int Oct_To_Dec(int octal) {
        int i = 0;
        int dec = 0;
        while (octal != 0) {
            dec = dec + (octal % 10) * (int) pow(8, i);
            octal /= 10;
            i++;
        }
        return dec;
    }
}
