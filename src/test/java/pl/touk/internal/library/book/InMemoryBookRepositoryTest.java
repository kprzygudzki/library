package pl.touk.internal.library.book;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static pl.touk.internal.library.book.BookProvider.newBook;

class InMemoryBookRepositoryTest {

    @Test
    @DisplayName("When a book is put in repository then should store and return it when asked for all")
    void shouldStoreBookAndReturnIt() {
        //given
        InMemoryBookRepository repository = new InMemoryBookRepository();
        Book book = newBook();

        //when
        repository.put(book);

        //then
        List<Book> all = repository.getAll();
        BookAssertions.assertThat(all)
                .contains(book)
                .hasSize(1);
    }

}
