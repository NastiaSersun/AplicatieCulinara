package usm.teza.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import usm.teza.dao.UserDao;
import usm.teza.enteties.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void addUser(User user) {
		userDao.addUser(user);
		
	}
	@Transactional
	public String editUser(int userId) {
		return userDao.editUser(userId);
	}
	@Transactional
	public User findUserByUsername(String username) {
		User u = userDao.findUserByUsername(username);
		return u;
	}
	@Transactional
	public User findUserById(int userId) {
		return userDao.findUserById(userId);
		
	}
	@Transactional
	public void setRole(User user, String role) {
		userDao.setRole(user, role);
		
	}
	@Transactional
	public void deleteUser(int userID) {
		userDao.deleteUser(userID);
		
	}
	@Transactional
	public List<User> showUsers() {
		return userDao.showUsers();
	}

}
