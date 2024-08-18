package CWH;

// From here Lectue - 70 starts

// class MyThread1 extends Thread // inheriting Thread class i.e built in
// {
//     @Override
//     public void run() // run() is a method in Thread class
//     {
//         int i = 0;
//         while (i < 1000) {
//             System.out.println("My thread 1");
//             i++;
//         }
//     }
// }

// class MyThread2 extends Thread // inheriting Thread class i.e built in
// {
//     @Override
//     public void run() // run() is a method in Thread class
//     {
//         int i = 0;
//         while (i < 1000) {
//             System.out.println("My thread 2");
//             i++;
//         }
//     }
// }

// From here Lectue - 71 starts

// class MyThreadRunnable1 implements Runnable // implementing 'Runnable' interface i.e built in
// {
//     public void run() {
//         int i = 0;
//         while(i < 100)
//         {
//             System.out.println("MyThreadRunnable1 1");
//             i++;
//         }
//     }
// }

// class MyThreadRunnable2 implements Runnable // implementing 'Runnable' interface i.e built in
// {
//     public void run() {
//         int i = 0;
//         while(i < 100)
//         {
//             System.out.println("MyThreadRunnable2 2");
//             i++;
//         }
//     }
// }

public class Chap_13_Lec_69_70_71_72_MultiThreading_LifeCycleOfThread {
    public static void main(String[] args) {
        System.out.println("In this lecture i will be learning Multithreading in java");

        // Lectue - 69 is all about the theory so no code

        // We can make our program multithreading by 2 ways Ist by extends 'Thread' class or 2nd by implents 'Runnable' interface

        // From here Lectue - 70 starts

        // MyThread1 th1 = new MyThread1();
        // MyThread2 th2 = new MyThread2();
        // th1.start(); // start() is a function in class 'Thread' used to execute function run();
        // th2.start();

        // There are various methods in class 'Thread' go to docs and see

        // From here Lectue - 71 starts
        // MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        // Thread gun1 = new Thread(bullet1);  // reference of class object is passed as argument in the object of class 'Thread'

        // MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        // Thread gun2 = new Thread(bullet2);

        // gun1.start();
        // gun2.start();

        // Lectue - 72 is all the life cycle of a thread

        // First process is 'new' in this thread is created and it is before the invocation of start()
        // The it becomes 'Runnable' after the invocation of start() and befor it is selected by the schudler to run
        // if is selected by the schudler it becomes 'Running'
        // and if it is not selected it becomes 'Non Runnable' and Non Runnable can be selected after some times and it will execute this
        // and when every instructions would be fullfiled then if 'terminated' i.e run() method has ended
        

    }
}
