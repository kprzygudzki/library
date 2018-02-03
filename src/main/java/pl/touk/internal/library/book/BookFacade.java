package pl.touk.internal.library.book;

import java.util.List;

import static java.util.stream.Collectors.toList;

class BookFacade {

    private final BookRepository repository;

    BookFacade(BookRepository repository) {
        this.repository = repository;
    }

    void addBook(AddBookCommand command) {
        Book book = Book.create(command);
        repository.put(book);
    }

    List<BookDto> listAllBooks() {
        return repository.getAll().stream().map(Book::exportDto).collect(toList());
    }

}
