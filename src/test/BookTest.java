package test;

import main.Lab_3.Book.Book;

public class BookTest {
    public static void main(String[] args) {
        Book Mordor = new Book();
        Mordor.setTitle();
        Mordor.setAuthor();
        Mordor.setYear();
        System.out.println(Mordor.toString());
    }
}
