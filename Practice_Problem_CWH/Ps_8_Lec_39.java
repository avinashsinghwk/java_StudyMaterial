package Practice_Problem_CWH;


// Question 1.
// class Employee{
//     int salary;
//     String name;
//     int getSalary(){
//         return salary;
//     }
//     void setName(String n){
//         this.name = n;
//     }
//     void getName(){
//         System.out.println("My name is " + name);
//     }
// }

// Question 2.
// class CellPhone{
//     void ringing(){
//         System.out.println("Your phone is ringing");
//     }
//     void vibrating(){
//         System.out.println("Your phone is vibrating");
//     }
// }

// Question 3.
// class Square{
//     int side;
//     int area(){
//         return side * side;
//     }
//     int perimeter(){
//         return 4 * side;
//     }  
// }

// Question 4.
// class Rectangle{
//     int length;
//     int breadth;
//     int area(){
//         return length * breadth;
//     }
//     int perimeter(){
//         return 2 * (length + breadth);
//     }
// }

// Question 5.
// class TommyVecetti{
//     public void hit(){
//         System.out.println("Hitting...");
//     }
//     public void run(){
//         System.out.println("Running...");
//     }
//     public void fire(){
//         System.out.println("Firing...");
//     }
// }

// Question 6.
// class Circle{
//     float radius;
//     float circumference(){
//         return 2 * (float) Math.PI * radius;
//     }
//     float area(){
//         return (float) Math.PI * radius * radius;
//     }
// }


public class Ps_8_Lec_39 {
    public static void main(String[] args) {
        System.out.println("In this lecture we will be solving practice problem 8");

        /*  Question 1. Create a class Employee with following properties and methods:
        a> Salary(porperty)(int)
        b> getSalary(method retruning int)
        c> name(property)(String)
        d> getName(method retruning string)
        e> setName(method changing name)
        */
        // Employee info = new Employee();
        // info.setName("Avinash Singh");
        // info.salary = 900;
        // info.getName();
        // System.out.println("My salary is " + info.getSalary());

        // Question 2. Create a class cellphone with methods to print "ringing...", "vibrating..." etc
        // CellPhone cell = new CellPhone();
        // cell.ringing();
        // cell.vibrating();

        // Question 3. Create a class square with a method to initialize its side , calcualting area , perimeter etc.
        // Square sq = new Square();
        // sq.side = 6;
        // System.out.println("The area is " + sq.area());
        // System.out.println("The perimeter is " + sq.perimeter());
        
        // Question 4. Create a class Rectangle & repeat 3
        // Rectangle R = new Rectangle();
        // R.length = 5;
        // R.breadth = 3;
        // System.out.println("The area is " + R.area());
        // System.out.println("The perimeter is " + R.perimeter());
        
        // Question 5. Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting), running, firing etc.
        // TommyVecetti game = new TommyVecetti();
        // game.hit();
        // game.run();
        // game.fire();

        // Question 6. Repeat 4 for a circle
        // Circle c = new Circle();
        // c.radius = 5;
        // System.out.println("The circumference = " + c.circumference());
        // System.out.println("The area is " + c.area());
        
    }
}
