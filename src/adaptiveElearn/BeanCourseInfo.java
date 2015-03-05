package adaptiveElearn;

import java.io.Serializable;

public class BeanCourseInfo implements Serializable{
	private int course_info_id;
	private String negotiable_course_duration;
	private String course_delivery_method;
	private String course_placement_option;
	private String course_content_summary;
	private String course_accreditation_level;
	private String course_assessment_method;
	private String cert_prog_route;
	private String course_objectives;
	private String course_benefits;
	
	public  BeanCourseInfo () {}
	
	public  BeanCourseInfo (
			String negotiable_duration,
			String c_delivery_method,
			String c_placement_option,
			String c_content_summary,
			String c_accreditation_level,
			String c_assessment_method,
			String cert_route,
			String c_objectives,
			String c_benefits) {}

	public  BeanCourseInfo (int info_id,
			String negotiable_duration,
			String c_delivery_method,
			String c_placement_option,
			String c_content_summary,
			String c_accreditation_level,
			String c_assessment_method,
			String cert_route,
			String c_objectives,
			String c_benefits) {
		
		course_info_id = info_id;
		negotiable_course_duration = negotiable_duration;
		course_delivery_method = c_delivery_method;
		course_placement_option = c_placement_option;
		course_content_summary = c_content_summary;
		course_accreditation_level = c_accreditation_level;
		course_assessment_method = c_assessment_method;
		cert_prog_route = cert_route;
		course_objectives = c_objectives;
		course_benefits =c_benefits;
	}
	public int geCourse_info_id (){
    	return course_info_id;
    }
    public void setCourse_info_id (int course_info_id){
    	this.course_info_id = course_info_id;
    }
    public String getNegotiable_course_duration(){
    	return negotiable_course_duration;
    }
    
    public void setNegotiable_course_duration(String negotiable_course_duration){
    	this.negotiable_course_duration = negotiable_course_duration;
    } 
    public String getCourse_delivery_method(){
    	return course_delivery_method;
    }
    
    public void setcourse_delivery_method(String course_delivery_method){
    	this.course_delivery_method =course_delivery_method;
    } 
    
    public String getCourse_placement_option(){
    	return course_placement_option;
    }
    
    public void setCourse_placement_option(String course_placement_option){
    	this.course_placement_option =course_placement_option;
    } 
    public String getCourse_content_summary(){
    	return course_content_summary;
    }
    
    public void setCourse_content_summary(String course_content_summary){
    	this.course_content_summary =course_content_summary;
    } 
    public String getCourse_accreditation_level(){
    	return course_accreditation_level;
    }
    
    public void setCourse_accreditation_level(String course_accreditation_level){
    	this.course_accreditation_level =course_accreditation_level;
    } 
    public String getcourse_assessment_method(){
    	return course_assessment_method;
    }
    
    public void setCourse_assessment_method(String course_assessment_method){
    	this.course_assessment_method =course_assessment_method;
    } 
    
    public String getCert_prog_route(){
    	return cert_prog_route;
    }
    
    public void setCert_prog_route(String cert_prog_route){
    	this.cert_prog_route =cert_prog_route;
    } 
    public String getCourse_objectives(){
    	return course_objectives;
    }
    
    public void setCourse_objectives(String course_objectives){
    	this.course_objectives =course_objectives;
    } 
    public String getCourse_benefits(){
    	return course_benefits;
    }
    
    public void setCourse_benefits(String course_benefits){
    	this.course_benefits =course_benefits;
    }

	@Override
	public String toString() {
		return "BeanCourseInfo [course_info_id=" + course_info_id
				+ ", negotiable_course_duration=" + negotiable_course_duration
				+ ", course_delivery_method=" + course_delivery_method
				+ ", course_placement_option=" + course_placement_option
				+ ", course_content_summary=" + course_content_summary
				+ ", course_accreditation_level=" + course_accreditation_level
				+ ", course_assessment_method=" + course_assessment_method
				+ ", cert_prog_route=" + cert_prog_route
				+ ", course_objectives=" + course_objectives
				+ ", course_benefits=" + course_benefits + "]";
	} 
    
}
