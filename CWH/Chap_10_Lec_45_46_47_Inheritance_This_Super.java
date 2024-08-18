package CWH;

// Inheritance
// class Base {
//     public int x;

//     public void setX(int x) {
//         System.out.println("I am in Base and setting x now");
//         this.x = x;
//     }
//     public int getX() {
//         return x;
//     }
// }

// class Derived extends Base {
//     int y;

//     public void setY(int y) {
//         this.y = y;
//     }
//     public int getY() {
//         return y;
//     }
// }

// Quick Quiz
// class Animal {
//     int legs = 4;
//     int eyes = 2;

//     public Animal() {
//         System.out.println("I have 4 legs and 2 eyes");
//     }
// }

// class Dog extends Animal {
//     int tail = 1;
//     int head = 1;

//     public Dog() {
//         System.out.printf("I have %d head and 1 tail", head);
//     }
// }

// From here Lecture - 46 starts (Constructor in Inheritance)

// class Base1 {
//     Base1() {
//         System.out.println("I am a constructor");
//     }
//     Base1(int a) {
//         System.out.println("I am an overloaded constructor with value of a as " + a);
//     }
// }

// class Derived1 extends Base1 {
//    public Derived1() {
//         // super(-9);
//         System.out.println("I am a derived class constructor");
//     }
//    public Derived1(int a, int b){
//         super(a);
//         System.out.println("I am an overloaded derived constructor with value of a = " + a + " and b = " + b );
//     }
// }

// class ChildOfDerived1 extends Derived1{
//     ChildOfDerived1(){
//         System.out.println("I am a childofderived constructor");
//     }
//     ChildOfDerived1(int a, int b, int c){
//         super(a,b);
//         System.out.println("I am an overloaded childofderived constructor with value of c as " + c);
//     }
// }

// From here Lecture - 47 starts (this or super keyword)
// class EkClass{
//     int a;
//     EkClass(int a)
//     {
//         // a = a;      // This will confuse 
//         this.a = a;
//     }
//     public int getA()
//     {
//         return this.a;
//     }
// }

// class DoClass extends EkClass{
//     DoClass(int c)
//     {
//         super(c);
//         System.out.println("I am a constructor of inherited class of EkClass");
//     }
// }

public class Chap_10_Lec_45_46_47_Inheritance_This_Super {
    public static void main(String[] args) {
        System.out.println(
                "In this chapter we will be studying about Inheritance, Super Keyword, Method Overriding and Dynamic Method Dispatch");
      
        // Inheritance
        // Base b = new Base();
        // b.setX(5);
        // System.out.println(b.getX());

        // Derived d = new Derived();
        // d.setX(10);
        // System.out.println(d.getX());
        // d.setY(45);
        // System.out.println(d.getY());

        // Quick Quiz: Create a class animal and inherit a class dog from it
        // Dog Tiger = new Dog();

        // From here Lecture - 46 starts (Constructor in Inheritance)

        // Base1 b1 = new Base1();
        // Base1 b2 = new Base1(21);

        // Derived1 d1 = new Derived1();
        // Derived1 d2 = new Derived1(23,56);

        // ChildOfDerived1 CoD1 = new ChildOfDerived1();
        // ChildOfDerived1 CoD1 = new ChildOfDerived1(33,44,55);

        // From here Lecture - 47 starts (this or super keyword)

        // EkClass e = new EkClass(5);
        // System.out.println(e.getA());
        
        // DoClass d = new DoClass(-1);
        // System.out.println(d.getA());


    }

}