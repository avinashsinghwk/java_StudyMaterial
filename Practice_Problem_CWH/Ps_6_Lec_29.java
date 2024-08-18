package Practice_Problem_CWH;

public class Ps_6_Lec_29 {
    public static void main(String[] args) {
        System.out.println("In this lecture we will be solving practice problem 6");

        // Question 1. Create an array of 5 floats and calcualte their sum
        // float [] marks = {1.2f, 0.18f, 6.25f, 8.91f, 9.21f};
        // float sum = 0;
        // for(float element : marks){
        // sum = sum + element;
        // }
        // System.out.println("The sum of the five floats = " + sum);

        // Question 2. Write a program to find out whether a given integer is presint in
        // a array or not
        // int [] marks = {1, 2, 3, 4, 5};
        // int check = 3;
        // boolean checker = false;
        // for(int i = 0; i < marks.length; i++){
        // if(i == check){
        // checker = true;
        // break;
        // }
        // }
        // if(checker){
        // System.out.printf("Yes, %d is present in this array", check);
        // }
        // else{
        // System.out.printf("No, %d is not present in this array", check);
        // }

        // Question 3. Calculate the average marks from an array containing marks of all
        // subjects in Physics using for each loop
        // int [] marks = {77, 92, 86, 61, 98, 21};
        // int sum = 0;
        // for(int element : marks){
        // sum = sum + element;
        // }
        // float avg = sum / (float) marks.length;
        // System.out.println("The average marks = " + avg);

        // Question 4. Create a java program to add two matrics of size 2 X 3.
        // int[][] matrics1 = { { 1, 2, 3, }, { 4, 5, 6 } };
        // int[][] matrics2 = { { 7, 8, 9 }, { 1, 0, 1 } };
        // int[][] matrics3 = new int[2][3];
        // for (int i = 0; i < matrics3.length; i++) {
        // for (int j = 0; j < matrics3[i].length; j++) {
        // matrics3[i][j] = matrics1[i][j] + matrics2[i][j];
        // System.out.print(matrics3[i][j]);
        // System.out.print(" ");
        // }
        // System.out.println("");
        // }

        // Question 5. Write a java program to reverse an array
        // int [] arr = {1, 20, 3, 40, 5};
        // for(int i = arr.length - 1; i >= 0; i-- ){
        // System.out.print(arr[i]);
        // System.out.print(" ");
        // }

        // Swap Method : If we want to swap then make a empty data type place 1st thing in it then place 2nd thing in 1st thing then value of the data type is placed in 2nd.
        // int temp;
        // for(int i = 0; i < arr.length / 2; i++){
        //     temp = arr[i];
        //     arr[i] = arr[arr.length - 1 - i ];
        //     arr[arr.length - 1 - i ] = temp;
        // }
        // for(int element : arr)
        // {
        //     System.out.print(element + " ");
        // }

        // Question 6. Write a java program to find the maximum element in an array
        // int [] arr = {1, 2, 301, 40, 5};
        // int max = Integer.MIN_VALUE;
        // for(int element : arr){
        // if(element > mawx){
        // max = element;
        // }
        // }
        // System.out.format("The maximum element in this array is %d", max);
        // System.out.println("");

        // Question 7. Write a java program to find the minimum element in an array
        // int [] arr2 = {1, 2, 301, 40, -5};
        // int min = Integer.MAX_VALUE;
        // for(int element2 : arr2){
        // if(element2 < min){
        // min = element2;
        // }
        // }
        // System.out.printf("The minimum element in this array is %d", min);
        // System.out.println("");

        // Question 8. Write a java program to find whether an array is sorted or not
        // int[] arr = { 3, 14, 5, 98, 149 };
        // boolean checker = true;
        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i] > arr[i + 1]) {
        //         checker = false;
        //         break;
        //     }
        // }
        // if (checker) {
        //     System.out.println("Yes, This array is sorted");
        // } else {
        //     System.out.println("No, This array is not sorted");
        // }

    }
}
