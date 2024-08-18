package CWH;

// import java.util.InputMismatchException;
// import java.lang.ArithmeticException;
import java.util.Scanner;

// class MyException extends Exception
// {
//     @Override
//     public String toString()
//     {
//         return super.toString() + " I am toString() ";
//     }

//     @Override 
//     public String getMessage()
//     {
//         return super.getMessage() + " I am getMessage()";
//     }
// }

// class MyAgeException extends Exception
// {
//     @Override
//     public String toString()
//     {
//         return "Age can not be greater than 125 or less than 1";
//     }

//     public String getMessage()
//     {
//         return "Type a correct age";
//     }
// }

// This is for Lecture - 84 (Throw Vs Throws)

// class NegativeException extends Exception
// {
//     @Override
//     public String toString()
//     {
//         return "Radius can not be negative";
//     }

// }


public class Chap_14_Lec_82_83_84_85_NestedETryCatch_ExceptionClass_ThrowVsThrows_finally
 {
    // public static int divide(int a, int b) throws ArithmeticException
    // {
    //     return a / b;
    // }

    // public static float area(int r) throws NegativeException
    // {
    //     if(r < 0)
    //     {
    //         throw new NegativeException();
    //     }
    //     return (float) Math.PI * r * r;
    // }

    // public static int greet()
    // {
    //     try 
    //     {
    //         int a = 3;
    //         int b = 0;
    //         return a / b;
    //     }
    //     catch (Exception e)
    //     {
    //         System.out.println(e);
    //     }
        
    //     finally
    //     {
    //         System.out.println("This is the end of the program");
    //     }
    //     return -1;
    // }
    public static void main(String[] args) {
        System.out.println(
                "In this lecture i will be learning about Nested Try Catch Exception Class Throw Vs Throws and Reality of Finally in java");

        // Lecute - 82 (Nested Try Catch)
        // int marks[] = new int[3];
        // marks[0] = 18;
        // marks[1] = 19;
        // marks[2] = 13;
        Scanner sc = new Scanner(System.in);
    //     int ind;
    //     boolean flag = true;
    //     while(flag)
    //     {
    //         try 
    //         {
    //         System.out.println("Welcome Bhailog");
    //         try 
    //         {
    //             System.out.print("Enter the index no. : ");
    //             ind = sc.nextInt();

    //             try 
    //             {
    //                 System.out.println(marks[ind]);
    //             } 
    //             catch (ArrayIndexOutOfBoundsException e) 
    //             {
    //                 System.out.println("Exception level 3 : " + e);
    //             }
    //         } 
    //         catch (InputMismatchException e3)
    //         {
    //             System.out.println("Exception level 2 :  " + e3);
    //             flag = false;
    //         }
    //     } 
    //     catch (Exception e1) 
    //     {
    //         System.out.println("Exception level 1 : " + e1);
    //     }
    // }

    // // Lecture - 83 (Exception Class)

    // MyException me = new MyException();
    // System.out.print("Enter the value of a : ");
    // int a = sc.nextInt(); 
    // if(a < 99)
    // {
    //     try
    //     {
    //         // throw me;
    //         // throw new MyException();
    //         // throw new ArithmeticException("This is an arithmetic exception");
    //     }
    //     catch(Exception e)
    //     {
    //         System.out.println("The Exception : " + e.getMessage());
    //         System.out.println("The Exception : " + e.toString());
    //         System.out.println(e);  // This will invoke toString();
    //         e.printStackTrace();
    //     }
    // }

    // int age;
    // System.out.print("Enter your age : ");
    // age = sc.nextInt();
    // if(age > 125 || age < 1)
    // {
    //     try
    //     {
    //     throw new MyAgeException();
    //     }
    //     catch(Exception e)
    //     {
    //     System.out.println(e);
    //     System.out.println(e.getMessage());
    //     }   
    // }

    // Lecture - 84 (Throw Vs Throws)

    // try
    // {
    //     System.out.println("a / b = " + divide(14, 0));
    // }
    // catch(ArithmeticException e)
    // {
    //     System.out.println(e); 
    // }

    // try
    // {
    //     System.out.println("The area of circle = " + area(-9));
    // }
    // catch(Exception e)
    // {
    //     System.out.println(e.toString());
    // }

    // Lecture - 85 (Finally block)

    // System.out.println(greet());

    // Quick Quiz : Make a finally block in for loop which should be executed anyhow

    int a = 10, b =  7;
    while(true)
    {
        try 
        {
            System.out.println(a / b);
        }
        catch(Exception e)
        {
            System.out.println(e);
            break;
        }
        finally 
        {
            System.out.println("See, i have executed finally block");
        }
        b--;
    }



    



        sc.close();

    }

}
