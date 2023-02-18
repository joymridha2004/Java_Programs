class Shape {
    int Dim1, Dim2;

    public Shape(int Dim1, int Dim2) {
        this.Dim1 = Dim1;
        this.Dim2 = Dim2;
    }

    public int getDim1() {
        return Dim1;
    }

    public void setDim1(int dim1) {
        Dim1 = dim1;
    }

    public int getDim2() {
        return Dim2;
    }

    public void setDim2(int dim2) {
        Dim2 = dim2;
    }
}

class Rectangle extends Shape {
    public Rectangle(int Dim1, int Dim2) {
        super(Dim1, Dim2);
    }

    public int area() {
        return this.Dim1 * this.Dim2;
    }
}

class Square extends Shape {
    public Square(int Dim1) {
        super(Dim1, -1);
    }

    public int area() {
        return this.Dim1 * this.Dim1;
    }
}

class Circle extends Shape {
    public Circle(int Dim1) {
        super(Dim1, -1);
    }

    public double area() {
        return Math.PI * this.Dim1 * this.Dim1;
    }
}

class Cylinder extends Shape {
    public Cylinder(int Dim1, int Dim2) {
        super(Dim1, Dim2);
    }

    public double area() {
        return 2 * Math.PI * this.Dim1 * (this.Dim2 + this.Dim1);
    }
}

public class Object_Shape {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(5);
        Square square = new Square(5);
        Cylinder cylinder = new Cylinder(4, 5);

        System.out.println(rectangle.area());
        System.out.println(circle.area());
        System.out.println(square.area());
        System.out.println(cylinder.area());
    }
}

