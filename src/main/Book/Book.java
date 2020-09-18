package main.Book;

import java.util.Scanner;

public class Book {
    Scanner console = new Scanner(System.in);
    private String author= "?";
    private String title= "?";
    private int year;


    public Book(){}

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor() {
        System.out.print("Author: ");
        String author = console.nextLine();
        this.author = author;
    }

    public void setTitle() {
        System.out.print("Title: ");
        String title = console.nextLine();
        this.title = title;
    }

    public void setYear() {
        System.out.print("Publication date: ");
        int year = console.nextInt();
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book:" + title + '\n' +
                "Author:" + author + '\n' +
                "Publication date:" + year;
    }
}
