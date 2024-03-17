
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Белый клык");
        Books book2 = new Books("Ведьмак");
        Books book3 = new Books("Доктор Хаус");

        List <Readers> read = new ArrayList <>(1);
        read.add(new Readers("Александр Иванов"));
        read.add(new Readers("Иван Петров"));
        read.add(new Readers("Петр Сергеев"));
        read.getFirst().booksList.add(book1);
        read.getFirst().booksList.add(book2);
        read.getFirst().booksList.add(book3);

        read.getFirst().printStatus();
        System.out.println();
        Books book4 = new Books("Java для чайников");
        read.getFirst().takeBook(book4);
        read.getFirst().returnBook("Белый клык");
        read.getFirst().returnBook("Доктор Хаус");
    }
}