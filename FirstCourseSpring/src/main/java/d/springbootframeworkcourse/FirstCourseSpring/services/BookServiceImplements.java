package d.springbootframeworkcourse.FirstCourseSpring.services;

import d.springbootframeworkcourse.FirstCourseSpring.domain.Book;
import d.springbootframeworkcourse.FirstCourseSpring.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImplements implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImplements(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
