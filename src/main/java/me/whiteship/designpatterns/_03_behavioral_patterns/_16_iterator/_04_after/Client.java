package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._04_after;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        Book book1 = new Book("김작가1");
        Book book2 = new Book("김작가2");
        Book book3 = new Book("김작가3");
        Book book4 = new Book("김작가4");
        Book book5 = new Book("김작가5");

        BookShelf bookShelf = new BookShelf(10);
        bookShelf.addBook(book1);
        bookShelf.addBook(book2);
        bookShelf.addBook(book3);
        bookShelf.addBook(book4);
        bookShelf.addBook(book5);

        Iterator iterator = bookShelf.createIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
