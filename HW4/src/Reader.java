import java.util.Date;

public class Reader {
    String name;
    int cardNumber;
    String faculty;
    Date birthDate = new Date();
    long number;
    Book[] booksArray = new Book[10];

    public Reader() {
    }

    void printStatus() {
        System.out.print(this.name + " Взял книгу : ");

        for(int i = 0; i < this.booksArray.length; ++i) {
            if (this.booksArray[i] != null) {
                Book var10001 = this.booksArray[i];
                System.out.print(var10001.bookName + ", ");
            }
        }

    }

    void takeBook(Book newBook) {
        for(int i = 0; i < this.booksArray.length; ++i) {
            if (this.booksArray[i] == null) {
                this.booksArray[i] = newBook;
                System.out.println(this.name + " Только что взял книгу " + newBook.bookName);
                break;
            }
        }

    }

    void returnBook(String returningBook) {
        int i = 0;
        if (i < this.booksArray.length) {
            if (this.booksArray[i].bookName == returningBook) {
                this.booksArray[i] = null;
                System.out.println(this.name + " Вернул книгу " + returningBook);
            } else {
                System.out.println(this.name + " Не вернул книгу " + returningBook);
            }
        }

    }
}

