package d.springbootframeworkcourse.FirstCourseSpring.services;

import d.springbootframeworkcourse.FirstCourseSpring.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
