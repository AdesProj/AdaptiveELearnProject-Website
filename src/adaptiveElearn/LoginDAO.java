package adaptiveElearn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginDAO {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet rs1 = null;
	//declare constructor
	public LoginDAO() {

	}
	//make connection to object
	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionPoint.getInstance().getConnection();
		return conn;
	}
	//add user to the database
	public void addUser(BeanUsers usr) {
		try {
			String queryString = "INSERT INTO login(id, email_address login_password, account_type) VALUES(?,?,?,?)";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setInt(1, usr.getID());
			ptmt.setString(2, usr.getUsername());
			ptmt.setString(3, usr.getPassword());
			ptmt.setString(4, usr.getUserType());
			ptmt.executeUpdate();
			System.out.println("Login Data Added Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
	//validate user when logging in using boolean value
	public boolean validateLogin(String username,String password) {
		boolean status = false;
		try {
			String queryString = "SELECT * FROM login WHERE email_address=? AND login_password=?";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setString(1, username);
			ptmt.setString(2, password);

			ResultSet rs= ptmt.executeQuery();
			
			status=rs.next();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return status;
	}
	//retrieve the login details based on username and password 
	public BeanUsers retrieveUser (String username,String password) {
		BeanUsers usr = null;
		try {
			String queryString = "SELECT * FROM login WHERE email_address=? AND login_password=?";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setString(1, username);
			ptmt.setString(2, password);

			ResultSet rs= ptmt.executeQuery();
			usr = new BeanUsers();
			if(rs.next()){
				BeanUsers temp = new BeanUsers();
				temp.setID(rs.getInt("id"));
				temp.setUsername(rs.getString("email_address"));
				temp.setPassword(rs.getString("login_password"));
				temp.setUserType(rs.getString("account_type"));
				usr=temp;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return usr;
	}
	//retrieve user by username to access the user id
	public BeanUsers retrieveUserByUsername (String username) {
		BeanUsers usr = null;
		try {
			String queryString = "SELECT * FROM login WHERE email_address=?";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setString(1, username);

			ResultSet rs= ptmt.executeQuery();
			usr = new BeanUsers();
			if(rs.next()){
				BeanUsers temp = new BeanUsers();
				temp.setID(rs.getInt("id"));
				temp.setUsername(rs.getString("email_address"));
				temp.setPassword(rs.getString("login_password"));
				temp.setUserType(rs.getString("account_type"));
				usr=temp;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return usr;
	}
	
}
