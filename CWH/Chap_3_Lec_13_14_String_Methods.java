package CWH;

import java.util.Scanner;

public class Chap_3_Lec_13_14_String_Methods {
    public static void main(String[] args) {
        System.out.println("In this 13 and 14 lecture we will study about Strings and it's Methods");
        Scanner S = new Scanner(System.in);

        // String
        // String name = new String("Avinash");
        // String name = "Avinash";
        // System.out.println("My name is: "+ name);

        // Different ways to print in java
        // System.out.println("Hii, How are you?");
        // System.out.print("Hii, How are you?");
        // int a = 6;
        // float b = 5.6454f;
        // System.out.printf("The value of a is %d and the value of b is %8.2f",a,b);
        // System.out.format("The value of a is %d and the value of b is %f",a,b);

        // System.out.print("Enter your Name: ");
        // String str = S.nextLine();
        // System.out.format("Hii %s, How are you doing?",str);

        // From here Lecture - 14 starts

        // Strings Methods:-
        // String myName = new String("Avinash");
        String myName = "avinash";
        // System.out.println(myName);

        // int a = myName.length();
        // System.out.println(a);

        // String lString = myName.toLowerCase();
        // System.out.println(lString);

        // String uString = myName.toUpperCase();
        // System.out.println(uString);

        // String nonTrimmedString = "         Baby         ";
        // String trm = nonTrimmedString.trim();
        // System.out.println(trm);

        // System.out.println(myName.substring(2));
        // System.out.println(myName.substring(2,6));

        // System.out.println(myName.replace("a", "BABU"));
        // System.out.println(myName.replace("inas", "Bhaklol"));

        // System.out.println(myName.startsWith("a"));
        // System.out.println(myName.startsWith("A"));

        // System.out.println(myName.endsWith("sh"));
        // System.out.println(myName.endsWith("Sh"));

        // System.out.println(myName.charAt(4));

        // System.out.println(myName.indexOf("a"));
        // System.out.println(myName.indexOf("a",1));
        // System.out.println(myName.indexOf("aybj7"));

        // System.out.println(myName.lastIndexOf("a"));
        // System.out.println(myName.lastIndexOf("a",3));

        // System.out.println(myName.equals("avinash"));

        System.out.println(myName.equalsIgnoreCase("AviNaSH"));


        // Excape Sequence Character
        System.out.println("I am escape sequence \" double quote Character");
        System.out.println("I am escape sequence \\ back slash Character");
        System.out.println("We can print a in\nNew line");
        System.out.println("We can use \t for a tab");


        S.close();
    }
}