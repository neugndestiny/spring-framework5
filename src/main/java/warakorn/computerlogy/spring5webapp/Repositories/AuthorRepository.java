package warakorn.computerlogy.spring5webapp.Repositories;

import org.springframework.data.repository.CrudRepository;
import warakorn.computerlogy.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
