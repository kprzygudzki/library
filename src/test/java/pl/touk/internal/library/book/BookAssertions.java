package pl.touk.internal.library.book;

import org.assertj.core.api.Assertions;

class BookAssertions extends Assertions {

    static BookAssert assertThat(Book actual) {
        return new BookAssert(actual);
    }

    static BookDtoAssert assertThat(BookDto actual) {
        return new BookDtoAssert(actual);
    }

}
