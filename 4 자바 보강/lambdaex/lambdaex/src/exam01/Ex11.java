package exam01;

import java.awt.print.Book;
import java.util.function.Supplier;

public class Ex11 {
    public static void main(String[] args) {
        //Supplier<Book> book = () -> new Book();
        Supplier<Book> book = Book::new;

        Supplier<String[]> data = () -> 
    }
}
