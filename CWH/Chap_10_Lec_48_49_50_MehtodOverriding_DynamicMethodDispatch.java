package CWH;


// From here Lecture - 48 starts (Method OverRiding)
// class A
// {
//      void meth2()
//     {
//         System.out.println("I am meth2 of class A");
//     }
// }

// class B extends A
// {
//     @Override
//      void meth2()
//     {
//         System.out.println("I am meth2 of class B");
//     }

//     public void meth3()
//     {
//         System.out.println("I am meth3 of class B");
//     }
// }

// From here Lecture - 49 starts (Dynamic Method Dispatch)
class Phone
{
    public void greet()
    {
        System.out.println("Hello, How are you?");
    }
    public void on()
    {
        System.out.println("Turning on Phone........");
    }
}

class SmartPhone extends Phone
{
    @Override
    public void on()
    {
        System.out.println("Turning on SmartPhone........");
    }
    public void welcome()
    {
        System.out.println("We welcome you here!");
    }
}

public class Chap_10_Lec_48_49_50_MehtodOverriding_DynamicMethodDispatch {
    public static void main(String[] args) {
        System.out.println("In this lecture i will be learning about Mehod Overriding and Dynamic Method Dispatch");
        
    // From here Lecture - 48 starts (Method OverRiding)

    //   A a = new A();
    //   a.meth2();

    //   B b = new B();
    //   b.meth2();

    // From here Lecture - 49 starts (Dynamic Method Dispatch)
      
    //   Phone obj = new Phone();
    //   SmartPhone smObj = new SmartPhone();
    //   smObj.on();

    // SmartPhone smObj = new Phone();   // NOT ALLOWED since reference of child class can not be equal to parent class

    Phone obj = new SmartPhone();        // ALLOWED since reference of parent class can be equal to child class
    obj.greet();
    obj.on();                            // It will execute on() of sub class since object is of sub class

    // obj.welcome();                    // NOT ALLOWED since reference is of super class


    
    // Lecture 50 is all about solving Exercise 3 which i already have solved in lecture 43
}

}