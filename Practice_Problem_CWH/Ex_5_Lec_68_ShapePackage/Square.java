package Practice_Problem_CWH.Ex_5_Lec_68_ShapePackage;
// package shape;

public class Square extends Shape {
    Square(int side) {
        super(side, -1);
    }

    int perimeter() {
        return 4 * this.dim1;
    }

    int area() {
        return this.dim1 * this.dim1;
    }

    public static void main(String[] args) {
        System.out.println(".......This is a square.......");
        Square sq = new Square(10);
        System.out.println("The area of Square = " + sq.area());
        System.out.println("The perimeter of Square = " + sq.perimeter());

    }
}