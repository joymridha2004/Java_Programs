class NegativeExe extends Exception {
    public String toString() {
        return "Radius cannot be negative!";
    }

    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

class Throw_And_Throws {
    public static Float area(int r) throws NegativeExe {
        if (r < 0) {
            throw new NegativeExe();
        }
        return (float) (Math.PI + r + r);
    }

    public static int div(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {

        try {
            System.out.println(div(8, 0));
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(area(-1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
