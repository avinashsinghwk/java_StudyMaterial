package CWH;


// package CWH1;   // This is for declare a package

// package falna.CWH1;  // This is for package in package

// From here Lecture - 64 and 65 starts (Package)

// import java.util.Scanner;  // We are importing a class 'Scanner' from a package 'util' that is present in a package 'java'
// import java.lang.String;

// import java.util.*;        // We are importing all the classes and packages that are in the package 'util'
// import java.lang.*;

// From here Lecute - 66 starts (Access Modifiers)

class c1
{
    public int x = 2;
    protected int y = 9;
    int z = 6;
    private int k = -8;
    public void meth1()
    {
        System.out.println(k);
    }
}

public class Chap_12_Lec_62_63_64_65_66_CompilerAndInterpreter_Package_AccessModifiers
{
    public static void main(String[] args) {
        System.out.println("In this lecture we will be learning about Compilers Vs Interpreters and Package in java and Access Modifiers");

        // Lecute 62, 63 is theory part on (Compiler and Interpreter) so, there is no code

        // Java is both compiled and interpreted language, first java is compiled into byte code with the help of javac and make a bite code file which can be interpreted on any machine this is why java is also called platfrom independent language and then it is interpreted and then the result is shown

        // From here Lecture - 64 and 65 starts (Package)

        // Scanner s = new Scanner(System.in); // Making an object of the class 'Scanner' that is imported from the package 'util'
        // String s = new String("Avinash");

        // java.util.Scanner sc = new java.util.Scanner(System.in);  // We are making object of class 'Scanner' without importing basically we are giving the exact address of the class 'Scanner'
        // String s = new java.lang.String("Parwesh");

        // int a ;
        // a = sc.nextInt();
        // System.out.println("Hola, i am a amd my value is " + a );

        // We can make our own package by (javac -d . packageName.java) but first write the (package name;) in top of the file
        // javac -d . Chap_12_Lec_62_63_64_65_66_CompilerAndInterpreter_Package_AccessModifiers.java

        // We can add all this to package in package by (java -d abc packageName.java)
        // javac -d falna Chap_12_Lec_62_63_64_65_66_CompilerAndInterpreter_Package_AccessModifiers.java

        // By doing this (javac -d . *.java) we can add all the files to their respective packages

        // We can also import our own class from a package
        // import this.that.the;
        // import this.that.*;
        // the th = new the();

        // From here Lecute - 66 starts (Access Modifiers)
        c1 c = new c1();

        // inside same class (all access modifiers can be used)
        c.meth1();

        // inside same package (except private all the 3 can be used)
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.k);  // We can not access 'private' access modifier out of the class it has wirtten

        // inside sub class (only public or protected can be used)

        // in the world (only public can be used)


        



        // sc.close();

        
    }
}