public class Finally_Block {
    public static void main(String[] args) {
        int a = 9, b = 7;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("I am finally value of b = " + b);
            }
            b--;
        }
    }
}
