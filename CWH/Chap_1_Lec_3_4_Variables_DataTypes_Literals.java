package CWH;

public class Chap_1_Lec_3_4_Variables_DataTypes_Literals {
    public static void main(String[] args) {
        System.out.println("In 4th and 5th Lecture we are going to study about Variables DataTypes and Literals");

        // Deciding names for variables

        // int 1arr; Can not start with a number
        // int void; Can not be a keyword
        // int avinash Kumar; Can not be a wide space
        // int a1$5; can involve number dollar if other conditions are met

        // Data Types
        // 1. Primitive data type 2. Non-primitive data type
        // Primitive data types

        // byte : takes 1 byte i.e 8 bits, value -128 to 127, Defautl value = 0
        // short: takes 2 byte i.e 16 bits, value -(2**16)/2 to (2**16)/2 -1, Default vlaue = 0
        // int: takes 4 byte, value -(2**32)/2 to (2**32)/2 -1, Default value = 0
        // float: takes 4 byte, value (see documents), Default value = 0.0f
        // long: takes 8 byte, value -(2**64)/2 to (2**64)/2 -1, Default value = 0
        // double: takes 8 byte, value (see documents), Default value = 0.0d
        // char: takes 2 byte, value 0 to 65583(2**16 -1), Default value = /uoooo
        // boolean: size depends on jVM, value can be true or false, Default value = false

        // Quick Quiz: Write a java program to add three number
        // int num1 = 21, num2 = 53, num3 = 11;
        // int sum = num1 + num2 + num3;
        // System.out.print("The sum of num1 + num2 + num3 = ");
        // System.out.println(sum);

        // From here Lecture 4 starts

        // Literals:- The constant value that is assigned with variables
        // byte age = 43;
        // int age2 = 53;
        // short age3 = 33;
        // long ageDino = 35534252556L;
        // char ch = 'A';
        // float f1 = 5.6f;
        // double d2 = 4.66;
        // boolean a = true;

        // System.out.println(age);
        String name = "Avinash";
        System.out.println(name);
    }

}
