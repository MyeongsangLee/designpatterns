package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._04_after;

import java.util.Iterator;

public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        return bookShelf.getBook(index++);
    }
}
