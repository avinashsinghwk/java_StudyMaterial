package Practice_Problem_CWH;

import java.util.Scanner;

public class Ps_7_Lec_35 {

    // Question 1.
    // static void multiplication(int z) {
    //     int i = 1;
    //     while(i <= 10)
    //     {
    //         System.out.println(z + " X " + i + " = " + z * i);
    //         i++;
    //     }
    // }

    // Question 2.
    // static void pattern(int z) {
    //     for(int i = 0; i < z; i++)
    //     {
    //         for(int j = 0; j <= i; j++)
    //         {
    //             System.out.print(" * ");
    //         }
    //         System.out.println();
    //     }
    // }

    // Question 3.
    // static int sum(int z){
    //     if(z == 1)
    //     {
    //         return 1;
    //     }
    //     else
    //     {
    //         return z + sum(z - 1);
    //     }
    // }

    // Question 4.
    // static void pattern2(int z) {
    //     for (int i = 0; i < z; i++) {
    //         for (int j = i; j < z; j++) {
    //             System.out.print(" * ");
    //         }
    //         System.out.println();
    //     }
    // }

    // Question 5.
    // static int series(int z){
    //     if(z == 1)
    //     {
    //         return 0;
    //     }
    //     else if(z == 2)
    //     {
    //         return 1;
    //     }
    //     else
    //     {
    //         return series(z - 1) + series(z - 2);
    //     }
    // }

    // Question 6.
    // static float avg(int ...arr)
    // {
    //     int sum = 0;
    //     for(int a : arr)
    //     {
    //         sum += a;
    //     }
    //     return (float)sum / arr.length;
    // }

    // Question 7.
    // static void pattern3(int z){
    //     if(z > 0)
    //     {
    //         for(int i = 0; i < z ; i++)
    //         {
    //             System.out.print(" * ");
    //         }
    //         System.out.println();
    //         pattern3(z - 1);
    //     }
    // }

    // Question 8.
    // static void pattern4(int z){
    // if(z > 0)
    // {
    //    pattern4(z - 1);
    //    for(int i = 0; i < z; i++)
    //    {
    //     System.out.print(" * ");
    //    }
    //    System.out.println();
    // }
    // }

    // Question 9.
    // static float temp(float z) {
    //     return (z * 1.8f + 32.0f);
    // }

    // Question 10.
    // static int sum_ite(int z){
    // int jod = 0;
    // for(int i = 1; i <= z; i++){
    // jod = jod + i;
    // }
    // return jod;
    // }

    public static void main(String[] args) {
        System.out.println("In this lecture we will be solving practice problem 7");
        Scanner S = new Scanner(System.in);

        // Question 1. Write a java method to print multiplication of a number n.
        // System.out.print("Enter a number: ");
        // int n = S.nextInt();
        // multiplication(n);

        // Question 2. Write a java program using function to print this pattern * ** *** **** *****
        // System.out.print("Enter no. of lines : ");
        // int n = S.nextInt();
        // pattern(n);

        // Question 3. Write a recursive function to calculate sum of first n natural
        // numbers
        // System.out.print("Enter a number : ");
        // int n = S.nextInt();
        // System.out.printf("The sum of first %d natural number = %d",n, sum(n));

        // Question 4. Write a java program using function to print this pattern ***** **** *** ** *
        // System.out.print("Enter no. of lines : ");
        // int n = S.nextInt();
        // pattern2(n);

        // Question 5. Write a java program using function to print nth term of
        // fibonacci series using recursion
        // 0, 1, 1, 2, 3, 5, 8, 13.......
        // System.out.print("Enter the nth tern of the fibonacci series: ");
        // int n = S.nextInt();
        // System.out.printf("The %dth term of the fibonacci series is : %d",n,series(n));

        // Question 6. Write a java program using function to print the average of a set
        // of numbers passed as arguments
        // System.out.printf("The average of the numbers = %f", avg(3, 4, 8, 19, 44));

        // Question 7. Repeat 4 using recursion
        // System.out.print("Enter no. of lines : ");
        // int n = S.nextInt();
        // pattern3(n);

        // Question 8. Repeat 2 using recursion
        // System.out.print("Enter no. of lines : ");
        // int n = S.nextInt();
        // pattern4(n);

        // Question 9. Write a java method to convert celcius temp. into fahrehheit.
        // System.out.print("Enter temp. in celcius : ");
        // float n = S.nextFloat();
        // System.out.printf("%f degree celcius = %f degree fahreheit",n,temp(n));

        // Question 10. Sove Q - 3 using iterative approach.
        // System.out.println("The sum of first 5 natural number = " + sum_ite(5));

        S.close();
    }
}
