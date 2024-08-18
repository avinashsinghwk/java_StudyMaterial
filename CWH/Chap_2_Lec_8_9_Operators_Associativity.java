package CWH;

public class Chap_2_Lec_8_9_Operators_Associativity {
    public static void main(String[] args) {
        System.out.println("In this lecture we will be studying about Operators and Precendence and Associativity");
        // Arithmetic Operator :->

        // int a = 4;
        // int b = 6 % a; // Modulo Operator
        // System.out.println(b);

        // Assignment Operator :->

        // int b = 9;
        // b *= 3;
        // System.out.println(b);

        // Comparison Operator :->

        // System.out.println(54 <= 64);

        // Logical Operator :->

        // System.out.println(64>5 && 3>24); // (Both should true, then it will be true)
        // System.out.println(53<6 || 35<3); // (Either one or both should true
        // then it will be true )

        // Bitwise Operators :->
        // System.out.println(2 & 3);
        // System.out.println(2 | 3);

        // From here Lecture 9 starts

        // Precedence and Associativity :---->

        // int a = 6 * 5 - 34 / 2;
        /*
         * = 30-34/2 (Associativity of * , / is left to right)
         * = 30-17 (Precedence of * and / is same)
         * = 13
         */
        // System.out.println(a);

        // int K = 60 / 5 - 34 * 2;
        /*
         * = 12-34*2
         * = 12-68
         * = -56
         */
        // System.out.println(K);

        // Quick Quiz

        // 1. (x - y)
        //    -------
        //       2
        // int x = 7;
        // int y = 1;
        // int k = (x - y) / 2;
        // System.out.println(k);

        // 2. (b^2 - 4ac)
        //    ------------
        //        2a
        // int a = 5;
        // int b = 1;
        // int c = 4;
        // float z = (b * b - 4 * a * c) / (2f * a);
        // System.out.println(z);

        // 3. V^2 - U^2
        // int v = 6;
        // int u = 4;
        // int p = (v * v - u * u);
        // System.out.println(p);

        // 4. r * m -n
        // int r = 9;
        // int m = 8;
        // int n = 3;
        // int e = (r * m - n);
        // System.out.println(e);

    }
}
