package utm.idw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.idw.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
