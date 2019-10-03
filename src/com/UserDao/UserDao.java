package com.UserDao;

import com.Controller.User;

public interface UserDao {
	public boolean validateUser(User user);
	public boolean addUser(User user);
}

