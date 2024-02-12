import java.time.LocalDate;

public class ExecQ4_2 {
    public static void main(String[] args) {
        Author author = new Author("大山", LocalDate.of(2025, 7, 11), "愛知県");
        Book book = new Book("大山の本", author, LocalDate.of(2025, 9, 11));

        Author booksAuthor = book.getAuthor();
        booksAuthor.setName("大山修正版");
        System.out.println(book.toString());
    }
}
