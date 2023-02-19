package Basic_Programs;

class ComplexNumber {
    int real, image;

    public ComplexNumber(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public void ShowC() {
        System.out.print(this.real + " +i" + this.image);
    }

    public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {

        ComplexNumber res = new ComplexNumber(0, 0);

        res.real = n1.real + n2.real;

        res.image = n1.image + n2.image;

        return res;
    }
}

public class Add_Two_Complex_Numbers {
    public static void main(String[] args) {

        ComplexNumber complexNumber1 = new ComplexNumber(4, 5);
        ComplexNumber complexNumber2 = new ComplexNumber(10, 5);

        System.out.print("first Complex number: ");
        complexNumber1.ShowC();

        System.out.print("\nSecond Complex number: ");
        complexNumber2.ShowC();

        ComplexNumber res = ComplexNumber.add(complexNumber1, complexNumber2);

        System.out.println("\nAddition is :");
        res.ShowC();
    }
}
