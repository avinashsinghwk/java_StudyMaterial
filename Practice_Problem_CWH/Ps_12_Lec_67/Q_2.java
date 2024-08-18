package Ps_12_Lec_67;

class Cilass
{
      int value = -9;
     protected int value2 = 10; 
     private int z = 2;
     
}
class Cilass2 extends Cilass
{
     void meth1()
     {
        value = 10;
        value2 = 34;
        // z = 12;
        System.out.println(value + " and " + value2);
     } 
}

public class Q_2 {
    public static void main(String[] args) {
        
        // Question 2. Use a built-in package in java to write a class which display a message taking input from the user
        // java.util.Scanner s = new java.util.Scanner(System.in);
        // int a = s.nextInt();
        // System.out.println("Ye ho gya a ka value " + a );
        // s.close();

        // Question 4. Prove that you can not access default property but can access protected property from a subclass
        Cilass2 ci = new Cilass2();
        ci.meth1();

    }
}


// Question 1. Create these classes Calculator, ScCalculator, HybridCalculator and group them into a same package

    
        // Question 3. Create a package in class with three package folder, folder1, folder2
