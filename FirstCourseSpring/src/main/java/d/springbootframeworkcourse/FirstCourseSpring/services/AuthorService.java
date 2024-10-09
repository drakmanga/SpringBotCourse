package d.springbootframeworkcourse.FirstCourseSpring.services;

import d.springbootframeworkcourse.FirstCourseSpring.domain.Author;
import d.springbootframeworkcourse.FirstCourseSpring.domain.Book;

public interface AuthorService {

    Iterable<Author> findAll();
}
