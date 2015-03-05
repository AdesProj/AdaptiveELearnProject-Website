package adaptiveElearn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class LearnerDAO {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet rs1 = null;
	
	
	public LearnerDAO() {

	}

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionPoint.getInstance().getConnection();
		return conn;
	}
	
	public void add(BeanLearner c) {
		try {
			String queryString = "INSERT INTO learners(learner_first_name, learner_other_names, learner_last_name, "
					+ " learner_training_interests, specific_interests, course_choice_title, course_choice_duration,"
					+ "description_of_interest, existing_training, current_expected_job, learner_email_address) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setString(1, c.getL_Firstname());
			System.out.println(c.getL_Firstname() + " " + c.getL_Lastname());
			ptmt.setString(2, c.getL_Othername());
			ptmt.setString(3, c.getL_Lastname());
			ptmt.setString(4, c.getL_TrainingInterest());
			ptmt.setString(5, c.getSpecificInterest());
			ptmt.setString(6, c.getCourseTitle());
			ptmt.setString(7, c.getCDuration());
			ptmt.setString(8, c.getDescriptionOfInterest());
			ptmt.setString(9, c.getExistingTraining());
			ptmt.setString(10, c.getCurrentJob());
			ptmt.setString(11, c.getEmailAddress());
			ptmt.executeUpdate();
			System.out.println("Data Added Successfully");
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
	
	public ArrayList<BeanLearner> viewLearnerByEmail(String emailAdd) {
		ArrayList<BeanLearner> learner = null;
		try {
			String queryString = "SELECT * FROM learners, login WHERE learner_email_address=email_address and email_address='"+emailAdd+"' ";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			//ptmt.setString(1, emailAdd);
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			rs1 = ptmt.executeQuery();
 
			
			learner = new ArrayList<BeanLearner>();
			while (rs1.next()) {
				BeanLearner temp = new BeanLearner();
				temp.setLearnerId(rs1.getInt("learner_id"));
				temp.setL_Firstname(rs1.getString("learner_first_name"));
				temp.setL_Lastname(rs1.getString("learner_last_name"));
				temp.setL_Othername(rs1.getString("learner_other_names"));
				temp.setL_TrainingInterest(rs1.getString("learner_training_interests"));
				temp.setSpecificInterest(rs1.getString("specific_interests"));
				temp.setDescriptionOfInterest(rs1.getString("description_of_interest"));
				temp.setExistingTraining(rs1.getString("existing_training"));
				temp.setCurrentJob(rs1.getString("current_expected_job"));
				temp.setEmailAddress(rs1.getString("learner_email_address"));
				
				learner.add(temp);
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
		return learner;
	}
	
	public ArrayList<BeanLearner> viewAllLearners() {
		ArrayList<BeanLearner> learner = null;
		try {
			String queryString = "SELECT * FROM learners";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			rs1 = ptmt.executeQuery();
 
			
			learner = new ArrayList<BeanLearner>();
			while (rs1.next()) {
				BeanLearner temp = new BeanLearner();
				temp.setLearnerId(rs1.getInt("learner_id"));
				temp.setL_Firstname(rs1.getString("learner_first_name"));
				temp.setL_Lastname(rs1.getString("learner_last_name"));
				temp.setL_Othername(rs1.getString("learner_other_names"));
				temp.setL_TrainingInterest(rs1.getString("learner_training_interests"));
				temp.setSpecificInterest(rs1.getString("specific_interests"));
				temp.setDescriptionOfInterest(rs1.getString("description_of_interest"));
				temp.setExistingTraining(rs1.getString("existing_training"));
				temp.setCurrentJob(rs1.getString("current_expected_job"));
				temp.setEmailAddress(rs1.getString("learner_email_address"));
				
				learner.add(temp);
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
		return learner;
	}
	
}
