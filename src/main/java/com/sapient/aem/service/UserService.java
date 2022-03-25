package com.sapient.aem.service;

import java.util.List;

import com.sapient.aem.exception.UserException;
import com.sapient.aem.model.User;

public interface UserService {
	public abstract Boolean isValidUser(String userName,String password) throws UserException;
	public abstract Integer addUser(User user) throws UserException;
	public abstract List<User> getUsers() throws UserException;
}
