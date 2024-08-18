package Practice_Problem_CWH;

import java.util.Scanner;

public class Ex_1_Lec_6_Percentage_of_CBSE {
    public static void main(String[] args) {
        System.out.println("Convert your marks in percentage");

        Scanner S = new Scanner(System.in);

        System.out.print("Type your English marks: ");
        float eng = S.nextFloat();
        System.out.print("Type your Mathematics marks: ");
        float mat = S.nextFloat();
        System.out.print("Type your Physics marks: ");
        float phy = S.nextFloat();
        System.out.print("Type your Chemistry marks: ");
        float che = S.nextFloat();
        System.out.print("Type your Physical Education marks: ");
        float phyE = S.nextFloat();
        System.out.print("Type your Total marks: ");
        float tMarks = S.nextFloat();
        
        float marksObtained = eng + mat + phy + che + phyE ;
        System.out.println("Total Marks Obtained = "+ marksObtained);

        float percent = (marksObtained/tMarks)*100;
        System.out.println("You got: "+ percent + "%");

        S.close();

    }
}