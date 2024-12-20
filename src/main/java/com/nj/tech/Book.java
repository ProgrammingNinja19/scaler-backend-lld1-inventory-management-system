package com.nj.tech;

/*
 * Created by Ninad Jingare on  Date: 20-12-2024
 */
public class Book extends Item{
    String author;

    public Book(String author) {
        this.author = author;
    }

    public Book(String id, String name, double price, int quantity, String author) {
        super(id, name, price, quantity);
        this.author = author;
    }

    public Book(Book otherBook) {
        super(otherBook);
        this.author = otherBook.author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                '}';
    }
}
