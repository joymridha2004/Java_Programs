package Basic_Programs;

import java.util.Scanner;

public class input_character_is_vowel_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet;
        System.out.print("Enter alphabet: ");
        alphabet = sc.nextLine();
        alphabet = alphabet.toLowerCase();
        if (alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i") || alphabet.equals("o") || alphabet.equals("u")) {
            System.out.println("it is vowel ");
        } else {
            System.out.println("it is not vowel ");
        }
    }
}
