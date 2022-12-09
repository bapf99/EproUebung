package de.thbingen.epro.repositories;

import de.thbingen.epro.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    List<User> findBySurname(@Param("surname") String firstname);

}
