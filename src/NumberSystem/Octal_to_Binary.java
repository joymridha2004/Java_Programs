package NumberSystem;

import static java.lang.Math.pow;

public class Octal_to_Binary {
    public static void main(String[] args) {
        int Octal = 12345;
        int dec = Oct_To_Bin(Octal);
        String Binary = String.valueOf(dec_to_Bi(dec));
        System.out.println(Binary);
    }

    private static int Oct_To_Bin(int octal) {
        int i = 0;
        int dec = 0;
        while (octal != 0) {
            dec = dec + (octal % 10) * (int) pow(8, i);
            octal /= 10;
            i++;
        }
        return dec;
    }

    private static String dec_to_Bi(int Dec) {
        String Binary = "";
        while (Dec != 0) {
            Binary = Binary + Dec % 2;
            Dec /= 2;
        }
        Binary = String.valueOf(Reverse_String(Binary));
        return Binary;
    }

    private static String Reverse_String(String bi) {
        String nstr = "";
        char ch;
        for (int i = 0; i < bi.length(); i++) {
            ch = bi.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }
        return nstr;
    }
}
