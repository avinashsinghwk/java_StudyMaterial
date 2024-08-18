package CWH;

public class Chap_2_Lec_10_11_Resulting_DataTypes {
    public static void main(String[] args) {
        System.out.println(
                "In this lecture we are going to study about Resulting data types i.i.e Literals and Increment and Decrement Operators");

        // float a = 47 + 4.4f;
        // System.out.println(a);

        // Increment and Decrement Operators .

        // int i = 56;
        // System.out.println(i++);
        // System.out.println(i);

        // int j = 38;
        // System.out.println(++j);
        // System.out.println(j);

        // int k = 97;
        // System.out.println(k--);
        // System.out.println(k);

        // int l = 35;
        // System.out.println(--l);
        // System.out.println(l);

        // char cr = 'C';
        // System.out.println(cr++);
        // System.out.println(cr);
        // System.out.println(++cr);

        // Quick Quiz
        // Find x; int y = 7; int x = ++y * 8

        int y = 7;
        int x = ++y * 8; // precedence of ++ is greater than *
        System.out.println(x);


        // Lecture 11 is the solution of the Exercise 1 which i have solved in
        // Practice_Problem_CWH Ex_1_Lec_6

    }

}
