//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Book book1 = new Book("Белый клык");
        Book book2 = new Book("Ведьмак");
        Book book3 = new Book("Доктор Хаус");
        Reader Alex = new Reader();
        Alex.name = "Александр Иванов";
        Alex.booksArray[0] = book1;
       Alex.booksArray[1] = book2;
        Alex.booksArray[2] = book3;
        Alex.printStatus();
        System.out.println();
        Alex.returnBook("Белый клык ");
        Alex.returnBook("Доктор Хаус ");
    }
}

