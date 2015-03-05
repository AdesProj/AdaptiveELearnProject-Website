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
			String queryString = "SELECT * FROM courses ORDER BY course_title ASC";
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
	
	public ArrayList<BeanCourseInfo> getCourseInfo(int info_id) {
		ArrayList<BeanCourseInfo> course_info = null;
		try {
			String queryString = "SELECT *FROM course_info t, "
					+ "courses m WHERE m.course_info_id=t.course_info_id AND m.course_info_id = "+info_id+" ";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			rs1 = ptmt.executeQuery();
			course_info = new ArrayList<BeanCourseInfo>();
			while (rs1.next()) {
				BeanCourseInfo temp = new BeanCourseInfo();
				temp.setCourse_info_id(rs1.getInt("course_info_id"));
				temp.setNegotiable_course_duration(rs1.getString("negotiable_course_duration"));
				temp.setcourse_delivery_method(rs1.getString("course_delivery_method"));
				temp.setCourse_placement_option(rs1.getString("course_placement_option"));
				temp.setCourse_content_summary(rs1.getString("course_content_summary"));
				temp.setCourse_accreditation_level(rs1.getString("course_accreditation_level"));
				temp.setCourse_assessment_method(rs1.getString("course_assessment_method"));
				temp.setCert_prog_route(rs1.getString("cert_prog_route"));
				temp.setCourse_objectives(rs1.getString("course_objectives"));
				temp.setCourse_benefits(rs1.getString("course_benefits"));
				course_info.add(temp);
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
	return course_info;
	
	
}
}




