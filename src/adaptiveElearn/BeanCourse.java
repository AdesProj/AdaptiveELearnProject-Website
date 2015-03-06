package adaptiveElearn;

import java.io.Serializable;

public class BeanCourse implements Serializable  {
	private int course_id;
	private String course_title;
	private String subject_domain;
	private String course_duration;
	private String course_start_date;
	private String course_end_date;
	private Double course_cost;
	private String course_requirements;
	private int course_info_id;
	
	public  BeanCourse () {}
	
	public  BeanCourse (String c_title, String sub_domain,
			String c_duration, String c_start_date, String c_end_date,
			Double c_cost, String c_requirements, int c_info_id) { 
		course_title = c_title;
		subject_domain = sub_domain;
		course_duration = c_duration;
		course_start_date = c_start_date;
		course_end_date = c_end_date;
		course_cost = c_cost;
		course_requirements = c_requirements;
		course_info_id = c_info_id;	
	}
	
	public  BeanCourse (int c_id, String c_title, String sub_domain,
			String c_duration, String c_start_date, String c_end_date,
			Double c_cost, String c_requirements, int c_info_id) { 
		course_id = c_id;
		course_title = c_title;
		subject_domain = sub_domain;
		course_duration = c_duration;
		course_start_date = c_start_date;
		course_end_date = c_end_date;
		course_cost = c_cost;
		course_requirements = c_requirements;
		course_info_id = c_info_id;
		
	}
	public int getCourse_id(){
    	return course_id;
    }
	  public void setCourse_id (int course_id){
	    	this.course_id = course_id;
	    	}
	  
	
	public String getCourse_title(){
    	return course_title;
    }
	  public void setCourse_title (String course_title){
	    	this.course_title = course_title;
	  }
	  	  
	
	public String getSubject_domain(){
    	return subject_domain;
    }
	public void setSubject_domain(String subject_domain){
    	this.subject_domain = subject_domain;
  }

	
	public String getCourse_duration(){
    	return course_duration;
    }
	public void setCourse_duration(String course_duration){
    	this.course_duration = course_duration;
  }

	
	public String getCourse_start_date(){
    	return course_start_date;
    }
	public void setCourse_start_date (String course_start_date){
    	this.course_start_date = course_start_date;
  }

	public String getCourse_end_date(){
    	return course_end_date;
    }
	public void setCourse_end_date(String course_end_date){
    	this.course_end_date = course_end_date;
  }

	public Double  getCourse_cost(){
    	return course_cost;
    }
	public void setCourse_cost (Double course_cost){
    	this.course_cost = course_cost;
  }

	public String getCourse_requirements(){
    	return course_requirements;
    }
	public void setCourse_requirements(String course_requirements){
    	this.course_requirements = course_requirements;
  }

	
	public int getCourse_info_id(){
    	return 	course_info_id;
    }
	public void setCourse_info_id(int course_info_id){
    	this.course_info_id = course_info_id;
  }

	@Override
	public String toString() {
		return "BeanCourse [course_id=" + course_id + ", course_title="
				+ course_title + ", subject_domain=" + subject_domain
				+ ", course_duration=" + course_duration
				+ ", course_start_date=" + course_start_date
				+ ", course_end_date=" + course_end_date + ", course_cost="
				+ course_cost + ", course_requirements=" + course_requirements
				+ ", course_info_id=" + course_info_id + "]";
	}

	

}
