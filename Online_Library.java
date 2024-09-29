import java.util.Scanner;

class Library {
    String[] availableBooks;
    String[] issuedBooks;
    int noOfBooks;

    Library() {
        System.out.println("Welcome to my new Library");
        this.availableBooks = new String[100];
        int noOfBooks = 0;
    }

    public void addBook(String book) {
        this.availableBooks[noOfBooks] = book;
        noOfBooks++;

        System.out.println("Your  Book has been added Successfully");
        // this.availableBooks[noOfBooks] = book;
    }

    public void issueBook(String issueBook) {
        if (noOfBooks == 0) {
            System.out.println(" Book is not available in the Library");
        } else {
           for(int i=0;i<this.availableBooks.length;i++){
               if(availableBooks[i].equals(issueBook)){
                   availableBooks[i]=null;
                   noOfBooks--;
                   System.out.println("Thank you "+noOfBooks+" has been issued Successfully");
                   break;
               }
           }
        }
    }



    public void returnBook(String returnBook) {
        System.out.println("Your  Book has been return Successfully");
    }

    public void showAvailableBooks(String showAvailableBooks) {
        System.out.println("Your  Book has been show Successfully");
    }

}

public class Online_Library {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        Scanner sc = new Scanner(System.in);
        Library obj = new Library();
        System.out.println("Enter the number of books you want  to add in Library");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the " + i + " book name you want to add in Library");
            obj.addBook(sc.next());
        }
        obj.showAvailableBooks();
    }
}
