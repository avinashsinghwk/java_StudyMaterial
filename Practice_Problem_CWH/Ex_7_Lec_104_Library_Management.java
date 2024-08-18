package Practice_Problem_CWH;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class MyLibrary {
    int tBooks, tTotalBooks, tIssuedBooks;
    ArrayList<String> TotalBooks = new ArrayList<>();
    ArrayList<String> AvailableBooks = new ArrayList<>();
    ArrayList<String> IssuedBooks = new ArrayList<>();
    Scanner S = new Scanner(System.in);

    MyLibrary() {
        TotalBooks.add("ANNA KARENINA");
        TotalBooks.add("LEO TOLSTOY");
        TotalBooks.add("TO KILL A MOCKINGBIRD");
        TotalBooks.add("HARPER LEE");
        TotalBooks.add("THE UNDERGROUND RAILROAD");
        TotalBooks.add("COLSON WHITEHEAD");
        TotalBooks.add("THE RETURN: FATHERS, SONS AND THE LAND IN BETWEEN");
        TotalBooks.add("BHISHAM MATAR");
        TotalBooks.add("AND THEN THERE WERE NONE");
        TotalBooks.add("AGATHA CHRISTIE");
        TotalBooks.add("The FLAME AND THE FLOWER");
        TotalBooks.add("BARBARA CARTLAND");
        TotalBooks.add("DR. SLUMP");
        TotalBooks.add("AKIRA TORIYAMA");
        TotalBooks.add("THE CATCHER IN THE RYE");
        TotalBooks.add("J.D. SALINGER");
        TotalBooks.add("THE DA VINCI CODE");
        TotalBooks.add("DAN BRWON");
        TotalBooks.add("HARRY POTTER AND THE PHILOSOPHER'S STONE");
        TotalBooks.add("J.K. ROWLING");

        AvailableBooks.add("DR. SLUMP");
        AvailableBooks.add("AKIRA TORIYAMA");
        AvailableBooks.add("THE CATCHER IN THE RYE");
        AvailableBooks.add("J.D. SALINGER");
        AvailableBooks.add("THE DA VINCI CODE");
        AvailableBooks.add("DAN BRWON");
        AvailableBooks.add("TO KILL A MOCKINGBIRD");
        AvailableBooks.add("HARPER LEE");
        AvailableBooks.add("THE UNDERGROUND RAILROAD");
        AvailableBooks.add("COLSON WHITEHEAD");

        IssuedBooks.add("HARRY POTTER AND THE PHILOSOPHER'S STONE");
        IssuedBooks.add("J.K. ROWLING");
        IssuedBooks.add("Muskan Singh");
        IssuedBooks.add("11 - 02 - 2019");
        IssuedBooks.add("THE RETURN: FATHERS, SONS AND THE LAND IN BETWEEN");
        IssuedBooks.add("BHISHAM MATAR");
        IssuedBooks.add("Divya Dutta");
        IssuedBooks.add("14 - 05 - 2018");
        IssuedBooks.add("AND THEN THERE WERE NONE");
        IssuedBooks.add("AGATHA CHRISTIE");
        IssuedBooks.add("Priya Sharma");
        IssuedBooks.add("23 - 01 - 2023");
        IssuedBooks.add("THE FLAME AND THE FLOWER");
        IssuedBooks.add("BARBARA CARTLAND");
        IssuedBooks.add("Avinash kumar singh");
        IssuedBooks.add("21 - 10 - 2002");
        IssuedBooks.add("ANNA KARENINA");
        IssuedBooks.add("LEO TOLSTOY");
        IssuedBooks.add("manish yadav");
        IssuedBooks.add("25 - 08 - 2003");

    }

    public void showTotalBooks() {
        System.out.println("\n------------ TOTAL BOOKS -----------\n");
        int count = 1;
        for (int i = 0, j = 1; i < TotalBooks.size() && j < TotalBooks.size(); i += 2, j += 2) {
            System.out.println(count + " .  BOOk : " + TotalBooks.get(i).toUpperCase() + "\n     AUTHOR : "
                    + TotalBooks.get(j).toUpperCase());
            count++;
        }
        System.out.println("\n------------------------------------\n");

    }

    public void showAvailableBooks() {
        System.out.println("\n------------ AVAILABLE BOOKS -----------\n");
        int count = 1;
        for (int i = 0, j = 1; i < AvailableBooks.size() && j < AvailableBooks.size(); i += 2, j += 2) {
            System.out.println(count + " .  BOOk : " + AvailableBooks.get(i).toUpperCase() + "\n     AUTHOR : "
                    + AvailableBooks.get(j).toUpperCase());
            count++;
        }
        System.out.println("\n------------------------------------\n");

    }

    public void showIssuedBooks() {
        System.out.println("\n------------ Issued BOOKS -----------\n");
        int count = 1;
        for (int i = 0, j = 1, k = 2, l = 3; i < IssuedBooks.size() && j < IssuedBooks.size() && k < IssuedBooks.size()
                && l < IssuedBooks.size(); i += 4, j += 4, k += 4, l += 4) {
            System.out.println(count + " .  BOOk : " + IssuedBooks.get(i).toUpperCase() + "\n     AUTHOR : "
                    + IssuedBooks.get(j).toUpperCase() + "\n     ISSUER : " + IssuedBooks.get(k).toUpperCase()
                    + "\n     DATE : " + IssuedBooks.get(l).toUpperCase());
            count++;
        }
        System.out.println("\n------------------------------------\n");
    }

    public void addBook(String book, String author) {
        TotalBooks.add(book.toUpperCase());
        TotalBooks.add(author.toUpperCase());
        AvailableBooks.add(book.toUpperCase());
        AvailableBooks.add(author.toUpperCase());
    }

    public void IssueBook(String book, String author, String name, String date) {
        int bookInd;
        if (AvailableBooks.contains(book.toUpperCase())) {
            bookInd = AvailableBooks.indexOf(book.toUpperCase());
            AvailableBooks.remove(bookInd);
            AvailableBooks.remove(bookInd);
            IssuedBooks.add(book.toUpperCase());
            IssuedBooks.add(author.toUpperCase());
            IssuedBooks.add(name);
            IssuedBooks.add(date);
        } else {
            System.out.println("This Books is not availabe");
            showAvailableBooks();
        }
    }

    public void ReturnBook(String book, String author) {
        int bookInd;
        char want;
        if (IssuedBooks.contains(book.toUpperCase())) {
            bookInd = IssuedBooks.indexOf(book.toUpperCase());
            IssuedBooks.remove(bookInd);
            IssuedBooks.remove(bookInd);
            IssuedBooks.remove(bookInd);
            IssuedBooks.remove(bookInd);
            AvailableBooks.add(book.toUpperCase());
            AvailableBooks.add(author.toUpperCase());
        } else {
            System.out.println("This Books is not present in the Issued Books");
            System.out.print("Do you want to add this book (Y/N) : ");
            want = S.next().charAt(0);
            if (want == 'y' || want == 'Y') {
                addBook(book, author);
            }
        }
    }
}

