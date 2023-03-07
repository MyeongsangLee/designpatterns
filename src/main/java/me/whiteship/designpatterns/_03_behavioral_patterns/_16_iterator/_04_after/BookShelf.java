package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._04_after;

import java.util.Iterator;

public class BookShelf implements Aggregate{

    private Book[] books;
    private int last = 0;

    public BookShelf(int i) {
        this.books = new Book[i];
    }

    public void addBook(Book book) {
        if (last < books.length) {
            books[last++] = book;
        } else {
            System.out.println("책꽂이가 꽉 찼습니다.");
        }

    }

    public Book getBook(int i) {
        return books[i];
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator createIterator() {
        return new BookShelfIterator(this);
    }
}
