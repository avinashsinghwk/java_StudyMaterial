package Practice_Problem_CWH;

// Question 1 and 2
// class Cylinder{
//     private int radius;
//     private int height;

//     public void setRadius(int r){
//         this.radius = r;
//     }
//     public void setHeight(int h){
//         this.height = h;
//     }
//     public int getRadius(){
//         return radius;
//     }
//     public int getHeight(){
//         return height;
//     }
//     public double Volume(){
//         double volume;
//         volume = 3.142 * radius * radius * height;
//         return volume;
//     }
//     public double SurfaceArea(){
//         double surfaceArea;
//         surfaceArea = 2 * 3.142 * radius * radius + 2 * 3.142 * radius * height;
//         return surfaceArea;
//     }
// }

// Question 3.
// class Cylinder1{
//      private int radius, height ;
//      public Cylinder1(int r, int h)
//      {
//         this.height = h;
//         this.radius = r;
//      }
//      public void printCylinder()
//      {
//         System.out.println("The Cylinder is of radius " + radius + " m and height " + height + " m");
//      }
// }

// Question 4
// class Rectangle{
//     private int length ;
//     private int breadth;

//     public int getLength(){
//         return length;
//     }
//     public int getBreadth(){
//         return breadth;
//     }

//     public Rectangle(){
//         this.length = 4;
//         this.breadth = 5;
//     }
//     public Rectangle(int l, int b){
//         this.breadth = b;
//         this.length = l;
//     }
// }

// Question 5
// class Sphere{
//     private int radius;

//     public void setRadius(int r){
//         this.radius = r;
//     }
//     public int getRadius(){
//         return radius;
//     }
// }

public class Ps_9_Lec_44 {
    public static void main(String[] args) {
        System.out.println("In this lecture we will be solving practice problem 9");
        // Question 1. Create a class Cylinder and use getters and setters to set it's radius and height
        // Cylinder C = new Cylinder();
        // C.setRadius(9);
        // C.setHeight(12);
        // System.out.println("The Radius of Cylinder: "+ C.getRadius());
        // System.out.println("The Height of Cylinder: "+ C.getHeight());

        // Question 2. Use Q-1 to calculate surface area and volume of the Cylinder
        // System.out.println("The Volume of the Cylinder = "+ C.Volume());
        // System.out.println("The SurfaceArea of the Cylinder = "+ C.SurfaceArea());

        // Question 3. Use a contructor and repeat Q-1
        // Cylinder1 c = new Cylinder1(34, 88);
        // c.printCylinder();

        // Question 4. Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters 
        // Rectangle R = new Rectangle();
        // Rectangle R2 = new Rectangle(6,8);

        // System.out.println(R.getLength());
        // System.out.println(R.getBreadth());

        // System.out.println(R2.getLength());
        // System.out.println(R2.getBreadth());
        
        // Question 5. Repeat Q-1 for a Sphere
        // Sphere Sp = new Sphere();
        // Sp.setRadius(5);
        // System.out.println("The Radius of Sphere is "+Sp.getRadius());
    }
    
}
