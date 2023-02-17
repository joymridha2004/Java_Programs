import java.util.Scanner;

public class Tax_Calculate {
    public static void main(String[] args) {
        Float tax = 0.0f, income;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        income = sc.nextFloat();
        if (income <= 250000) {
            tax = tax + 0.0f;
        } else if (income > 250000 && income <= 500000) {
            tax = tax + 0.05f * (income - 250000f);
        } else if (income > 500000 && income <= 1000000) {
            tax = tax + 0.05f * (500000f - 250000f);
            tax = tax + 0.2f * (income - 500000f);
        } else if (income > 1000000) {
            tax = tax + 0.05f * (500000f - 250000f);
            tax = tax + 0.2f * (1000000f - 500000f);
            tax = tax + 0.3f * (income - 1000000f);
        }
        System.out.println("Your Tax is : " + tax);

    }
}
