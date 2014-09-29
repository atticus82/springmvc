package amm.spring.business.usermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import amm.spring.business.usermanagement.vo.CustomUserVO;
import amm.spring.business.usermanagement.vo.UserGrantedAuthority;
import amm.spring.persistence.entities.User;
import amm.spring.persistence.repository.springdatajpa.SpringDataUserRepository;

@Service
public class UserServiceImpl implements UserService{
	

	private SpringDataUserRepository springDataUserRepository;
	
	@Autowired
	public UserServiceImpl(SpringDataUserRepository springDataUserRepository){
		this.springDataUserRepository = springDataUserRepository;
		
	}
	
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = this.springDataUserRepository.findByUsername(username);
		if(user == null){
			return null;
		}
//		 GrantedAuthority grantedAuth = new UserGrantedAuthority(user.getRole());
		 GrantedAuthority grantedAuth = new UserGrantedAuthority("ROLE_USER");
		 return new CustomUserVO(user.getId().intValue(), user.getUsername(), user.getPassword(), 
				 new GrantedAuthority[]{ grantedAuth });
	}
	
	

}
