package Practice_Problem_CWH;
// import java.util.InputMismatchException;
import java.util.Scanner;

class Q_4 extends Exception
{
    @Override
    public String toString()
    {
        return "Rerun the program but this time wirte a valid index";
    }
}
public class Ps_14_Lec_86 {
    
    public static void Q_5() throws ArrayIndexOutOfBoundsException
    {
        Scanner S = new Scanner(System.in);
        int ind;
        int ma[] = {1, 2, 3};
        System.out.print("Enter the index : ");
        ind = S.nextInt();
        System.out.println("The value of ma[" + ind + "] = " + ma[ind]);  
        S.close();
    }

    public static void main(String[] args) {
        System.out.println("In this lecture i will be solving practice problem 14");
        Scanner sc = new Scanner(System.in);

        // Question 1. Write a java program to demonstrate syntax, logical and runtime error

        // int a  // Syntax eror

        // int a = 13, b = 2;
        // System.out.println("The exact value of a / b = " + a / b);  // Logical error because it will only give integral part

        // int a;
        // System.out.print("Enter a number : ");
        // a = sc.nextInt();
        // System.out.println("This can throw Runtime error if you give character or string as input");

        // Question 2. Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal Argument exception

        // int a, b;
        // try 
        // {
        //     System.out.print("Enter the value of a : ");
        //     a = sc.nextInt();
        //     System.out.print("Enter the value of b : ");
        //     b = sc.nextInt();
        //     if(a < 0 || b < 0)
        //     {
        //         throw new IllegalArgumentException("HeHe");
        //     }
        //     try 
        //     {
        //         System.out.println("a / b = " + a / b);
        //     }
        //     catch(ArithmeticException e1)
        //     {
        //         System.out.println("HaHa");
        //     }
        // }
        // catch(InputMismatchException e)
        // {
        //     System.out.println("Type a integer");
        // }

        // Question 3. Write a program that allow you to keep assuring an array unit a valid index is given. If max retries exceeds 5 print error

        // int i = 5;
        // int ar[] = {11, 13, 15};
        // while(i > 0)
        // {
        //     System.out.print("Enter the index number : ");
        //     int ind = sc.nextByte();
        //     try 
        //     {
        //         System.out.println("The value of ar[" + ind + "]  = " + ar[ind]);
        //         break;
        //     }
        //     catch(ArrayIndexOutOfBoundsException e)
        //     {
        //         System.out.println("Type a valid index. Max inex possible is " + (ar.length - 1));
        //         i--;
        //     }
        // }
        // if(i == 0)
        // {
        //     System.out.println("Error........");

        //     // This is for Q - 4
        //     try 
        //     {
        //         throw new Q_4();
        //     }
        //     catch(Exception e)
        //     {
        //         System.out.println(e);
        //     }
        //     // -----------------------
            
        // }

        // Question 4. Modify program in Q - 3 to throw a custom exception if max retries are reached

        // I have already solved in Question - 3

        // Question 5. Wrap the program in Q - 3 inside a method which throws your custom exception

        // try 
        // {
        //     Q_5();
        // }
        // catch(Exception e)
        // {
        //     System.out.println("Babu tum pagla gya kya re ");
        // }

        sc.close();
    }
    
}
