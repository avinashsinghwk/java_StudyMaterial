package Practice_Problem_CWH;

import java.util.Random;
import java.util.Scanner;

public class Ex_2_Lec_20_Rock_Paper_Scessior {
    public static void main(String[] args) {
        System.out.println("Let's Play Rock Paper Scessior");
        Scanner S = new Scanner(System.in);
        Random R = new Random();

        System.out.println("Type 1 for Rock, 2 for Paper and 3 for Scessior");
        int random = R.nextInt(1, 4);
        System.out.print("Enter Your Choice: ");
        byte choice = S.nextByte();

        if (choice == 1) {
            System.out.println("You Choose Rock ");
        } else if (choice == 2) {
            System.out.println("You Choose Paper ");
        } else if (choice == 3) {
            System.out.println("You Choose Scesssior ");
        } else {
            System.out.println("Sorry! We cannot proceed. You Choose a Wrong number. ");
        }

        if (choice == 1 || choice == 2 || choice == 3) {

            if (random == 1) {
                System.out.println("Computer Choose Rock ");
            } else if (random == 2) {
                System.out.println("Computer Choose Paper ");
            } else if (random == 3) {
                System.out.println("Computer Choose Scesssior ");
            }

            if ((random == choice)) {
                System.out.println("Match Draw");
            } else if ((random == 3 && choice == 1) || (random == 1 && choice == 2) || (random == 2 && choice == 3)) {
                System.out.println("You Win");
            } else {
                System.out.println("You Lose");
            }
        }

        S.close();
    }

}
