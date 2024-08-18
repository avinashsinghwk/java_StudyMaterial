package CWH;
import java.util.Scanner;

public class Chap_6_Lec_26_27_28_Array_forEachLoop_MultidimentionalArray {
    public static void main(String[] args) {
        System.out.println(
                "In this chapter we will be studying about Arrays and for Each Loop and Multidimentional Arrays");
                Scanner S = new Scanner(System.in);

        // Three ways to write an array in java
        // 1. Decleration and memory allocation and then ititialization
        // int [] marks = new int[10];

        // 2. Declaration and then memory allocation and then initialization
        // int[] marks;
        // marks = new int[5];
        // Intialization
        // marks[0] = 50;
        // marks[1] = 64;
        // marks[2] = 21;
        // marks[3] = 87;
        // marks[4] = 91;
        // marks[4] = 19;
        // marks[5] = 99; This will throw a error
        // System.out.println(marks[4]);

        // 3. Declaration and initialization together
        // int [] marks = {23, 53, 89, 95};
        // System.out.println(marks[1]);
        
        // From here Lecture - 27 starts

        // float [] marks2 = {23.65f, 53.74F, 89.1f, 95};
        // System.out.println(marks2.length);
        // System.out.println(marks2[3]);

        // String[] students = { "Avinash", "Manish", "Abhay", "Kushi" };
        // System.out.println(students.length);

        // Displaying an array (for loop)
        // for(int i = 0; i < students.length; i++){
        // System.out.println(students[i]);
        // }

        // Quick Quiz: Displaying the array in reverse order
        // for(int i = students.length - 1; i >= 0; i-- ){
        // System.out.println(students[i]);
        // }

        // For Each loop
        // for (String element : students) {
        //     System.out.println(element);
        // }

        // From here Lecture - 28 starts

        // Multidimentional Arrays
        // int [][] flats;
        // flats = new int[2][3];
        // flats[0][0] = 101;
        // flats[0][1] = 102;
        // flats[0][2] = 103;
        // flats[1][0] = 201;
        // flats[1][1] = 202;
        // flats[1][2] = 203;

        // System.out.println(flats[0][2]);
        // System.out.println(flats.length);
        // System.out.println(flats[0].length);
        // System.out.println(flats[1].length);

        // Displaying multidimentional array
        // for(int i = 0; i < flats.length; i++){
        //     for(int j = 0; j < flats[i].length; j++){
        //         System.out.print(flats[i][j] + " ");
        //     }
        //     System.out.println("");
        // }

        S.close();



       

    }
} 