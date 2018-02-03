package pl.touk.internal.library.book;

import org.junit.jupiter.api.Test;

import java.util.List;

import static pl.touk.internal.library.book.BookAssertions.assertThat;

class BookAcceptanceTest {

    @Test
    void shouldAddBook() {
        //given
        BookFacade bookFacade = new BookTestConfiguration().bookFacade();
        AddBookCommand command = new AddBookCommand();

        //when
        bookFacade.addBook(command);

        //then
        List<BookDto> books = bookFacade.listAllBooks();
        assertThat(books)
                .hasSize(1)
                .anySatisfy(bookDto -> assertThat(bookDto).matches(command));
    }

}
