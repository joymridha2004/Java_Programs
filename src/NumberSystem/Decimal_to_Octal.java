package NumberSystem;

public class Decimal_to_Octal {
    public static void main(String[] args) {
        int Dec = 3407816;
        System.out.println(dec_to_octal(Dec));
    }

    private static String dec_to_octal(int Dec) {
        String Octal = "";
        while (Dec != 0) {
            Octal = Octal + Dec % 8;
            Dec /= 8;
        }
        Octal = String.valueOf(Reverse_String(Octal));
        return Octal;
    }

    private static String Reverse_String(String octal) {
        String nstr = "";
        char ch;
        for (int i = 0; i < octal.length(); i++) {
            ch = octal.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }
        return nstr;
    }
}
