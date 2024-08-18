package Practice_Problem_CWH.Ex_5_Lec_68_ShapePackage;
// package shape;

class Circle extends Shape {
Circle(int r)
{
    super(r, -1);
}

    double area() {
        return Math.PI * this.dim1 * this.dim1;
    }

    double circumference() {
        return Math.PI * 2 * this.dim1;
    }
    public static void main(String[] args) {
        System.out.println(".......This is a circle.......");
        Circle sq = new Circle(12);
        System.out.println("The area of circle = " + sq.area());
        System.out.println("The perimeter of Square = " + sq.circumference());

    }
}
