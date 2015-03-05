package adaptiveElearn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CourseDAO {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet rs1 = null;
	
	
	public CourseDAO() {

	}

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionPoint.getInstance().getConnection();
		return conn;
	}
	
	public ArrayList<BeanCourse> viewCourses() {
		ArrayList<BeanCourse> courses = null;
		try {
			String queryString = "SELECT * FROM courses";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			rs1 = ptmt.executeQuery();

			courses = new ArrayList<BeanCourse>();
			while (rs1.next()) {
				BeanCourse temp = new BeanCourse();
				temp.setCourse_id(rs1.getInt("course_id"));
				temp.setCourse_title(rs1.getString("course_title"));
				temp.setSubject_domain(rs1.getString("subject_domain"));
				temp.setCourse_duration(rs1.getString("course_duration"));
				temp.setCourse_start_date(rs1.getString("course_start_date"));
				temp.setCourse_end_date(rs1.getString("course_end_date"));
				temp.setCourse_cost(rs1.getDouble("course_cost"));
				temp.setCourse_info_id(rs1.getInt("course_info_id"));
				courses.add(temp);
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
		return courses;
	}
	
	public ArrayList<BeanCourse> viewCoursesByLearnerEmail(String emailAdd) {
		ArrayList<BeanCourse> courses = null;
		try {
			String queryString = "SELECT * FROM courses, learners, login WHERE course_title=course_choice_title and learner_email_address=email_address and email_address='"+emailAdd+"' ";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			//ptmt.setString(1, emailAdd);
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			rs1 = ptmt.executeQuery();
 
			
			courses = new ArrayList<BeanCourse>();
			while (rs1.next()) {
				BeanCourse temp = new BeanCourse();
				temp.setCourse_id(rs1.getInt("course_id"));
				temp.setCourse_title(rs1.getString("course_title"));
				temp.setSubject_domain(rs1.getString("subject_domain"));
				temp.setCourse_duration(rs1.getString("course_duration"));
				temp.setCourse_start_date(rs1.getString("course_start_date"));
				temp.setCourse_end_date(rs1.getString("course_end_date"));
				temp.setCourse_cost(rs1.getDouble("course_cost"));
				temp.setCourse_info_id(rs1.getInt("course_info_id"));
				courses.add(temp);
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
		return courses;
	}
}




