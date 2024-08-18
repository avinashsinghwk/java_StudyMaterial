package CWH;

public class Chap_7_Lec_30_31_32_Java_Methods_Methods_Overloding {
    
    // From here Lecture - 31 starts

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    // From here Lecture - 32 starts

    static void jokes(){
        System.out.println("Helvetica and Times New Roman walk into a bar.\n" +
        "Get out of here! shouts the bartender. We don't serve your type.");
    }

    static void change(int k){
        k = 100;
    }

    static void change2(int arr[]){
        arr[0] = 100;
    }

    // Method Overloding

    static void foo(){
        System.out.println("Good Morning!");
    }

    static void foo(int q){
        System.out.println("Good Morning " + q );
    }

    static void foo(int q ,char r){
        System.out.println("Good Morning " + q +" " + r);
    }

    public static void main(String[] args) {
        System.out.println("In this lecture we will be studying about Methods in java and Methods overloding");
        
        // Lecture - 30 is all about intellij idea instructions

        // From here Lecture - 31 starts
        
        // int a = 5, b = 7;
        // System.out.println(logic(a, b));
        
        // int a1 = 12, b1 = 8;
        // System.out.println(logic(a1, b1));
        
        // If 'static' is not used in the method then we need to make object of that class
        // Chap_7_Lec_30_31_32_Java_Methods_Methods_Overloding obj = new Chap_7_Lec_30_31_32_Java_Methods_Methods_Overloding();
        // System.out.println(obj.logic(a, b));
        // System.out.println(obj.logic(a1, b1));
        
        // From here Lecture - 32 starts

        // jokes();

        // Changing the integer : In this case the value of integer will not change 
        // int p = 200;
        // change(p);
        // System.out.println("The value of p after change is : " + p);

        // Changing an array : In this case the value of array will change
        // int [] marks = {88, 91, 67, 45, 74, 39};
        // change2(marks);
        // System.out.println("The value of marks[0] after changing : " + marks[0]);

        // Method Overloding

        foo();
        foo(1000);
        foo(2000,'B');
        // In method overloding name can be same but parameters should be different but can not change retrun type of method.


    }

}
