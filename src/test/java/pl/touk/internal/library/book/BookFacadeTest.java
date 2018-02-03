package pl.touk.internal.library.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;
import static pl.touk.internal.library.book.BookMatchers.isABookMatching;
import static pl.touk.internal.library.book.BookProvider.newBook;
import static pl.touk.internal.library.book.BookProvider.validAddBookCommand;

class BookFacadeTest {

    private BookRepository repository;

    private BookFacade bookFacade;

    private AddBookCommand command = validAddBookCommand();

    @BeforeEach
    void setUp() {
        repository = mock(BookRepository.class);
        bookFacade = new BookFacade(repository);
    }

    @Test
    @DisplayName("When called to add book then should add a boo matching command to repository")
    void shouldAddBookMatchingCommandToRepository() {
        //given

        //when
        bookFacade.addBook(command);

        //then
        verify(repository).put(argThat(isABookMatching(command)));
    }

    @Test
    @DisplayName("When asked for all books then should get books from repository")
    void shouldGetBooksFromRepository() {
        //given

        //when
        bookFacade.listAllBooks();

        //then
        verify(repository).getAll();
    }

    @Test
    @DisplayName("When asked for all books then should return books retrieved from repository")
    void shouldReturnBooksRetrievedFromRepository() {
        //given
        when(repository.getAll()).thenReturn(singletonList(newBook()));

        //when
        List<BookDto> bookDtos = bookFacade.listAllBooks();

        //then
        assertThat(bookDtos).anySatisfy(bookDto -> BookAssertions.assertThat(bookDto).matches(command));
    }

}
