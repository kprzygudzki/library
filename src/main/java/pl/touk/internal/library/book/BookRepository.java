package pl.touk.internal.library.book;

import java.util.List;

interface BookRepository {

    void put(Book book);

    List<Book> getAll();

}
