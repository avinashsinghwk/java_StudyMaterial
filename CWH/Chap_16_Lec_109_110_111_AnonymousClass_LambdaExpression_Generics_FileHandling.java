package CWH;
// import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

// Anonymous Class

// interface Anonymous {
//     void meth1();
//     void meth2();
// }

// class Anony implements Anonymous {
// @Override
// public void meth1() {
// System.out.println("I am meth1");
// }
// @Override
// public void meth2() {
// System.out.println("I am meth2");
// }
// }

// Lambda Expression

// @FunctionalInterface // interface that has only one abstract method
// interface Lambda {
//     void method1(int a);
// }

// class Lam implements Lambda {
//     @Override
//     public void method1() {
//         System.out.println("This is methods   1");
//     }
// }

// Generics
//  class MyGenerics <T1, T2> {
//     int val;
//     private T1 t1;
//     private T2 t2;

//     MyGenerics(int val, T1 t1, T2 t2) {
//         this.val = val;
//         this.t1 = t1;
//         this.t2 = t2;
//     }
//     public T1 geT1() {
//         return t1;
//     }
//     public T2 geT2() {
//         return t2;
//     }
//  }

public class Chap_16_Lec_109_110_111_AnonymousClass_LambdaExpression_Generics_FileHandling {
    public static void main(String[] args) {
        System.out.println(
                "In this lecture i will be learning about Anonymous Classes, Lambda Expressions and Generics and File Handling");

        // Lecture - 109 (Anonymous Classes and Lambda Expressions)

        // Anonymous a = new Anony(); // Dynamic method dispatch
        // a.meth1();

        // If we have to use this methods one time then why to make a class that implements it, inspite of make a anonymous class it allows us to make ovject of an interface

        // Anonymous a = new Anonymous() {
        //     public void meth1() {
        //         System.out.println("I am meth1");
        //     }

        //     @Override
        //     public void meth2() {
        //         System.out.println("I am meth2");
        //     }
        // };
        // a.meth1();

        // (Lambda Expressions)

        // Lambda l = new Lam(); // dynamic method dispatch
        // l.method1();

        // if there is a functional interface and we have to use it's method then why to make a  class that implements it just make an Anonymous class but it is functional interface then make a lambda expression

        // Lambda l = (a)-> {System.out.println("This is your boy method1 " + a);};
        // l.method1(6);

        // Lecture - 110 (Generics)

        // ArrayList a = new ArrayList();

        // a.add("Hello");
        // a.add(987);
        // a.add(new Scanner(System.in));

        // int val  = (int) a.get(1);
        // System.out.println(val);
        // int val2 = (int)a.get(0); // This will throw a runtime error as it is String at 0 index

        // if we don't typecast this into (int) then it'll throw an error cause this will return an object and if you don't want to typecast then specify that this arrayList will only take integer 

        // ArrayList <Integer> aL = new ArrayList<>();
        // aL.add(21);
        // System.out.println(aL.get(0));

        // MyGenerics <String, Integer> g1 = new MyGenerics(123, "I am a string", 10001);
        // String s = g1.geT1();
        // System.out.println(s);

        // int z = g1.geT2();
        // System.out.println(z);

        // Lecture - 111 (File Handling)

        // Creating a file 
        // File f = new File("E:/Desktop/Babu.txt");
        // try { f.createNewFile(); } catch (Exception e) {e.printStackTrace();}

        // Writing a file
        // try { 
        //     FileWriter fw = new FileWriter("E:/Desktop/Babu.txt");
        //     fw.write("I am writing something in the file name Babu.txt");
        //     fw.close();
        //  } catch(Exception e) {e.printStackTrace();}

        // If there will be no file then it will create one

        // Reading a file
        try {
            FileWriter fw = new FileWriter("E:/Desktop/BanaHuaFile.txt");
            fw.write("Hello Avinash\nThis is my first file\nHow are you ?");
            fw.close();
        }
        catch(Exception e){e.printStackTrace();}
        File f = new File("E:/Desktop/BanaHuaFile.txt");
        try {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()) {
                String str = sc.nextLine();
                System.out.println(str);
            }
            sc.close();
        }catch(Exception e) {e.printStackTrace();}

        // Deleting a file
        File f1 = new File("E:/Desktop/BanaHuaFile.txt");
        if(f1.delete()) 
        {
            System.out.println("It has been deleted");
        }
        else {
            System.out.println("Milbe nhi kiya");
        }











    }

}
