package CWH;

import java.util.Scanner;

public class Chap_1_Lec_5_TakingInputFromUser {
    public static void main(String[] args) {
        System.out.println("In this lecture 5 we will study about, How to take User's input");

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number 1: ");
        // // int a = sc.nextInt();
        // float a = sc.nextFloat();

        // System.out.print("Enter number 2: ");
        // int b = sc.nextInt();
        // float b = sc.nextFloat();

        // int sum = a + b;
        // float sum = a + b;
        // System.out.println("The sum of two numbers = "+ sum);

        // System.out.print("Enter a number: ");
        // boolean b1 = sc.hasNextInt();
        // System.out.println("The User's input is Int or Not: "+ b1);

        System.out.print("Enter Your Name: ");
        // String str = sc.next();
        String str = sc.nextLine();
        System.out.println("Hii " + str + ", Good Morning!");

        sc.close();

    }

}
