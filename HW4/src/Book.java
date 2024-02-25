
public class Book {
        public String bookName;
        public String authorName;
        public final String TEXT = " ";

        public Book(String bookName, String authorName) {
            this.bookName = bookName;
            this.authorName = authorName;
        }

        public Book(String bookName) {
            this.bookName = bookName;
        }
}
