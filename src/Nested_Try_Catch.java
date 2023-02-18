import java.util.Scanner;

public class Nested_Try_Catch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 25;
        arr[2] = 53;
        arr[3] = 42;
        arr[4] = 6;

        boolean flag = true;

        while (flag) {
            System.out.println();
            System.out.println("Enter Array Index");
            Scanner sc = new Scanner(System.in);
            int Index = sc.nextInt();
            System.out.println("Enter Dived Number");
            int Number = sc.nextInt();
            try {
                try {
                    try {
                        System.out.println("Ans: " + arr[Index] / Number);
                        flag = false;
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e);
                    }
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println();
        System.out.println("------------Thanks------------");
    }
}
