package NumberSystem;

import java.util.Locale;

import static java.lang.Math.pow;

public class HexDec_to_Decimal {
    public static void main(String[] args) {
        String HexDec = "1234ab";
        HexDec = HexDec.toUpperCase(Locale.of(HexDec));
        int dec = HexDe_To_Dec(HexDec);
        System.out.println(dec);
    }

    private static int HexDe_To_Dec(String Hede) {
        int i = 0;
        int dec = 0;
        while (Hede.length() != 0) {
            dec = dec + Remainder1(String.valueOf(Hede.charAt(Hede.length() - 1))) * (int) pow(16, i);
            if (Hede.length() != 0) {
                Hede = Hede.substring(0, Hede.length() - 1);
                i++;
            }

        }
        return dec;
    }

    private static int Remainder1(String i) {
        switch (i) {
            case "0" -> {
                return 0;
            }
            case "1" -> {
                return 1;
            }
            case "2" -> {
                return 2;
            }
            case "3" -> {
                return 3;
            }
            case "4" -> {
                return 4;
            }
            case "5" -> {
                return 5;
            }
            case "6" -> {
                return 6;
            }
            case "7" -> {
                return 7;
            }
            case "8" -> {
                return 8;
            }
            case "9" -> {
                return 9;
            }
            case "A" -> {
                return 10;
            }
            case "B" -> {
                return 11;
            }
            case "C" -> {
                return 12;
            }
            case "D" -> {
                return 13;
            }
            case "E" -> {
                return 14;
            }
            case "F" -> {
                return 15;
            }
        }
        return 0;
    }
}
