package Practice_Problem_CWH;

import java.util.Scanner;

public class Ps_1_Lec_7{
    public static void main(String[] args) {
        System.out.println("In this lecture we are going to solve the practice problem 1");

        Scanner S = new Scanner(System.in);

        //  Question 1. Write sum of three numbers?

        // int num1 = 3, num2 = 53, num3 = 53;
        // System.out.println("Sum of three numbers = "+(num1 + num2 + num3));

        // Question 2. Write a programe to calculate CGPA using marks (out of 100)?
        // int subject1 = 34;
        // int subject2 = 76;
        // int subject3 = 56;
        // float cgpa = (subject1 + subject2 + subject3)/30f;
        // System.out.println(cgpa);

        // Question 3. Write a program to ask user to type name and reply his/her with 
        //             Hii <name>! Good day to you . ?

        // System.out.print("Enter Your Name: ");
        // String name = S.nextLine();
        // System.out.println("Hii "+ name + "! Good day to you.");

        // Question 4. Write a program to convert kilogram into gram ?

        // System.out.print("Type Weight in Kg: ");
        // float weight = S.nextFloat();
        // System.out.println(weight + " Kg = " + (weight*1000) + "g");

        // Question 5. Write a program to Check whether number typed is integer or not ?

        System.out.print("Type a number: ");
        boolean number = S.hasNextInt();
        if(number == true){
            System.out.println("The number you typed is a integer");
        }
        else{
            System.out.println("The number you typed is not a integer");
        }






        S.close();






    }
}