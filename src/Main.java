import java.util.Objects;

public class Main {

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
