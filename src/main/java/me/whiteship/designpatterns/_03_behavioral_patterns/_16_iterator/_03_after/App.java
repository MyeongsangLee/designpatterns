package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._03_after;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        Book book1 = new Book("자바의정석");
        Book book2 = new Book("이것이자바다");
        Book book3 = new Book("웹프로그래밍");

        bookShelf.appendBook(book1);
        bookShelf.appendBook(book2);
        bookShelf.appendBook(book3);

        Iterator it = bookShelf.createIterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
