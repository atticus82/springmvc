package amm.spring.persistence.repository;

import java.util.Collection;

import org.springframework.dao.DataAccessException;

import amm.spring.persistence.entities.User;

public interface UserRepository {

	Collection<User> findByLastName(String lastName) throws DataAccessException;
	
	
	User findById (Long id) throws DataAccessException;
	
	User findByUsername(String username) throws DataAccessException;
}
