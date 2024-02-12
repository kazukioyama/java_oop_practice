import java.time.LocalDate;

public class Author {
    private String name;
    private LocalDate birthday;
    private String address;

    public Author(String name, LocalDate birthday, String address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public String getAddress() {
        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author [name=" + this.name + ", birthday=" + this.birthday + ", address=" + this.address + "]";
    }
}
