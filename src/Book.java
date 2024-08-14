import java.util.Objects;

public class Book {

    private String title;
    private Author author;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYearOfPublication(int year) {
        this.yearOfPublication = year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return author.getName() + " " + author.getSurname();
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book {" +
                "title = '" + title + '\'' +
                ", author = " + this.getAuthor() +
                ", yearOfPublication = " + yearOfPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfPublication);
    }
}