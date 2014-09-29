package amm.spring.persistence.repository.springdatajpa;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import amm.spring.persistence.entities.User;
import amm.spring.persistence.repository.UserRepository;

public interface SpringDataUserRepository extends UserRepository, Repository<User, Long>{
	
	
	@Override
	@Query("SELECT u FROM User u WHERE u.id=:id")
	User findById (@Param("id") Long id) throws DataAccessException;

	@Override
	@Query("SELECT u FROM User u WHERE u.username=:username")
	User findByUsername(@Param("username") String username) throws DataAccessException;

}
