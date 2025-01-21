package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

// This is a Spring Data JPA Repository
// It is an interface that extends CrudRepository
// It takes the domain object type to manage and the id type of the domain object as type arguments

// Spring Data JPA will provide the implementation of this interface at runtime
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
