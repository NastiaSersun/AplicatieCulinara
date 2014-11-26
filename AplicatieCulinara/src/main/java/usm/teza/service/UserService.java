package usm.teza.service;

import java.util.List;

import usm.teza.enteties.User;

public interface UserService {

	public void addUser(User user);
	public String editUser(int userId);
	public User findUserByUsername(String username);
	public User findUserById(int userId);
	public void setRole(User user, String role);
	public void deleteUser(int userID);
	public List<User> showUsers();
}
