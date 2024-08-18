package Practice_Problem_CWH;

import java.util.Scanner;

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "You can not choose 8 or 9 as input";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Input can not be greater than 1 Lakh";
    }
}

class MaxMultiplierException extends Exception {
    @Override
    public String toString() {
        return "Multiplier can not be greater than 7000";
    }
}

class CanNotDivideBy0Exception extends Exception {
    @Override
    public String toString() {
        return "Number can not be divided by 0";
    }
}

class Calculator {
    Scanner S = new Scanner(System.in);

    public int Addition(int a, int b) throws InvalidInputException, MaxInputException {
        if (a == 8 || a == 9 || b == 8 || b == 9) {
            throw new InvalidInputException();
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a + b;
    }

    public int Subraction(int a, int b) throws InvalidInputException, MaxInputException {
        if (a == 8 || a == 9 || b == 8 || b == 9) {
            throw new InvalidInputException();
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a - b;
    }

    public int Multiplication(int a, int b) throws InvalidInputException, MaxInputException, MaxMultiplierException {
        if (a == 8 || a == 9 || b == 8 || b == 9) {
            throw new InvalidInputException();
        }
        if (b > 7000) {
            throw new MaxMultiplierException();
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a * b;
    }

    public int Division(int a, int b) throws InvalidInputException, MaxInputException, CanNotDivideBy0Exception {
        if (a == 8 || a == 9 || b == 8 || b == 9) {
            throw new InvalidInputException();
        }
        if (b == 0) {
            throw new CanNotDivideBy0Exception();
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a / b;
    }
}

public class Ex_6_Lec_87_Calculator_Exception {
    public static void main(String[] args) {

        /*
         * Create a custom calculator with following operations
         * a> + -> Addition
         * b> - -> Subraction
         * c> * -> Multiplication
         * d> / -> Division
         * Which thow the following exceptions
         * a> invalid input exception eg: 8 & 9
         * b> can not divide by 0 exception
         * c> max input exception if any of the input is greater than 1 lakh
         * d> max multiplier reached exception if inputted is greater than 7000
         */

        System.out.println("------- CALCULATOR --------");
        Calculator c = new Calculator();
        Scanner S = new Scanner(System.in);
        int num1, num2;
        char oper;
        System.out.print("Enter num1 : ");
        num1 = S.nextInt();
        System.out.print("Enter Operator : ");
        oper = S.next().charAt(0);
        System.out.print("Enter num2 : ");
        num2 = S.nextInt();
        switch (oper) {
            case '+' -> {
                try {
                    int result = c.Addition(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + result);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            case '-' -> {
                try {
                    int result = c.Subraction(num1, num2);
                    System.out.println(num1 + " - " + num2 + " = " + result);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            case '*' -> {
                try {
                    int result = c.Multiplication(num1, num2);
                    System.out.println(num1 + " X " + num2 + " = " + result);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            case '/' -> {
                try {
                    int result = c.Division(num1, num2);
                    System.out.println(num1 + " X " + num2 + " = " + result);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            default -> System.out.println("Choose a valid operator");
        }
        S.close();

    }
}