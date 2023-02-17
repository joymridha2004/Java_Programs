import java.util.Scanner;

public class Kilometer_to_Meter {
    public static void main(String[] args) {
        double KiloMeter = 0.0, Meter = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length Of Distance in Kilometer :");
        KiloMeter = sc.nextDouble();
        Meter = KiloMeter * 1000;
        System.out.println("After Convert Distance KiloMeter to Meter is : " + Meter);
    }
}
