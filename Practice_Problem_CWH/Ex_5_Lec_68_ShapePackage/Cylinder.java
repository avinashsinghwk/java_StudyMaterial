package Practice_Problem_CWH.Ex_5_Lec_68_ShapePackage;
// package shape;

class Cylinder extends Shape {
    Cylinder(int r, int h) {
        super(r, h);
    }

    double volume() {
        return Math.PI * this.dim1 * this.dim1 * this.dim2;
    }

    double area() {
        return 2 * Math.PI * this.dim1 * (this.dim1 + this.dim2);
    }

    public static void main(String[] args) {
        System.out.println(".......This is a cylinder.......");
        Cylinder sq = new Cylinder(2, 10);
        System.out.println("The surface area of Cylinder = " + sq.area());
        System.out.println("The volume of Cylinder = " + sq.volume());
    }
}