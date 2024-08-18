package CWH;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My name is " + name + "\nMy id is "+ id);
    }
     int getSalary(){
        return salary;
    }
}

public class Chap_8_Lec_36_37_38_Oops_CustomClass {
    public static void main(String[] args) {
        System.out.println("In this lecture we will be studying about Object Oriented Programming and Custom Class");

        // Lecture - 36 and 37 are all about the introduction of Oops

        // From here Lecture - 38 starts

         Employee harry = new Employee(); // Instantiating a new Employee Object

        // Setting properties/attributes
        harry.id = 9122;
        harry.name = "Avinash";
        harry.salary = 300;

        // Printing the properties
        // System.out.println(harry.id);
        // System.out.println(harry.name);

        harry.printDetails();
        System.out.println("My Salary is "+ harry.getSalary() + " Rs.");

        Employee john = new Employee();
        john.id = 7125;
        john.name = "John";
        john.salary = 321;

        john.printDetails();
        System.out.println("My Salary is "+ john.getSalary() + " Rs.");

    }
}
