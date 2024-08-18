package Practice_Problem_CWH;

// Question 1. 
// abstract class Pen
// {
//     abstract void write();
//     abstract void refill();
// }

// Question 2. 
// class FountainPen extends Pen
// {
//     void write()
//     {
//         System.out.println("Yes, i am wirting");
//     }
//     void refill()
//     {
//         System.out.println("Refilling it");
//     }
//     void changeNib()
//     {
//         System.out.println("Your Nib has changed");
//     }
// }

// Question 3. 
// interface BasicAnimal
// {
//     void eat();
//     void sleep();
// }
// class Monkey
// {
//     void bite()
//     {
//         System.out.println("I am biting you");
//     }
//     void jump()
//     {
//         System.out.println("....... Jumping .....");
//     }
// }
// class Human extends Monkey implements BasicAnimal
// {
//     @Override
//     public void eat()
//     {
//         System.out.println("I am eating");
//     }
//     @Override
//     public void sleep()
//     {
//         System.out.println("...... Sleeping ......");
//     }
//     public void speak()
//     {
//         System.out.println("Speaking");
//     }
// }

// Question 4. 
// abstract class Telephone
// {
//     abstract void ring();
//     abstract void lift();
//     abstract void disconnect();
// }
// class SmartTelephone extends Telephone
// {
//     public void ring()
//     {
//         System.out.println("Ringing");
//     }
//     public void lift()
//     {
//         System.out.println("Lifting");
//     }
//     public void disconnect()
//     {
//         System.out.println("YOur call has been disconnected");
//     }
// }

// Question 5. 
// I have taken class and interfaces of Q - 3

// Question 6. 
// interface TvRemote
// {
//     void pause();
//     void play();
// }
// interface SmartTvRemote extends TvRemote
// {
//     void netflix();
//     void prime();
// }

// Question 7.
// class Tv implements SmartTvRemote
// {
//     public void netflix(){}
//     public void prime(){}
//     public void pause(){}
//     public void play(){}
// } 

public class Ps_11_Lec_60_61 {
    public static void main(String[] args) {
        System.out.println("In this lecture i will be solving practice problem 11");

        // Question 1. Create an abstract class Pen with methods write() and refill() as abstract methods

        // Pen p = new Pen(); // Not possible since it is a abstract class

        // Question 2. Use the Pen class from Q - 1 to create a concrete class FountainPen with additional method changeNib()

        // FountainPen fp = new FountainPen();
        // fp.write();
        // fp.refill();
        // fp.changeNib();
        // Pen p = new FountainPen();
        // p.write();
        // p.refill();
        // p.changeNib();   // NOt possible as reference is of parent/abstract class
        
        // Question 3. Create a class Monkey with jump() and bite() methods. Create a class Human which inherit this Monkey class and implement BasicAnimal interface with eat() and sleep() method

        // Human hu = new Human();
        // hu.eat();
        // hu.sleep();
        // hu.jump();
        // hu.bite();
        // hu.speak();

        // BasicAnimal ba = new BasicAnimal();  // we can not make object of interface 

        // BasicAnimal ba = new Human(); // we can make reference of interface and object of concrete class that has implemented it
        // ba.eat();
        // ba.sleep();
        // ba.jump(); ba.bite(); ba.speak(); // We can not do this since it will only access the methods that is inside the interface

        // Monkey m = new Monkey();
        // m.bite();
        // m.jump();

        // Question 4. Create a class Telephone with ring(), lift(), and disconnect() methods as abstract methods. Create another class SmartTelephone and demonstrate polymorphism

        // Telephone t = new SmartTelephone();
        // t.lift();
        // t.disconnect();
        // t.ring();

        // Question 5. Demonstrate polymorphism using Monkey class form Q - 3
        
        // Monkey mo = new Human();
        // mo.eat(); mo.sleep();  mo.speak(); // By giving reference of parent class and making object of child class we can ony access the overridden methods and mehods of the parent class
        // mo.bite();
        // mo.jump();

        // Question 6. Create a interface TvRemote and use it to inherit another interface SmartTvRemote

        // Only had to make interfaces

        // Question 7. Create a class Tv which implements TvRemote interface from Q - 6

        // Tv tv = new Tv();
        // tv.netflix();
        // tv.pause();
        // tv.prime();
        // tv.play();


        // Lecute 61 is all about solving exercise 4 which i already have solved in lecture 51

    }
    
}
