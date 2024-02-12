import java.time.LocalDate;

public final class Book {
    private final String title;
    private final Author author;
    private final LocalDate date;
    
    public Book(String title, Author author, LocalDate date) {
        this.title = title;
        this.author = new Author(author.getName(), author.getBirthday(), author.getAddress()); // 完全なコンストラクタの作り方①
        this.date = date;
    }

    public Author getAuthor() {
        return new Author(this.author.getName(), this.author.getBirthday(), this.author.getAddress()); // 完全なコンストラクタの作り方②
    }

    @Override
    public String toString() {
        return "Book [title=" + this.title + ", author=" + this.author + ", date=" + this.date + "]";
    }
}
