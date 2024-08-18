package Practice_Problem_CWH;

import java.util.Scanner;

public class Ps_5_Lec_25 {
    public static void main(String[] args) {
        System.out.println("In this lecture we will be solving Practice Problem 25");
        Scanner S = new Scanner(System.in);

        // Question 1. Write a program to print the pattern **** *** ** *
        // for(int i = 0; i < 4; i++)
        // {
        //     for(int j = i; j < 4; j++)
        //     {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // Question 2. Write a program to sum first n even numbers using a while loop
        // System.out.print("Enter a number : ");
        // int n = S.nextInt(), sum = 0;
        // if(n > 0)
        // {
        //     for(int i = 0; i < n; i++)
        //     {
        //     sum += (2 * i);
        //     }
        //     System.out.println("The sum of first " + n + " even number = " + sum);
        // }
        // else
        // {
        //     System.out.println("Enter a number i.e greater than 0");
        // }
        
        // Question 3. Write a program to print the multiplication table of a given
        // number n.
        // System.out.print("Enter a number: ");
        // int userMTable = S.nextInt();
        // for(int i = 1; i <= 10; i++){
        // System.out.printf("%d X %d = %d \n",userMTable,i,userMTable * i);
        // }

        // Question 4. Write a program to print the multiplication table of 10 in
        // reverse.
        // for(int i = 10; i >= 1; i--){
        // System.out.println("10 X " + i + " = "+ 10 * i);
        // }

        // Question 5. Write a program to find the factorial of a given number using for
        // loops.
        // System.out.print("Enter a number: ");
        // int factorial = S.nextInt();
        // int factor = 1;
        // for(int i = 1; i <= factorial; i++){
        // factor = factor * i;
        // }
        // System.out.println(factorial + "! = " + factor);

        // Question 6. Repeat Problem 5 using a while loop
        // System.out.print("Enter a number: ");
        // int factorial = S.nextInt();
        // int factor = 1;
        // int i = 1;
        // while(i <= factorial)
        // {
        //     factor *= i;
        //     i++;
        // }
        // System.out.println(factorial + "! = " + factor);
        

        // Question 7. Repeat Problem 1 using do/while loop
        // while Loop
        // int i = 0, j;
        // while(i < 4)
        // {
        //     j = i;
        //     while(j < 4)
        //     {
        //         System.out.print(" * ");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        // do-while loop 
        // int i = 0, j;
        // do
        // {
        //     j = i;
        //     do
        //     {
        //         System.out.print(" * ");
        //         j++;
        //     }while(j < 4);
        //     System.out.println();
        //     i++;
        // }while(i < 4);

        // Question 8. What can be done using one type of loop can also be done using
        // the other two types of loops true or false
        // true, because what we can do with for loop we can also do it with while loop

        // Question 9. Write a program to calculate the sum of the numbers occurring in
        // the multiplication table of 8.
        // int sum = 0;
        // for(int a = 1; a <= 10; a++){
        // sum = sum + 8 * a ;
        // }
        // System.out.println("The sum of the numbers occurring in the multiplication table of 8 = " + sum);

        // Question 10. A do-while loop is executed: at least once, at least twice, at
        // most once
        // A do while is executed at least once because first it enter the loop and perfrom
        // action and then it check the condition, so it is must, That it will execute
        // once either the condition the false

        // Question 11. Repeat problem 2 using for loop
        // System.out.print("Enter a number: ");
        // int userEven = S.nextInt();
        // int sum = 0;
        // for (int i = 0; i < userEven; i++) {
        // sum = sum + 2 * i;
        // }
        // System.out.println("The sum of first " + userEven + " even number = " + sum);

        S.close();

    }

}
