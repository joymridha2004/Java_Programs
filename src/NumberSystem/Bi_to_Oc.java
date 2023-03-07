package NumberSystem;

public class Bi_to_Oc {
    public static void main(String[] args) {
        String num = "100111";
        int Dec = Integer.parseInt(num, 2);
        int octal = dec_to_octal(Dec);
        System.out.println(octal);
    }

    private static int dec_to_octal(int Dec) {
        int octal = 0;
        while (Dec != 0) {
            octal = octal * 10 + (Dec % 8);
            Dec /= 8;
        }
        octal = Reverse_Number(octal);
        return octal;
    }

    private static int Reverse_Number(int octal) {
        int rev = 0;
        while (octal != 0) {
            rev = rev * 10 + (octal % 10);
            octal /= 10;
        }
        return rev;
    }
}
