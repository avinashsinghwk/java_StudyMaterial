package CWH;

import java.util.Scanner;

public class Chap_14_Lec_78_79_80_81_Error_Exception_Try_Catch_HandlingException 
{
    public static void main(String[] args) {
        System.out.println("In this lectue i will be learning about Errors and Exception and Try Catch and Handling the specific exception");

        // Types of Errors (Lecture - 78)

        // i>  Syntax Error
        // int a = 5    
        // System.out.println(pata_Nahi_Ye_Kya_Hai);

        // From here lecture - 79 starts 

        // ii> Logical Error (Bug)

        // Let's say you have to write a prime number between 1 to 10

        /* There is a logical error, 9 will also be printed which is not a prime number 
        System.out.println(2 + " is a prime number");
        for(int i = 1; i < 5; i++)
         {
             System.out.println(2 * i + 1 + " is a prime number");
            }
        */
        
        /* 
        // Runtime Error (Exception)
        int k ;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 with " + k + " is " + 1000 / k);
        
        // This is a valid program but if we give input a character it will throw an runtime error
        */

        // Lectue - 80 (Try and Catch)
        
        // Execption can be of two types 
        // Checked Exception  (it is checked be compiler)
        // Un Checked Exception 

        // int a = 6000;
        // int b = 0;

        // without try and catch
        // int c = a / b;
        // System.out.println("The result is " + c);

        // With try and catch
        // try{
        //     int c = a / b;
        //     System.out.println("The result is " + c);
        // }
        // catch(Exception e){
        //     System.out.print("We failed to divide Reason - ");
        //     System.out.println(e);
        // }
        // System.out.println("End of the program");

        // Lecture - 81 (Handling Exceptions)
        // int arr[] = new int[3];
        // arr[0] = 11;
        // arr[1] = 12;
        // arr[2] = 13;

        Scanner sc = new Scanner(System.in);
        // try
        // {
        // System.out.print("Enter the index of array : ");
        // int ind = sc.nextInt();
        // System.out.print("Enter the number you want to divide with : ");
        // int num = sc.nextInt();

        //     System.out.println("The value of arr[" + ind + "] = " + arr[ind]);
        //     System.out.print("The integer part after diving " + arr[ind] + " / " + num + " = " + arr[ind] / num);
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println("Exception happened : " + e);
        // }
        // catch(ArrayIndexOutOfBoundsException e1)
        // {
        //     System.out.println("Your disired index is not present in array. Length of the array is  " + arr.length+ " \nYour exception name is " + e1);
        // }
        // catch(InputMismatchException e2)
        // {
        //     System.out.println("You have not inputted a valid thing");
        // }
        // catch(Exception e3)
        // {
        //     System.out.println("Some excepton happened : " + e3);
        // }
       

            sc.close();
    }
}