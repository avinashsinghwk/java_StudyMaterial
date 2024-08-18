package Practice_Problem_CWH.Ex_5_Lec_68_ShapePackage;
// package shape;

class Rectangle extends Shape {
    Rectangle(int l, int b) {
        super(l, b);
    }

    int perimeter() {
        return 2 * (this.dim1 + this.dim2);
    }

    int area() {
        return this.dim1 * this.dim2;
    }

    public static void main(String[] args) {
        System.out.println(".......This is a rectangle.......");
        Rectangle r = new Rectangle(5, 8);
        System.out.println("The area of Square = " + r.area());
        System.out.println("The perimeter of Square = " + r.perimeter());
    }
}