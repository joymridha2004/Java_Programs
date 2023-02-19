package Normal_Programs;

class Library {
    String[] Books;
    int no_of_book;

    Library() {
        this.Books = new String[100];
        this.no_of_book = 0;
    }

    public void Available_Book() {
        System.out.print("Available Book are : ");
        for (int i = 0; i < no_of_book; i++) {
            System.out.print("* " + Books[i] + " ");
        }
        System.out.println();
    }

    public void Return_Book(String book) {
        System.out.println("Book has been Return");
        Books[no_of_book] = book;
        no_of_book++;
    }

    public void Add_Book(String book) {
        Books[no_of_book] = book;
        no_of_book++;
        System.out.println(book + " Book has been added");
    }

    public void Issue_Book(String book) {
        for (int i = 0; i < no_of_book; i++) {
            if (Books[i].equals(book)) {
                System.out.println("Book has been Issue");
                arrayArrange(Books, i);
                no_of_book--;
                return;
            }
        }
        System.out.println("Book has been not found");
    }

    private void arrayArrange(String[] Books, int num) {
        for (int i = num; i < Books.length - 1; i++) {
            Books[i] = Books[i + 1];
        }
    }
}

public class Library_System {
    public static void main(String[] args) {
        Library CentralLibrary = new Library();
        CentralLibrary.Add_Book("C++");
        CentralLibrary.Add_Book("Java");
        CentralLibrary.Add_Book("Python");
        CentralLibrary.Add_Book("Html");
        CentralLibrary.Available_Book();
        CentralLibrary.Issue_Book("Python");
        CentralLibrary.Available_Book();
        CentralLibrary.Return_Book("Python");
        CentralLibrary.Available_Book();
    }
}
