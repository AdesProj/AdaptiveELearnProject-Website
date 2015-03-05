package adaptiveElearn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ProviderDAO {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet rs1 = null;
	
	
	public ProviderDAO() {

	}

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionPoint.getInstance().getConnection();
		return conn;
	}
	
	
	
	public ArrayList<BeanProvider> viewProviderByEmail(String emailAdd) {
		ArrayList<BeanProvider> provider = null;
		try {
			String queryString = "SELECT * FROM providers, login WHERE provider_email_address=email_address and email_address='"+emailAdd+"' ";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			//ptmt.setString(1, emailAdd);
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			rs1 = ptmt.executeQuery();
 
			
			provider = new ArrayList<BeanProvider>();
			while (rs1.next()) {
				BeanProvider temp = new BeanProvider();
				temp.setProvId(rs1.getInt("provider_id"));
				temp.setP_Firstname(rs1.getString("provider_first_name"));
				temp.setP_Lastname(rs1.getString("provider_last_name"));
				temp.setP_Course_Taught(rs1.getString("provider_course_taught"));
				temp.setP_Degree(rs1.getString("provider_degree"));
				temp.setP_Office_Hours(rs1.getString("provider_office_hours"));
				temp.setCourseId(rs1.getInt("course_id"));
				temp.setEmailAddress(rs1.getString("provider_email_address"));
				
				provider.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs1 != null)
					rs1.close();
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
		return provider;
	}
	

}
