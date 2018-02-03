package pl.touk.internal.library.book;

class BookProvider {

    static AddBookCommand validAddBookCommand() {
        return new AddBookCommand("The Importance of Being Earnest", "Oscar Wilde");
    }

    static Book newBook() {
        return Book.create(validAddBookCommand());
    }

}
