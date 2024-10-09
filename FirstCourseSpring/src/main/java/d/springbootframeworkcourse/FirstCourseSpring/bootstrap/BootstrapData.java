package d.springbootframeworkcourse.FirstCourseSpring.bootstrap;

import d.springbootframeworkcourse.FirstCourseSpring.domain.Author;
import d.springbootframeworkcourse.FirstCourseSpring.domain.Book;
import d.springbootframeworkcourse.FirstCourseSpring.domain.Publisher;
import d.springbootframeworkcourse.FirstCourseSpring.repositories.AuthorRepository;
import d.springbootframeworkcourse.FirstCourseSpring.repositories.BookRepository;
import d.springbootframeworkcourse.FirstCourseSpring.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName(("Eric"));
        eric.setLastName(("Evans"));

        Book ddd = new Book();
        ddd.setTitle("Domain Driver Design");
        ddd.setIsbn(("123456"));

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        eric.setFirstName(("Rod"));
        eric.setLastName(("Johnson"));

        Book noEJB = new Book();
        ddd.setTitle("J2EE Development without EJB");
        ddd.setIsbn(("54757585"));

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        Publisher pb = new Publisher();
        pb.setAddress("Via publisher 13");
        pb.setCity("Ollolanda");
        pb.setZip("00478");
        pb.setState("Melor");
        pb.setPublisherName("Franco perti");
        Publisher savedPublisher= publisherRepository.save(pb);

        ddd.setPublisher(savedPublisher);
        noEJBSaved.setPublisher(savedPublisher);

        //aggiunti i libri
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);

        //aggiunti i libri negli autori
        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);

        System.out.println("In bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());


    }
}
