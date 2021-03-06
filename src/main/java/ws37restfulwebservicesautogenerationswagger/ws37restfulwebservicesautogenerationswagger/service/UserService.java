/**
 * 
 */
package ws37restfulwebservicesautogenerationswagger.ws37restfulwebservicesautogenerationswagger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import ws37restfulwebservicesautogenerationswagger.ws37restfulwebservicesautogenerationswagger.dto.User;

/**
 * @author Cesar Mata.
 *
 */
@Component
public class UserService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 3;
	
	static {
		users.add(new User(1, "César", new Date()));
		users.add(new User(2, "Mata", new Date()));
		users.add(new User(3, "Sánchez", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		users.add(user);
		if(user.getId()==null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user: users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			if(user.getId()==id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}