public class Ex_7_Lec_104_Library_Management {
    public static void main(String[] args) {
        System.out.println("------ MY LIBRARY -------");

        // Ex - 7 Lec - 104
        /*
         * Create a Library Management System which is capable of issuing books to the
         * students
         * Book should have indo like
         * 1. name
         * 2. author
         * 3. issued to
         * 4. issued on
         * User should be able to add books, return, issue
         * assume all the user are registered with their names in the central database
         */

        MyLibrary ml = new MyLibrary();
        int ch;
        String book, author, name, date;
        while (true) {
            try {
            Scanner Sc = new Scanner(System.in);
            Scanner S1 = new Scanner(System.in);
            System.out.println("---------- MENU --------------\n");
            System.out.println("TYPE 1. TO SHOW TOTAL BOOKS");
            System.out.println("TYPE 2. TO SHOW AVAILABLE BOOKS");
            System.out.println("TYPE 3. TO SHOW ISSUED BOOKS");
            System.out.println("TYPE 4. TO ADD BOOK");
            System.out.println("TYPE 5. TO ISSUE BOOK");
            System.out.println("TYPE 6. TO RETURN BOOK");
            System.out.println("TYPE 7. TO EXIT");
            System.out.print("ENTER YOUR CHOICE : ");
            ch = S1.nextByte();

            switch (ch) {
                case 1 -> {
                    ml.showTotalBooks();
                }
                case 2 -> {
                    ml.showAvailableBooks();
                }
                case 3 -> {
                    ml.showIssuedBooks();
                }
                case 4 -> {
                    System.out.print("ENTER BOOK NAME : ");
                    book = Sc.nextLine();
                    System.out.print("ENTER AUTHOR NAME : ");
                    author = Sc.nextLine();
                    ml.addBook(book, author);
                }
                case 5 -> {
                    LocalDate ld = LocalDate.now();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd - MM - y");
                    date = dtf.format(ld);
                    System.out.print("ENTER BOOK NAME : ");
                    book = Sc.nextLine();
                    System.out.print("ENTER AUTHOR NAME : ");
                    author = Sc.nextLine();
                    System.out.print("ENTER YOUR NAME : ");
                    name = Sc.nextLine();
                    ml.IssueBook(book, author, name, date);
                }
                case 6 -> {
                    System.out.print("ENTER BOOK NAME : ");
                    book = Sc.nextLine();
                    System.out.print("ENTER AUTHOR NAME : ");
                    author = Sc.nextLine();
                    ml.ReturnBook(book, author);
                }
                case 7 -> {
                    Sc.close();
                    S1.close();
                    System.exit(0);
                }
                default -> {
                    System.out.println("CHOOSE A VALID OPTION");
                }
            }

        }
        catch(Exception e)
        {
            continue;
        }
    }

    }

}
