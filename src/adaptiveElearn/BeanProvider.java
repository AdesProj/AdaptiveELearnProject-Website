/**
 * 
 */

package adaptiveElearn;
import java.io.Serializable;

public class BeanProvider implements Serializable {
	
	private int providerId;
	private String p_Firstname;
	private String p_Lastname;
	private String p_Email;
	private int courseId;
	private String p_degree;
	private String p_office_hours;
	private String p_course_taught;

	public  BeanProvider () {}
	
	public  BeanProvider (int pId, String pFName, String pOName, String pLName, int cId, String pDegree, 
			String pOfficeHours, String pCourseTaught) {
		providerId = pId;
		p_Firstname = pFName;
		p_Lastname = pLName;
		courseId = cId;
		p_degree = pDegree;
		p_office_hours = pOfficeHours;
		p_course_taught = pCourseTaught;
	}
	public  BeanProvider (String pFName, String pOName, String pLName, int cId, String pDegree, 
			String pOfficeHours, String pCourseTaught) {
		p_Firstname = pFName;
		p_Lastname = pLName;
		courseId = cId;
		p_degree = pDegree;
		p_office_hours = pOfficeHours;
		p_course_taught = pCourseTaught;
	}
	 public int getProvId (){
	    	return providerId;
	    }
	    public void setLearnerId (int pId){
	    	this.providerId = pId;
	    }
	    public String getP_Firstname(){
	    	return p_Firstname;
	    }
	    
	    public void setP_Firstname(String p_Firstname){
	    	this.p_Firstname =p_Firstname;
	    } 
	    
	    public String getP_Lastname(){
	    	return p_Lastname;
	    }
	    
	    public void setP_Lastname(String p_Lastname){
	    	this.p_Lastname =p_Lastname;
	    }
	    
	    public void setCourseId(int id ){
	    	this.courseId = id;
	    }
	    
	    public int getCourseId(int id){
	    	return courseId;
	    }
	    
	    public void setEmailAddress(String email ){
	    	this.p_Email =email;
	    }
	    
	    public String getEmailAddress(){
	    	return p_Email;
	    }
	    
	    public void setP_Degree(String pDegree ){
	    	this.p_degree =pDegree;
	    }
	    
	    public String getP_Degree(){
	    	return p_degree;
	    }
	    
	    public void setP_Office_Hours(String pOffHours ){
	    	this.p_office_hours =pOffHours;
	    }
	    
	    public String getP_Office_Hours(){
	    	return p_office_hours;
	    }
	    
	    public void setP_Course_Taught(String pCourseTaught ){
	    	this.p_course_taught =pCourseTaught;
	    }
	    
	    public String getP_Course_Taught(){
	    	return p_course_taught;
	    }

		@Override
		public String toString() {
			return "BeanProvider [providerId=" + providerId + ", p_Firstname="
					+ p_Firstname + ", p_Lastname=" + p_Lastname + ", p_Email="
					+ p_Email + ", courseId=" + courseId + ", p_degree="
					+ p_degree + ", p_office_hours=" + p_office_hours
					+ ", p_course_taught=" + p_course_taught + "]";
		}
	     

}
