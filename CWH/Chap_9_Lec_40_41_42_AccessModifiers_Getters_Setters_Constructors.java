package CWH;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        this.name = n;
    }
    public int getId()
    {
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int id)
    {
        this.id = id;
    }
}

// Quick Quiz
class Circle{
    private int radius;
    private int circumference;
    private int area;

    public void setRadius(int r)
    {
        this.radius = r;
    }
    public void setCircumference(int c)
    {
        if(c == 2 * 3 * radius)
        {
            this.circumference = c;
        }
        else
        {
            System.out.println("Enter a correct circumference");
        }
    }
    public void setArea(int a){
        if(a == 3 * radius * radius)
        {
            this.area = a;
        }
        else
        {
            System.out.println("Enter a correct area");
        }
    }
    public int getCircumference()
    {
        return circumference;
    }
    public int getArea()
    {
        return area;
    }

}

// From here Lecture - 42 starts

class MyMainEmployee{
    private int id;
    private String name;

    public void setName(String n){this.name = n;}
    public void setId(int i){this.id = i;}
    public String getName(){return name;}
    public int getId(){return id;}

    public MyMainEmployee(){
        id = 4321;
        name = "Sonika";
    }

    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
}


public class Chap_9_Lec_40_41_42_AccessModifiers_Getters_Setters_Constructors {
    public static void main(String[] args) {
        System.out.println("In this lecture we will be studying about Access Modifiers, Getters and Setters and Constructors");

        MyEmployee avinash = new MyEmployee();
        // avinash.id = 9122;                       These two lines will throw an error due to private access modifiers
        // avinash.name = "Avinash Kumar Singh";  
        
        avinash.setName("Avinash Kumar Singh");
        avinash.setId(9122);

        // System.out.println("My namae is " + avinash .getName());
        // System.out.println("My id is " + avinash.getId());

        // Quick Quiz : Make a getter and setter for a circle and if you set wrong they give a warning

        // Circle c = new Circle();
        // c.setRadius(5);
        // c.setCircumference(300);
        // c.setArea(775);
        // System.out.println("Area = " + c.getArea());
        // System.out.println("Circumference = " + c.getCircumference());

        // Lecture 41 is about soving Exercise 2 which i alreaey solved in lecture 20

        // From here Lecture - 42 starts

        // MyMainEmployee avi = new MyMainEmployee();
        // avi.setName("Avinash Kumar Singh");
        // avi.setId(91226433);
        // System.out.println("My name is "+ avi.getName());
        // System.out.println("My id is "+ avi.getId());
        
        // MyMainEmployee avs = new MyMainEmployee();
        // System.out.println("My name is "+ avs.getName());
        // System.out.println("My id is "+ avs.getId());

        // MyMainEmployee avii = new MyMainEmployee("Monika",1234);
        // System.out.println("My name is "+ avii.getName());
        // System.out.println("My id is "+ avii.getId());

    }
}
