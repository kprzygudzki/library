package pl.touk.internal.library.book;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static lombok.AccessLevel.PRIVATE;

@Getter
@AllArgsConstructor(access = PRIVATE)
class Book {

    private String author;
    private String title;

    static Book create(AddBookCommand command) {
        return new Book(command.getAuthor(), command.getTitle());
    }

    BookDto exportDto() {
        return new BookDto(title, author);
    }

}
