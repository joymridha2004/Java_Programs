import java.util.Scanner;

public class Handling_Specific_Exceptions {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 25;
        arr[2] = 53;
        arr[3] = 42;
        arr[4] = 6;
        System.out.println("Enter Array Index");
        Scanner sc = new Scanner(System.in);
        int Index = sc.nextInt();
        System.out.println("Enter Dived Number");
        int Number = sc.nextInt();
        try {
            System.out.println("ans: " + arr[Index] / Number);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
