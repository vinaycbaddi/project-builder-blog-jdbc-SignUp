package dao;

import model.User;

public interface UserDAOInterface{
	int signUp(User user);
	boolean loginUser(User user);
}