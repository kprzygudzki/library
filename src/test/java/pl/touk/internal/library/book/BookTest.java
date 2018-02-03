package pl.touk.internal.library.book;

import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    void shouldCreateNewBook() {
        //given
        AddBookCommand command = BookProvider.validAddBookCommand();

        //when
        Book book = Book.create(command);

        //then
        BookAssertions.assertThat(book).matches(command);
    }

}
