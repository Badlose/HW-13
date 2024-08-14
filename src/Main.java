import java.util.Objects;

public class Main {

    public static class Author {
        private String name;
        private String surname;

        public Author(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getName() {
            return this.name;
        }

        public String getSurname() {
            return this.surname;
        }

        @Override
        public String toString() {
            return "Author { " +
                    "name = '" + name + '\'' +
                    ", surname = '" + surname + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Author author = (Author) o;
            return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname);
        }
    }

    public static class Book {

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
            return author.name + " " + author.surname;
        }

        public int getYearOfPublication() {
            return this.yearOfPublication;
        }

        @Override
        public String toString() {
            return "Book{ " +
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


    public static void main(String[] args) {
        Author oda = new Author("Eiichiro", "Oda");

        Book onePiece = new Book("One Piece", oda, 1997);

        Author welsh = new Author("Irvine", "Welsh");

        Book nightmares = new Book("Marabou Stork Nightmares", welsh, 1994);

        Author odaTest = new Author("Eiichiro", "Oda");
        Book onePieceTest = new Book("One Piece", oda, 1997);


        System.out.println("oda.toString() = " + oda.toString());
        System.out.println("oda.equals(odaTest) = " + oda.equals(odaTest));
        System.out.println("oda.hashCode() = " + oda.hashCode());
        System.out.println("odaTest.hashCode() = " + odaTest.hashCode());
        System.out.println("nightmares.toString() = " + nightmares.toString());
        System.out.println("onePiece.equals(onePieceTest) = " + onePiece.equals(onePieceTest));

        System.out.println("nightmares.getYearOfPublication() = " + nightmares.getYearOfPublication());
        nightmares.setYearOfPublication(1995);
        System.out.println();

    }
}
