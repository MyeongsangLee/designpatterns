package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._03_after;

import java.util.Iterator;

public class BookShelf implements Aggregate {

    private Book[] books;
    private int last;

    public BookShelf(int size) {
        this.books = new Book[size];
    }

    public void appendBook(Book book) {
        if (last < books.length) {
            books[last] = book;
            last++;
        } else {
            System.out.println("책꽂이가 꽉 찼습니다.");
        }
    }

    public int getLength() {
        return last;
    }

    public Book getBook(int index) {
        return books[index];
    }


    @Override
    public Iterator createIterator() {
        return new BookShelfIterator(this);
    }
}