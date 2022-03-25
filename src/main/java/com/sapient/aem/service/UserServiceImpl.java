package com.sapient.aem.service;

import java.util.List;

import com.sapient.aem.dao.UserDAO;
import com.sapient.aem.dao.UserDaoImpl;
import com.sapient.aem.exception.UserException;
import com.sapient.aem.model.User;

public class UserServiceImpl implements UserService{
	private UserDAO userDAO=  new UserDaoImpl();

	@Override
	public Boolean isValidUser(String userName, String password) throws UserException{
		try {
			return userDAO.isValidUser(userName, password);
		}catch(Exception e){
			throw new UserException(e.getMessage(),e);
		}
	}
	@Override
	public List<User> getUsers() throws UserException {
		try {
			List<User> userList= userDAO.getUsers();
		    return userList; 
		}catch(Exception e) {
			
			throw new UserException(e.getMessage(),e);
		}
	}

	@Override
	public Integer addUser(User user) throws UserException{
		try {
			return userDAO.addUser(user);
		}catch(Exception e){
			throw new UserException(e.getMessage(),e);
		}
	}

}
