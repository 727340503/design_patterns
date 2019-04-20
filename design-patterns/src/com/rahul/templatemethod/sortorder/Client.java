package com.rahul.templatemethod.sortorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		UserModel user = new UserModel();
		UserModel user1 = new UserModel();
		UserModel user2 = new UserModel();
		user.setAge(18);
		user1.setAge(19);
		user2.setAge(20);
		
		user.setName("123");
		user1.setName("1234");
		user2.setName("12345");
		
		
		List<UserModel> users = new ArrayList<UserModel>();
		users.add(user);
		users.add(user1);
		users.add(user2);
		
		System.out.println(users);
		
		Collections.sort(users, new Comparator<UserModel>() {

			@Override
			public int compare(UserModel o1, UserModel o2) {
				return o2.getAge() - o1.getAge();
			}
			
		});
		
		System.out.println(users);
	}
}
