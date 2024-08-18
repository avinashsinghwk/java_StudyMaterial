package CWH;

public class Chap_7_Lec_33_34_VariableArguments_Recursion {

    // static int sum(int a, int b){
    //     return a + b;
    // }
    // static int sum(int a, int b, int c){
    //     return a + b +c;
    // }
    // static int sum(int a, int b, int c, int d){
    //     return a + b + c + d;
    // }

    static int sum(int x, int ...arr){
        // Available as int [] arr;
        int jod = x;
        for(int element: arr){
            jod = jod + element;
        }
        return jod;
    }

    // From here Lecture - 34 starts
    
    static int factorial(int n){
        if(n == 0)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
                
        // int multi = 1;
        // for(int i = n; i >= 1; i--)
        // {
        // multi = multi * i;
        // }
        // return multi;
        }
    
    public static void main(String[] args) {
        System.out.println("In this lecture we will be learning about variable arguments (var args) and java Recursion");
        
        // System.out.println("The sum of 3 and 4 is : " + sum(3, 4));
        // System.out.println("The sum of 2, 3 and 4 is : " + sum(2, 3, 4));
        // System.out.println("The sum of 1, 2, 3 and 4 is : " + sum(1,2, 3, 4));
        
        // From here Lecture - 34 starts

        int k = 10;
        System.out.printf("The value of the factorial of %d is : %d",k,factorial(k));

        
        
    }
}
