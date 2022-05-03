package canhnguyen.repository;

import canhnguyen.model.Book;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends CrudRepository<Book, Long> {

}
