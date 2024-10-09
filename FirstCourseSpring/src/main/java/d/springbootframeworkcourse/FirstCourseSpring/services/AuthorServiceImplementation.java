package d.springbootframeworkcourse.FirstCourseSpring.services;

import d.springbootframeworkcourse.FirstCourseSpring.domain.Author;
import d.springbootframeworkcourse.FirstCourseSpring.domain.Book;
import d.springbootframeworkcourse.FirstCourseSpring.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImplementation implements AuthorService{

    private final AuthorRepository authorRepository;

    public AuthorServiceImplementation(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
