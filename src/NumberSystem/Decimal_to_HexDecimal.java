package NumberSystem;

public class Decimal_to_HexDecimal {
    public static void main(String[] args) {
        int Dec = 64;
        String HexDec = dec_to_HexaDec(Dec);
        System.out.println(HexDec);
    }

    private static String dec_to_HexaDec(int dec) {
        String HexDec = "";
        while (dec != 0) {
            HexDec = HexDec + Remainder(dec % 16);
            dec /= 16;
        }
        HexDec = String.valueOf(Reverse_String(HexDec));
        return HexDec;
    }

    private static String Reverse_String(String HexDec) {
        String nstr = "";
        char ch;
        for (int i = 0; i < HexDec.length(); i++) {
            ch = HexDec.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }
        return nstr;
    }

    private static String Remainder(int i) {
        switch (i) {
            case 0 -> {
                return "0";
            }
            case 1 -> {
                return "1";
            }
            case 2 -> {
                return "2";
            }
            case 3 -> {
                return "3";
            }
            case 4 -> {
                return "4";
            }
            case 5 -> {
                return "5";
            }
            case 6 -> {
                return "6";
            }
            case 7 -> {
                return "7";
            }
            case 8 -> {
                return "8";
            }
            case 9 -> {
                return "9";
            }
            case 10 -> {
                return "A";
            }
            case 11 -> {
                return "B";
            }
            case 12 -> {
                return "C";
            }
            case 13 -> {
                return "D";
            }
            case 14 -> {
                return "E";
            }
            case 15 -> {
                return "F";
            }
        }
        return "";
    }
}
