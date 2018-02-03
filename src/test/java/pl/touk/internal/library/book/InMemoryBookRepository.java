package pl.touk.internal.library.book;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class InMemoryBookRepository implements BookRepository {

    private Set<Book> booksStore = new HashSet<>();

    @Override
    public void put(Book book) {
        booksStore.add(book);
    }

    @Override
    public List<Book> getAll() {
        return new LinkedList<>(booksStore);
    }

}
