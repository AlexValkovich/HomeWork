import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

    public class Readers {
        String fio;
        int cardNumber;
        String faculty;
        Date birthDate = new Date();
        long number;
        LinkedList<Books> booksList = new ArrayList<>();

        public Readers(String fio) {
            this.fio = fio;
        }

        void printStatus() {
            System.out.print(fio + " Взял книгу : ");
            for (Books bl: booksList) {
                System.out.print(bl.bookName + ", ");
            }
        }
        void takeBook(Books newBook) {
            booksList.add(newBook);
            System.out.println(fio + " Только что взял книгу " + newBook.bookName);
        }
        void returnBook(String returningBook) {
            for (int i = 0; i < booksList.size(); i++) {
                if (booksList.get(i).bookName == returningBook) {
                    booksList.remove(i);
                    System.out.println(fio + " Вернул книгу " + returningBook);
                    break;
                } else {
                    System.out.println(fio + " Не вернул книгу " + returningBook);
                    break;
                }
            }
        }
    }

