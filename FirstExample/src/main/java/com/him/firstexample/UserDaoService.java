package com.him.firstexample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	public UserDaoService() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static List<User> users = new ArrayList<>();

	private static int usersCount = 3;

	// This can be later converted to some other service
	static {
		users.add(new User(1, "Ram", new Date()));
		users.add(new User(2, "Raj", new Date()));
		users.add(new User(3, "Rajesh", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User findOne(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public User save(User user)
	{
		if(user.getId() == null)
		{
			user.setId(++usersCount);
		}
		users.add(user);
		
		return user;
	}
}
