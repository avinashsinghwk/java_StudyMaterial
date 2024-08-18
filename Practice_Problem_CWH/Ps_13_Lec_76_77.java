package Practice_Problem_CWH;

// Question 1, 2, 3, 4, 5
class GoodMoring extends Thread
{
    public void run()
    {
        int i = 0;
        while(i < 100)
        {
            System.out.println("Good Morning");
            i++;
        }
    }
}

class Welcome extends Thread
{
    public void run()
    {
        int i = 0;
        while(i < 100)
        {
            System.out.println("Welcome");
            i++;

            // This is for Question - 2
            // try{
            //     Thread.sleep(200);
            // }
            // catch(Exception e)
            // {
            //     System.out.println(e);
            // }
            // ------------------------

        }
    }
}

public class Ps_13_Lec_76_77 {
    public static void main(String[] args) {
        System.out.println("In this lecture i will be solving practice problem 13");

        // Question 1. Write a program to print "Good Morning" and "Welcome" contineously on the screen using Thread
        // GoodMoring gd = new GoodMoring();
        // Welcome w = new Welcome();
        // gd.start();
        // w.start();

        // Question 2. Add a sleep method sleep() in Welcome thread to delay it's execution by 200ms in Q - 1
        // GoodMoring gd = new GoodMoring();
        // Welcome w = new Welcome();
        // gd.start();
        // w.start();

        // Question 3. Demonstrate getPriority() and setPriority method in java Thread
        // GoodMoring gd = new GoodMoring();
        // Welcome w = new Welcome();
        // gd.setPriority(6);
        // w.setPriority(8);
        // gd.start();
        // w.start();
        // System.out.println("I am gd and my priority is " + gd.getPriority());
        // System.out.println("I am w and my priority is " + w.getPriority());

        // Question 4. How do you get state of a given thread in java ? 
        // GoodMoring gd = new GoodMoring();
        // Welcome w = new Welcome();
        // gd.start();
        // System.out.println("The state of gd is " + gd.getState());
        // System.out.println("The state of w is " + w.getState());

        // Question 5. How do you get reference of current thread in java ?
        // GoodMoring gd = new GoodMoring();
        // Welcome w = new Welcome();
        // gd.start();
        // w.start();
        // System.out.println("The reference of gd is " + gd.currentThread());
        // System.out.println("The reference of w is " + w.currentThread());

        // Lectue - 77 is all about solving Ex - 5 which i already solved in Lecute - 68
    }
    
}
