package warakorn.computerlogy.spring5webapp.Repositories;

import org.springframework.data.repository.CrudRepository;
import warakorn.computerlogy.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
