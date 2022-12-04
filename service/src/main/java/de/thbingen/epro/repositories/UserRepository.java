package de.thbingen.epro.repositories;

import de.thbingen.epro.models.User;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    List<User> findByFirstname(@Param("firstname") String firstname);

}
