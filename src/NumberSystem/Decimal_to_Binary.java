package NumberSystem;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        int Dec = 13311;
        String Binary = String.valueOf(dec_to_Bi(Dec));
        System.out.println(Binary);
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
