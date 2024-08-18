package CWH;

// From here Lecture - 57 starts (Default Mehtod)
// interface MyCamera 
// {
//     void takeSnap();
//     void recordVideo();
//     private void password()
//     {
//         System.out.println("Your password is 83j93jn");  
//     }
//     default void recordVideoIn4K()
//     {
//         password();
//         System.out.println("Recording in 4k");
//     }
// }
// interface MyWifi
// {
//     String[] getNetworks();
//     void connectToNetwork(String network);
// }
// class MyCellPhone
// {
//     void callPhone(int phoneNumber)
//     {
//         System.out.println("Calling ... " + phoneNumber);
//     }
//     void pickCall()
//     {
//         System.out.println("Connecting ... ");
//     }
// }
// class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi
// {
//     public void takeSnap()
//     {
//         System.out.println("Taking Snap");
//     }
//     public void recordVideo()
//     {
//         System.out.println("Recording");
//     }
//     public void recordVideoIn4K()
//     {
//         System.out.println("Taking screenshot and recording in 4k");
//     }
//     public String[] getNetworks()
//     {
//         String networkList[] =  {"AIRTEL", "JIO", "VODAPHONE", "IDEA"};
//         return networkList;
//     }
//     public void connectToNetwork(String network)
//     {
//         System.out.println("Connecting to ..... " + network);
//     }
// }

// From here Lecture - 58 starts (Inheritance in Interface)

// interface SampleInterface
// {
//     void meth1();
// }
// interface ChildSampleInterface extends SampleInterface
// {
//     void meth2();
// }
// class MySampleClass implements ChildSampleInterface
// {
//     public void meth1()
//     {}
//     public void meth2()
//     {}
// }

// From here Lecture - 59 starts (Polymorphism)

// interface MyCamera 
// {
//     void takeSnap();
//     void recordVideo();
// }
// interface MyWifi
// {
//     String[] getNetworks();
//     void connectToNetwork(String network);
// }
// class MyCellPhone
// {
//     void callPhone(int phoneNumber)
//     {
//         System.out.println("Calling ... " + phoneNumber);
//     }
//     void pickCall()
//     {
//         System.out.println("Connecting ... ");
//     }
// }
// class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi
// {
//     public void takeSnap()
//     {
//         System.out.println("Taking Snap");
//     }
//     public void recordVideo()
//     {
//         System.out.println("Recording");
//     }
//     public String[] getNetworks()
//     {
//         String networkList[] =  {"AIRTEL", "JIO", "VODAPHONE", "IDEA"};
//         return networkList;
//     }
//     public void connectToNetwork(String network)
//     {
//         System.out.println("Connecting to ..... " + network);
//     }
// }



public class Chap_11_Lec_56_57_58_59_DefaultMethod_InheritanceInInterface_Polymorphism
{
    public static void main(String[] args) {
        System.out.println("In this lecture i will be learning about Default Method Inheritance in Interface and Ploymorphism in Interface");

        // Lectute - 56 is all about theory

        // From here Lecture - 57 starts (Default Mehtod)

        // MySmartPhone ms = new MySmartPhone();
        // String arr[] = ms.getNetworks();
        // for(String network : arr)
        // {
        //     System.out.println(network);
        // }
        // ms.recordVideoIn4K();
        // ms.password();   // It is private so we can not access it

        // From here Lecture - 58 starts (Inheritance in Interface)

        // MySampleClass ms = new MySampleClass();
        // ms.meth1();
        // ms.meth2();

        // From here Lecture - 59 starts (Polymorphism)

        // MyCamera myCam = new MySmartPhone();
        // myCam.takeSnap();
        // myCam.recordVideo();
        // myCam.getNetworks();  // Here reference is of camera so we can not acces interface wifi method

        // MySmartPhone mysmt = new MySmartPhone();
        // mysmt.takeSnap();
        // mysmt.recordVideo();
        // mysmt.connectToNetwork("Airtel");
        // String arre[] = mysmt.getNetworks();
        // for(String network : arre)
        // {
        //     System.out.print(network + "\t");
        // }
        // System.out.println();
        // mysmt.callPhone(9122);
        // mysmt.pickCall();

    }
}