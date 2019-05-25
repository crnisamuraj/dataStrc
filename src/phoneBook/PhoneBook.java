package phoneBook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class PhoneBook {
	
	HashSet<User> hashBook = new HashSet<User>();
	
	List<User> listBook = new ArrayList<User>();
	
	public User hashAdd(User user) {
		hashBook.add(user);
		return user;
	}
	
	public User hashFind(String phoneNumber) {
		for(User user:hashBook) {
			if (user.getPhoneNumber().equals(phoneNumber))
				return user; 
		}
		throw new RuntimeException();
	}
	
	public User listAdd(User user) {
		listBook.add(user);
		return user;
	}
	
	public User listFind(String phoneNumber) {
		for(User user:listBook) {
			if (user.getPhoneNumber().equals(phoneNumber))
			return user;
		}
		throw new RuntimeException();
	}
	
	public User hashFindIterator(String phoneNumber) {
		Iterator<User> i = hashBook.iterator();
		while(i.hasNext()) {
			if (i.next().getPhoneNumber().equals(phoneNumber))
			return i.next();
		}
		throw new RuntimeException();
	}
	
}
