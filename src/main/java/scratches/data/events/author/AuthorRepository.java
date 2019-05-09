package scratches.data.events.author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Rashidi Zin
 */
public interface AuthorRepository extends JpaSpecificationExecutor<Author>,
        JpaRepository<Author, Long>,
        PagingAndSortingRepository<Author, Long> {

}
