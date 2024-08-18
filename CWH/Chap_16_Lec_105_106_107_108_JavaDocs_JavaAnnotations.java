package CWH;

/**
 * This is my class Bkwass
 * @author Bkwass Babu
 * @version 9122
 * @since today
 */
class Bkwass {
    @Deprecated
    public int jodh(int k, int l){return k + l;}
}

/**
 * This is my interface 
 * @author interface bahiya
 */
@FunctionalInterface
interface MyFunctionalInterface {
    void thisMethod();
}

/**
 * I have created my first java docs, This class contains a add() method which is used to add two numbers
 * @author Avinash Kumar Singh
 * @version 0.1
 * @since 2018
 * @see Java Docs
 */
public class Chap_16_Lec_105_106_107_108_JavaDocs_JavaAnnotations {
    
    public Chap_16_Lec_105_106_107_108_JavaDocs_JavaAnnotations(){}
    /**
     * This is my constructor of 1 parameter
     * @param a
     */
    public Chap_16_Lec_105_106_107_108_JavaDocs_JavaAnnotations(int a){
        System.out.println(a);
    }
    /**
     * This is my constructor of two parameter
     * @param a
     * @param b
     */
    public Chap_16_Lec_105_106_107_108_JavaDocs_JavaAnnotations(int a, int b){
        System.out.println(a + b);
    }
    /**
     * This is my method to add two number and print
     * @param a This is a int argument of name a
     * @param b This is a int argument of name b
     * @return 0 This will alwasy return 0
     * @throws Exception if a = 9
     * @deprecated This method is depricated please use other method
     */
    public static int add(int a, int b) throws Exception{
        if (a == 9){throw new Exception();}
        System.out.println(a + " + " + b + " = " + (a + b));
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("In this i will be learning about Java Docs, tags, Method Tags, annotation");
        @SuppressWarnings("deprication")

        
        // Lecture - 105 (Java Docs)
        // This lecture is all about how can we make our own java docs 
        // write (javadoc filename with correct address) in the terminal
        // (javadoc -d hero javafile) to make and put all the html, css and js files in a file name 'hero'
        
        // Lecture - 106 (Class Tags)
        // Class Tags are written above the class and they render as a html file
        // add(11, 3);

        // Lecture - 107 (Method Tags)
        // Method Tags are written above the method 
        // @param 
        // @return
        // @depricated 
        // @throws 
        // For constructor we can also use this

        // Lecture - 108 (Annotation)
        // @Override  // We have used this annotation if we override a method
        // @SuppressWarnings // used to supress the generated warnings by the compiler
        // @Deprecated // Used to mark depricatd methods
        // @FunctionalInterface //used to ensure an interface is a functional interface (functional interface is interface that has only one abstract method)

        Bkwass b = new Bkwass();
        b.jodh(8, 9);
        

    }
    }