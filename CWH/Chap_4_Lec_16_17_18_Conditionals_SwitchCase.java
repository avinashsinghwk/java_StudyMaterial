package CWH;

import java.util.Scanner;

public class Chap_4_Lec_16_17_18_Conditionals_SwitchCase {
    public static void main(String[] args) {
        System.out.println(
                "In this lecture we will be studying about Conditionals and Logicla Operators and Switch Case");
        Scanner S = new Scanner(System.in);

        // Conditionals
        // System.out.print("Enter your age: ");
        // byte age = S.nextByte();

        // if(age >= 18){
        // System.out.println("Your can drive!");
        // }
        // else{
        // System.out.println("Your can not drive!");
        // }

        // From here Lecture - 17 starts

        // Logical Operators
        // boolean t = true;
        // boolean f = false;
        // boolean t2 = true;

        // if(t && f && t2){
        // System.out.println("All are true");
        // }
        // else{
        // System.out.println("Either one is false two are false or all are false");
        // }

        // if(t || f || t2){
        // System.out.println("One must be true");
        // }
        // else{
        // System.out.println("All are false");
        // }

        // System.out.println("Not(t) is: " + !t);
        // System.out.println("Not(f) is: " + !f);
        // System.out.println("Not(t2) is: " + !t2);

        // From here Lecture - 18 starts

        // IF Else If Conditionals
        // System.out.print("Enter Your Age: ");
        // long age2 = S.nextLong();

        // if(age2 > 120 || age2 <= 0){
        // System.out.println("You are typing a invalid age!");
        // }
        // else if(age2 >= 80){
        // System.out.println("You are very old, So you drive should carefully!");
        // }
        // else if(age2 >= 18 && age2 < 80){
        // System.out.println("You Can Drive!");
        // }
        // else if(age2 < 18 && age2 > 1){
        // System.out.println("You Can not Drive!");
        // }
        // else{
        // System.out.println("Pata Nahi Ji tu ka Galti kar Raha hai!");
        // }

        // Switch Case
        byte var = 18;
        // switch (var) {
        // case 20:
        // System.out.println("You are going to become an adult ");
        // break;
        // case 25:
        // System.out.println("You are going to join a job ");
        // break;
        // case 60:
        // System.out.println("You are going to get retired ");
        // break;
        // default:
        // System.out.println("Enjoy Your Life ");
        // }
        // System.out.println("Thanks For Using Java Code ");

        // Enhanced Switch
        switch (var) {
            case 20 -> {
                System.out.println("You are going to become an adult");
                System.out.println("Enjoy Your Life ");
            }
            case 25 -> System.out.println("You are going to join a job ");
            case 60 -> System.out.println("You are going to get retired ");
            default -> System.out.println("Enjoy Your Life ");
        }
        S.close();
    }

}