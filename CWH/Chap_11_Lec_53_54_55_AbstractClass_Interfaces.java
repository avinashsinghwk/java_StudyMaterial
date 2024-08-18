package CWH;

// abstract class Parent
// {
//     public Parent()
//     {
//         System.out.println("I am a constructor of Parent class");
//     }
//     public void sayHello()
//     {
//         System.out.println("Hello");
//     }
//     abstract public void greet();
//     abstract public void greet2();
// }

// class Child1 extends Parent
// {
//     @Override
//     public void greet()
//     {
//         System.out.println("Good Morning!");
//     }

//     @Override
//     public void greet2()
//     {
//         System.out.println("Good Afternoon");
//     }
// }

//  abstract class Child2 extends Parent
// {
//     @Override
//     public void greet()
//     {
//         System.out.println("Good NIght");
//     }
// }

// From here Lecture - 55 starts  (interface)

// interface Bicycle
// {
//     int speed = 100;           // you can create properties in interface
//     void applyBrake(int decrement);
//     void speedUp(int increment);
// }
// interface BlowHorn
// {
//     void blowHornBike();
//     void blowHornCar();
// }
// class AvonCycle implements Bicycle, BlowHorn
// {
//     public void applyBrake(int decrement)
//     {
//         System.out.println("Pressing brake......");
//     }
//     public void speedUp(int increment)
//     {
//         System.out.println("Speeding up.......");
//     }
//     public void blowHornBike()
//     {
//         System.out.println("Poo Poo Pee Pee");
//     }
//     public void blowHornCar()
//     {
//         System.out.println("Koi hornwa bajwao");
//     }
// }

public class Chap_11_Lec_53_54_55_AbstractClass_Interfaces {
    public static void main(String[] args) {
        System.out.println("In this lecture i will be learning about Abstract Class / Method, Interfaces");

        // Parent P = new Parent();  // We can not make this, since Parent class is an abstract class i.e not an concrete class

        // Child1 c1 = new Child1(); // We can do this since it is no longer an abstract class

        // Child2 c2 = new Child2();   // This is also not possible because it is also an abstract class

        // Lecture - 54 is all about introduction to interface so ther is no code

        // From here Lecture - 55 starts  (interface)

        // AvonCycle cy = new AvonCycle();
        // cy.applyBrake(9);
        // cy.speedUp(10);
        // System.out.println(cy.speed);     // you can create properties in interface   
        // cy.speed = 98;                    // you can not modify the properties/attributes of interface as they are final
        // cy.blowHornBike();
        // cy.blowHornCar();
        


    }
}
