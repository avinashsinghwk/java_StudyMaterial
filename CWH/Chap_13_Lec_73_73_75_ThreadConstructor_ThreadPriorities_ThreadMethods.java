package CWH;

// Thread Constructor (Lecture - 73)
// class MyThr extends Thread 
// {
//     public MyThr(String name) // making a constructor of our class which takes a String and passing this String to super() to invoke the constructor of 'Thread'
//     {
//         super(name);
//     }
//     public void run()
//     {
//         int i = 0;
//         while(i < 5)
//         {
//             System.out.println("I am thread");
//             i++;
//         }
//     }
// }

// Thread Priorities (Lecture - 74)
// class MyThr1 extends Thread 
// {
//     public MyThr1(String name) 
//     {
//         super(name);
//     }
//     public void run()
//     {
//         int i = 0;
//         while(i < 100)
//         {
//             System.out.println("I am thread and my name is " + this.getName());
//             i++;
//         }
//     }
// }

// Thread Methods (Lecture - 75)
class MyThr2 extends Thread 
{
    public void run()
    {
        int i = 0;
        while(i < 10)
        {
            System.out.println("I am thread in class MyThr2");
            i++;
        }
    }
}
class MyThr3 extends Thread 
{
    public void run()
    {
        int i = 0;
        while(i < 10)
        {
            System.out.println("I am thread in class MyThr3");
            i++;
            try
            {
                Thread.sleep(500);
            } catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

public class Chap_13_Lec_73_73_75_ThreadConstructor_ThreadPriorities_ThreadMethods {
    public static void main(String[] args) {
        System.out.println("IN this lecture i will be learning about Thread Constructor, Thread Priorities and Thread Methods");

        // Thread Constructor (Lecture - 73)
        // MyThr mt1 = new MyThr("Avinash");
        // MyThr mt2 = new MyThr("Muskan");
        // mt1.start();
        // mt2.start();

        // System.out.println("The id of the thread 'mt1' is " + mt1.threadId());
        // System.out.println("The name of the thread 'mt1' is " + mt1.getName());

        // System.out.println("The id of the thread 'mt2' is " + mt2.threadId());
        // System.out.println("The name of the thread 'mt2' is " + mt2.getName());

        // Thread Priorities (Lecture - 74)
        // MyThr1 mt1 = new MyThr1("Avinash");
        // MyThr1 mt2 = new MyThr1("Muskan (Let's say High Priority work)");
        // MyThr1 mt3 = new MyThr1("Manish");
        // MyThr1 mt4 = new MyThr1("Kushi");
        // MyThr1 mt5 = new MyThr1("Abhay");

        // mt2.setPriority(Thread.MAX_PRIORITY); // setting maximum priority
        // mt5.setPriority(Thread.MIN_PRIORITY);

        // mt1.start();
        // mt2.start();
        // mt3.start();
        // mt4.start();
        // mt5.start();

        // Thread Methods (Lecture - 75)
        MyThr2 mt = new MyThr2();
        MyThr3 mt1 = new MyThr3();

        // join() Method

        // mt.start();
        // try{
        //     mt.join();
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }
        // mt1.start();

        // interrupt() Method

        mt.start();
        mt1.start();


    }
    
}
