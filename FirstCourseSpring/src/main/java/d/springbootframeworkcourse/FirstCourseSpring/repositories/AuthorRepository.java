package d.springbootframeworkcourse.FirstCourseSpring.repositories;

import d.springbootframeworkcourse.FirstCourseSpring.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
