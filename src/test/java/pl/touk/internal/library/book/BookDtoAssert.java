package pl.touk.internal.library.book;

import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

class BookDtoAssert extends AbstractAssert<BookDtoAssert, BookDto> {

    BookDtoAssert(BookDto bookDto) {
        super(bookDto, BookDtoAssert.class);
    }

    void matches(AddBookCommand command) {
        assertThat(actual.getAuthor()).isEqualTo(command.getAuthor());
        assertThat(actual.getTitle()).isEqualTo(command.getTitle());
    }

}
