package q2;

import java.util.regex.Pattern;

public class UserRegistration {
	public String username;
	public String country;
	public UserRegistration() {
		
		
	}
public UserRegistration(String username, String country) {
		super();
		this.username = username;
		this.country = country;
	}
	
public void registerUser(String username, String country) throws InvalidCountryException {
	if(Pattern.matches("[iI][nN][dD][iI][aA]",country)) {
		System.out.println("User registration done successfully");
	}else {
		InvalidCountryException ice= new InvalidCountryException("User Outside India cannot be registered");
		throw ice;
	}
}
}
