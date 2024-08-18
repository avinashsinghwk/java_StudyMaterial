package CWH;

import java.util.Scanner;

public class Chap_5_Lec_21_22_23_24_Loops_Break_Continue {
    public static void main(String[] args) {
        System.out.println("In this lecture we will be studying about different types of Loops and break and continue");
        Scanner S = new Scanner(System.in);

        // While Loops
        // int a = 1;
        // while (a <= 5) {
        // System.out.println(a);
        // a++;
        // }

        // From here Lecture - 22 starts

        // Do While Loop
        // int i = 11;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i < 10);

        // From here Lecture - 23 starts

        // For Loop
        // for(int j = 1; j < 6; j++){
        // System.out.println(j);
        // }

        // Quick Quiz: Print first n odd number using for loop
        // System.out.print("Enter number: ");
        // int userInput = S.nextInt();
        // for (int n = 0; n < userInput; n++) {
        // System.out.print(2 * n + 1 + "\t");
        // }

        // Decrementing for loop
        // for(int c = 4; c > 0; c--){
        // System.out.println(c);
        // }

        // Quick Quiz: Print first n natural number in reverse
        // System.out.print("Enter a number: ");
        // int userNumber = S.nextInt();
        // for(int k = 0; userNumber > k; userNumber--){
        // System.out.print(userNumber + "\t");
        // }

        // From here Lecture - 24 starts

        // Break and Continue in loops

        // for(int i = 1; i < 5; i++){
        // System.out.println(i);
        // System.out.println("Java is Great");
        // if (i == 2){
        // System.out.println("Ending the loop");
        // break;
        // }
        // }

        // int i = 1;
        // while(i < 5){
        // System.out.println(i);
        // System.out.println("Java is Great");
        // if (i == 2){
        // System.out.println("Ending the loop");
        // break;
        // }
        // i++;
        // }

        // int i = 1;
        // do {
        // System.out.println(i);
        // System.out.println("Java is Great");
        // if (i == 2) {
        // System.out.println("Ending the loop");
        // break;
        // }
        // i++;
        // } while (i < 5);

        // for(int i = 1; i < 5; i++){
        // if (i == 2){
        // System.out.println("Ending the loop");
        // continue;
        // }
        // System.out.println(i);
        // System.out.println("Java is Great");
        // }

        // int i = 0;
        // do {
        //     i++;
        //     if (i == 2) {
        //         System.out.println("Ending the loop");
        //         continue;
        //     }
        //     System.out.println(i);
        //     System.out.println("Java is Great");
        // } while (i < 5);

        S.close();
    }
}
