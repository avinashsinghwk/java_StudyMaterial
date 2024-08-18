package Practice_Problem_CWH.Ex_5_Lec_68_ShapePackage;
// package shape;

class Sphere extends Shape {
    Sphere(int r) {
        super(r, -1);
    }

    double area() {
        return 4 * Math.PI * this.dim1 * this.dim1;
    }

    double volume() {
        return ((double) 4 / 3) * Math.PI * this.dim1 * this.dim1 * this.dim1;
    }

    public static void main(String[] args) {
        System.out.println(".......This is a sphere.......");
        Sphere sq = new Sphere(5);
        System.out.println("The surface area of Sphere = " + sq.area());
        System.out.println("The volume of Sphere = " + sq.volume());

    }
}