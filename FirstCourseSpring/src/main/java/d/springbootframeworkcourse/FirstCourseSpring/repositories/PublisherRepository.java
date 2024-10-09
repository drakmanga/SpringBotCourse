package d.springbootframeworkcourse.FirstCourseSpring.repositories;

import d.springbootframeworkcourse.FirstCourseSpring.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
