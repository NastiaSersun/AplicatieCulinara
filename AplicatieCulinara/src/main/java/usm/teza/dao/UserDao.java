package usm.teza.dao;

import java.util.List;
import java.util.Set;

import usm.teza.enteties.User;

public interface UserDao {
	public void addUser(User user);
	public String editUser(int userId);
	public User findUserByUsername(String username);
	public User findUserById(int userId);
	public void setRole(User user, String role);
	public void deleteUser(int userID);
	public List<User> showUsers();
}
