package d.springbootframeworkcourse.FirstCourseSpring.repositories;

import d.springbootframeworkcourse.FirstCourseSpring.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
