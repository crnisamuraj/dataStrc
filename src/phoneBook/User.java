package phoneBook;

import java.util.Arrays;

public class User {
	private Long id;
	
	private String username;
	
	private char[] password;
	
	private String phoneNumber;
	
	public User(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public User(String username, char[] password, String phoneNumber) {
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + Arrays.toString(password).replace(",", "").replace(" ", "")
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
