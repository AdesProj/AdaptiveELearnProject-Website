package adaptiveElearn;

import java.io.Serializable;
/** 13153439 Huseyin Arpalikli
 * User Registration bean
 */
public class BeanUsers implements Serializable {

	private int ID;
	private String userName;
	private String password;
	private String userType;
	//declare constructors
	public BeanUsers() {

	}

	public BeanUsers(int Id, String usrName, String pWord, String usrType) {
		ID=Id;
		userName=usrName;
		password=pWord;
		userType=usrType;
	}
	
	public BeanUsers(String usrName, String pWord) {
		userName=usrName;
		password=pWord;
		
	}

	/*
	 * define all getters and setters here for each instance variable also a
	 * toString method
	 */
	
	public int getID() {
		return ID;
	}

	public void setID(int Id) {
		this.ID=Id;
	}
	
	public String getUsername() {
		return userName;
	}

	public void setUsername(String usrName) {
		this.userName = usrName;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String pWord) {
		this.password = pWord;
	}
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String usrType) {
		this.userType = usrType;
	}

	@Override
	public String toString() {
		return "BeanUsers [ID=" + ID + ", userName=" + userName
				+ ", password=" + password + ", userType=" + userType + "]";
	}

	
}
