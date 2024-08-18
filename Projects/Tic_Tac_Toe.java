// package Projects;

import java.util.Scanner;

class AllException extends Exception {
    @Override
    public String toString() {
        return "Type a valid input";
    }
}

public class Tic_Tac_Toe {

    public static int gamePrinter(char a[][], int pos, char player) {
        int num = 1, placeFilled = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("     ");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("|");
                if (a[i][j] == 0) {
                    if (pos == num) {
                        a[i][j] = player;
                        System.out.print(" " + a[i][j] + " ");
                    } else {
                        System.out.print(" " + num + " ");
                    }
                } else {
                    System.out.print(" " + a[i][j] + " ");
                    if (pos == num) {
                        placeFilled = 1;
                    }
                }
                num++;
            }
            System.out.println("|");
        }
        if (placeFilled == 1) {
            System.out.println("This place is already filled");
        }
        return placeFilled;
    }

    static boolean winnerChecker(char ch[][], char player) {
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i][0] == player && ch[i][1] == player && ch[i][2] == player)
                    || (ch[0][i] == player && ch[1][i] == player && ch[2][i] == player)
                    || (ch[0][0] == player && ch[1][1] == player && ch[2][2] == player)
                    || (ch[0][2] == player && ch[1][1] == player && ch[2][0] == player)) {
                System.out.println("Player ' " + player + " ' won");
                return false;
            }
        }

        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[i].length; j++) {
                if (ch[i][j] == 0) {
                    return true;
                }
            }
        }
        System.out.println("Match Draw");
        return false;
    }

    static int input() throws AllException {
        Scanner S = new Scanner(System.in);
        int pos;
        pos = S.nextInt();
        if (pos < 1 || pos > 9) {
            try {
                throw new AllException();
            } catch (Exception e) {
                System.out.println(e);
                pos = 0;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        System.out.println("x-x-x-x- Tic Tac Toe -x-x-x-x\n");
        int pos, playerDecider = 1;
        char ch[][] = new char[3][3];
        boolean stopper = true;
        char player;

        gamePrinter(ch, 0, ' ');
        do {
            int inputMistatch = 1;
            while (inputMistatch == 1) {
                player = (playerDecider % 2 == 0) ? 'O' : 'X';
                System.out.print("Player '" + player + "' Position : ");
                try {
                    pos = input();
                    playerDecider = (pos == 0) ? (playerDecider + 1) : playerDecider ;
                    if (gamePrinter(ch, pos, player) == 1) {
                        playerDecider++;
                    }
                    stopper = winnerChecker(ch, player);
                    inputMistatch = 0;
                } catch (Exception e) {
                    System.out.println("Don't type a character");
                }
            }
            playerDecider++;
        } while (stopper);

    }
}