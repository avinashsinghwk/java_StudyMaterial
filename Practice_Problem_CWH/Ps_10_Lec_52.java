package Practice_Problem_CWH;

// Question 1 and 3

// class Circle
// {
// int radius;
// public int area()
// {
//     return 3 * radius * radius;
// }
// public Circle(int r)
// {
//     this.radius = r;
// }
// }

// class Cylinder extends Circle
// {
// int height;
// public int volume()
// {
//     return 3 * radius * radius * height ;
// }
// public Cylinder(int r, int h)
// {
//     super(r);
//     this.height = h;
// }
// }

// Question 2 and 4

// class Rectangle
// {
//     int breadth, length;
//     public void setBreadthLength(int b, int l)
//     {
//         this.breadth = b;
//         this.length = l;
//     }
//     public int getBreadth()
//     {
//         return this.breadth;
//     }
//     public int getLength()
//     {
//         return this.length;
//     }
//     public int area()
//     {
//         return this.length * this.breadth;
//     }
// }

// class Cuboid extends Rectangle
// {
//     int height;
//     public void setHeight(int h)
//     {
//         this.height = h;
//     }
//     public int volume()
//     {
//         return this.height * getBreadth() * getLength() ;
//     }
// }

public class Ps_10_Lec_52 {
    public static void main(String[] args) {
        System.out.println("In this lecture i will be solving practice problem 10");

        // Question 1. Create a class Circle and use inheritance to create another class Cylinder form it
        // Circle Ci = new Circle(2);
        // System.out.println("The area of the Circle by making the object of the class Circle = " + Ci.area());
        // Cylinder C = new Cylinder(3,8);
        // System.out.println("The area of the Circle by changing radius by making the object of the class Cylinder = " + C.area());
        // System.out.println("The volume of the Cylinder = " + C.volume());

        // Question 2. Create a class Rectangle and use inheritance to create another class Cuboid. Try to keep it as close to real world scenario as possible
        // Rectangle R = new Rectangle();
        // R.setBreadthLength(3, 5);
        // System.out.println("The area of Rectangle from Rectangle class Object = " + R.area());
        // Cuboid C = new Cuboid();
        // C.setBreadthLength(5, 6);
        // C.setHeight(8);
        // System.out.println("The volume of Cuboid after changing length and breadth form making Cuboid class Object = " + C.volume());

        // Question 3. Create methods for area and volume in Q - 1
        // Already solved in Q - 1

        // Question 4. Create methods for area & volume in Q - 2. Also create getters and setters 
        // Already solved in Q - 2

        // Question 5. What is the order of constructor execution for the following inheritance hierarchy: Base -> Derived1 -> Derived2
        // Derived 2 obj = new Derived2();
        // Which constructors will be executed & in what order ?

        // First, constructor of the Base class will be executed having no parameters and then constructor of the Derived1 class will be executed with no parameters and then constructor of the Derived2 class will executed

    }
}
