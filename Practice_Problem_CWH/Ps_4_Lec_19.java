package Practice_Problem_CWH;

import java.util.Scanner;

public class Ps_4_Lec_19 {
    public static void main(String[] args) {
        System.out.println("In this lecture we will be solving Practice Problems 4");
        Scanner S = new Scanner(System.in);

        // Question 1. Find output of the program
        // int a = 10; if (a = 11)
        // System.out.println("I am 11");
        // else System.out.println("I am not 11")

        // It will get an error as = is an assignment operator
        // it not work in if.

        // Question 2. Wrote a program to find out whether a student
        // is pass or fail: if it requires total 40% and at
        // least 33% in each subject to pass. Assume 3 subjects
        // and total marks as an input from the user.

        // System.out.print("Enter Your Java Marks: ");
        // float jMarks = S.nextFloat();
        // System.out.print("Enter Your JavaScript Marks: ");
        // float jaMarks = S.nextFloat();
        // System.out.print("Enter Your CSS Marks: ");
        // float cMarks = S.nextFloat();
        // float mObt = jMarks + jaMarks + cMarks;
        // float tPerc = mObt/300*100;
        // if(tPerc >= 40 && jMarks >= 33 && jaMarks >= 33 && cMarks >= 33 ){
        // System.out.println("You are pass");
        // }
        // else{
        // System.out.println("You are fail");
        // }

        // Question 3. Calculate Income tax paid by an employee to the
        // government as per the slabs mention below:
        // Income - Slab Tax
        // 2.5 L to 5.0 L 5 %
        // 5.0 L to 10.0 L 20 %
        // Above 10.0 L 30 %

        // System.out.print("Enter Your Income (in Rs): ");
        // double income = S.nextDouble();
        // if(income <= 250000){
        // System.out.println("You don't need to pay any tax");
        // }
        // else if(income > 250000 && income <= 500000){
        // System.out.println("You have to pay: "+ (income - 250000)*5/100 + "Rs Tax");
        // }
        // else if(income > 500000 && income <= 1000000){
        // System.out.println("You have to pay: "+ (((500000 - 250000)*5/100) + ((income
        // - 500000)*20/100)) + "Rs Tax");
        // }
        // else if(income > 1000000){
        // System.out.println("You have to pay: "+ (((500000 - 250000)*5/100) +
        // ((1000000 - 500000)*20/100) + ((income - 1000000)*30/100)) + "Rs Tax");
        // }

        // Question 4. Write a java program to find out the day
        // of the week given the number
        // [1 for Monday, 2 for Tuesday ...and so on.]

        // System.out.print("Type Your Number : ");
        // int date = S.nextInt();
        // switch (date) {
        // case 1 -> System.out.println("Monday");
        // case 2 -> System.out.println("Tuesday");
        // case 3 -> System.out.println("Wednesday");
        // case 4 -> System.out.println("Thursday");
        // case 5 -> System.out.println("Friday");
        // case 6 -> System.out.println("Saturday");
        // case 7 -> System.out.println("Sunday");
        // default -> System.out.println("Type only between 1 to 7");
        // }

        // Question 5. Write a java program to find out whether a
        // year entered by a user is a leap year or not.

        // System.out.print("Enter a year : ");
        // int year = S.nextInt();
        // if (year % 100 == 0) {
        //     if (year % 400 == 0) {
        //         System.out.println(year + " is a leap year");
        //     } else {
        //         System.out.println(year + " is not a leap year");
        //     }
        // } else {
        //     if (year % 4 == 0) {
        //         System.out.println(year + " is a leap year");
        //     } else {
        //         System.out.println(year + " is not a leap year");
        //     }
        // }

        // Question 6. Write a java program to find out the type of website from the
        // Url.
        // .com -> Commercial Website
        // .org -> Organisation Website
        // .in -> Indian Website

        // System.out.print("Enter Your Website: ");
        // String website = S.next();
        // if(website.endsWith(".com")){
        // System.out.println("This is a commercial website");
        // }
        // else if(website.endsWith(".org")){
        // System.out.println("This is a organisation website");
        // }
        // else if(website.endsWith(".in")){
        // System.out.println("This is a indian website");
        // }
        // else{
        // System.out.println("Type a valid Url");
        // }

        S.close();
    }

}
