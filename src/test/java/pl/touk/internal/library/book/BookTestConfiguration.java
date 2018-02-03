package pl.touk.internal.library.book;

class BookTestConfiguration {

    BookFacade bookFacade() {
        BookRepository repository = new InMemoryBookRepository();
        return new BookFacade(repository);
    }
}
