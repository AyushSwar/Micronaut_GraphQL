package repository;

import com.example.grapgql.Book;
import com.example.grapgql.Author;
import jakarta.inject.Singleton;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
public class DbRepository {

        public static List<Book> books = Arrays.asList(
                new Book("book-1", "To Kill a Mockingbird", 281, new Author("author-1", "Harper", "Lee")),
                new Book("book", "The Great Gatsby", 180, new Author("author-2", "F. Scott", "Fitzgerald")),
                new Book("book-3", "1984", 328, new Author("author-3", "George", "Orwell")),
                  new Book("book", "1984", 328, new Author("author-3", "George", "Orwell"))
        );

         public List<Book> findAllBooks(){
            return books;
        }

        public List<Author> findAllAuthors() {
        return books.stream()
                .map(Book::getAuthor)
                .collect(Collectors.toList());
        }


}
