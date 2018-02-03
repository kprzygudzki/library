package pl.touk.internal.library.book;

import org.assertj.core.api.AbstractAssert;

import static pl.touk.internal.library.book.BookAssertions.assertThat;

class BookAssert extends AbstractAssert<BookAssert, Book> {

    BookAssert(Book book) {
        super(book, BookAssert.class);
    }

    void matches(AddBookCommand command) {
        assertThat(actual.getAuthor()).isEqualTo(command.getAuthor());
        assertThat(actual.getTitle()).isEqualTo(command.getTitle());
    }

}
