// package Practice_Problem_CWH;
import java.util.Scanner;

class Library
{
    Scanner sc = new Scanner(System.in);
    public String tBooks[] = new String[15];
    String availableBooks[] = new String[10];
    String issuedBooks[] = new String[10];
    int totalBook = 10, totalAvailableBook = 5, totalIssuedBook = 5;

    public Library()
    {
        tBooks[0] = "ANNA KARENINA BY LEO TOLSTOY";
        tBooks[1] = "TO KILL A MOCKINGBIRD BY HARPER LEE";
        tBooks[2] = "THE UNDERGROUND RAILROAD BY COLSON WHITEHEAD";
        tBooks[3] = "THE RETURN: FATHERS, SONS AND THE LAND IN BETWEEN By HISHAM MATAR";
        tBooks[4] = "AND THEN THERE WERE NONE BY AGATHA CHRISTIE";
        tBooks[5] = "The Flame and the Flower By Barbara Cartland";
        tBooks[6] = "DR. SLUMP BY AKIRA TORIYAMA";
        tBooks[7] = "THE CATCHER IN THE RYE BY J.D. SALINGER";
        tBooks[8] = "THE DA VINCI CODE BY DAN BRWON";
        tBooks[9] = "HARRY POTTER AND THE PHILOSOPHER'S STONE BY J.K. ROWLING";

        issuedBooks[0] = "THE RETURN: FATHERS, SONS AND THE LAND IN BETWEEN By HISHAM MATAR";
        issuedBooks[1] = "AND THEN THERE WERE NONE BY AGATHA CHRISTIE";
        issuedBooks[2] = "THE FLAME AND THE FLOWER BY BARBARA CARTLAND";
        issuedBooks[3] = "DR. SLUMP BY AKIRA TORIYAMA";
        issuedBooks[4] = "THE CATCHER IN THE RYE BY J.D. SALINGER";

        availableBooks[0] = "ANNA KARENINA BY LEO TOLSTOY";
        availableBooks[1] = "TO KILL A MOCKINGBIRD BY HARPER LEE";
        availableBooks[2] = "THE UNDERGROUND RAILROAD BY COLSON WHITEHEAD";
        availableBooks[3] = "THE DA VINCI CODE BY DAN BRWON";
        availableBooks[4] = "HARRY POTTER AND THE PHILOSOPHER'S STONE BY J.K. ROWLING";

    }
        
    void showTotalBooks()
    {
        System.out.println("\n------------------------------------------");
        System.out.println("......... Total Books in the Library .........");
        for(int i = 0; i < totalBook; i++)
        {
            System.out.println(i + 1 +  ".  " + tBooks[i]);
        }
        System.out.println("------------------------------------------\n");
    }

    void showAvailableBooks()
    {
        System.out.println("\n------------------------------------------");
        System.out.println("...... All Available Books .......");
        for(int i = 0; i < totalAvailableBook; i++)
        {
            System.out.println(i + 1 +  ".  " + availableBooks[i]);
        }
        System.out.println("------------------------------------------\n");
    }
    

    void showIssuedBooks()
    {
        System.out.println("\n------------------------------------------");
        System.out.println("...... All Issued Books .......");
        for(int i = 0; i < totalIssuedBook; i++)
        {
            System.out.println(i + 1 +  ".  " + issuedBooks[i]);
        }
        System.out.println("------------------------------------------\n");
    }

    void addBook(String s)
    { 
        tBooks[totalBook] = s.toUpperCase();
        this.totalBook++;
        availableBooks[totalAvailableBook] = s.toUpperCase();
        this.totalAvailableBook++;
    }

    void issueBook(String s)
    { 
        int a = 0;
        boolean finder = false;
        for(String book : availableBooks)
        {
            if(s.equalsIgnoreCase(book))
            {
                finder = true;
                break;
            }
            a++;
        }
        if(finder == false)
            {
                System.out.println("This book is not available");
                showAvailableBooks();
            }
        else
            {
                issuedBooks[totalIssuedBook] = s.toUpperCase();
                this.totalIssuedBook++;
                while(a != totalAvailableBook - 1)
                {
                    availableBooks[a] = availableBooks[a + 1];
                    a++;
                }
                this.totalAvailableBook--;
                availableBooks[a] = null;
            }
    }

    void returnBook(String s)
    {
        int a = 0;
        boolean finder = false;
        String adder;
        for(String book : issuedBooks)
        {
            if(s.equalsIgnoreCase(book))
            {
                finder = true;
                break;
            }
            a++;
        }
        if(finder == false)
        {
            System.out.println("This book is not present in issued books");
            showIssuedBooks();
            System.out.print("Do you want to add this book Type (Yes/No) : " );
            adder = sc.next();
            if(adder.equalsIgnoreCase("yes"))
            {
                addBook(s.toUpperCase());
            }
        }
        else
        {
            availableBooks[totalAvailableBook] = s.toUpperCase();
            this.totalAvailableBook++;
            while(a != totalIssuedBook - 1)
            {
                issuedBooks[a] = issuedBooks[a + 1];
                a++;
            }
            totalIssuedBook--;
            issuedBooks[a] = null;
        }
    }
    
}

public class Ex_4_Lec_51_Library 
{
    public static void main(String[] args) {
        System.out.println("...... WELCOME TO MY LIBRARY .......");

        // Ex - 4 Lec - 51
        /* 
        You have to implement a library using java class Library
        Methods : addBook(), issueBook(), returnBook(), showAvailableBooks()
        Properties : array to store availabe tBooks and issued tBooks 
        */

        int ch;
        String aBook, iBook, rBook;
        Library lib = new Library();
        
        do
        {
            Scanner S = new Scanner(System.in);
            Scanner S1 = new Scanner(System.in);
            System.out.println("Type 1 -- To know total book in library");
            System.out.println("Type 2 -- To know total available book in library");
            System.out.println("Type 3 -- To know total issued book in library");
            System.out.println("Type 4 -- To add a book");
            System.out.println("Type 5 -- To issue a book");
            System.out.println("Type 6 -- To return a book");
            System.out.println("Type 7 -- To exit");
            System.out.print("Enter your choice : ");
            ch = S.nextInt();
            
            switch (ch)
            {
            case 1 :
            {
                lib.showTotalBooks();
            }
            break;
            case 2 :
            {
                lib.showAvailableBooks();
            }
            break;
            case 3 :
            {
                lib.showIssuedBooks();
            }
            break;
            case 4 :
            {
                System.out.print("Enter a book you want to add : ");
                aBook = S1.nextLine();
                lib.addBook(aBook);
            }
            break;
            case 5 :
            {
                System.out.print("Enter a book you want to issue : ");
                iBook = S1.nextLine();
                lib.issueBook(iBook);
            }
            break;
            case 6 :
            {
                System.out.print("Enter the book you want to return : ");
                rBook = S1.nextLine();
                lib.returnBook(rBook);
            }
            break;
            case 7 :
            {
                System.exit(0);
                S.close();
                S1.close();
            }
            break;
            default :
            {
                System.out.println("\nType a correct number\n");
            }
            
        }
    }while(true);

}       
    }

