package pl.touk.internal.library.book;

import org.mockito.ArgumentMatcher;

class BookMatchers {

    static ArgumentMatcher<Book> isABookMatching(AddBookCommand command) {
        return book -> book.getAuthor().equals(command.getAuthor())
                && book.getTitle().equals(command.getTitle());
    }

}
