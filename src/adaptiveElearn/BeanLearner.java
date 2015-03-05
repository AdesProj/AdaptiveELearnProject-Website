/**
 * 
 */

package adaptiveElearn;
import java.io.Serializable;

public class BeanLearner implements Serializable {
	
	private int learnId;
	private String l_Firstname;
	private String l_Othername;
	private String l_Lastname;
	private String l_TrainingInterest;
	private String specificInterest;
	private String courseTitle;
	private String c_duration;
	private String descriptionOfInterest;
	private String existingTraining;
	private String currentJob;
	private String emailAddress;
	
	public  BeanLearner () {}
	
	public  BeanLearner (int lId, String lFName, String lOName, String lLName, String lTraining, String spcInsterest, 
			String c_Title, String c_dura, String d_Interest, String existingT, String c_Job, String email) {
		lId =learnId;
		lFName = l_Firstname;
		lOName= l_Othername;
		lLName=l_Lastname;
		lTraining=l_TrainingInterest;
		spcInsterest=specificInterest;
		c_Title=courseTitle;
		c_dura =c_duration;
		d_Interest=descriptionOfInterest;
		existingT=existingTraining;
		c_Job=currentJob;
		email=emailAddress;
	}
	public  BeanLearner ( String lFName, String lOName, String lLName, String lTraining, String spcInsterest, 
			String c_Title,String c_dura, String d_Interest, String existingT, String c_Job, String email) {
		l_Firstname = lFName;
		l_Othername = lOName;
		l_Lastname =lLName;
		l_TrainingInterest=lTraining;
		specificInterest =spcInsterest;
		courseTitle = c_Title;
		c_duration =c_dura ;
		descriptionOfInterest=d_Interest;
		existingTraining = existingT;
		currentJob = c_Job;
		emailAddress = email;
		
	}
	 public int getLearnId (){
	    	return learnId;
	    }
	    public void setLearnerId (int learnId){
	    	this.learnId = learnId;
	    }
	    public String getL_Firstname(){
	    	return l_Firstname;
	    }
	    
	    public void setL_Firstname(String l_Firstname){
	    	this.l_Firstname =l_Firstname;
	    } 
	    
	    public String getL_Othername(){
	    	return l_Othername;
	    }
	    
	    public void setL_Othername(String l_Othername){
	    	this.l_Othername =l_Othername;
	    }
	    
	    public String getL_Lastname(){
	    	return l_Lastname;
	    }
	    
	    public void setL_Lastname(String l_Lastname){
	    	this.l_Lastname =l_Lastname;
	    }
	   
	    public void setL_TrainingInterest(String l_TrainingInterest){
	    	this.l_TrainingInterest =l_TrainingInterest;
	    }
	    
	    public String getL_TrainingInterest(){
	    	return l_TrainingInterest ;
	    }
	    
	    public void setSpecificInterest(String specificInterest ){
	    	this.specificInterest =specificInterest;
	    }
	    
	    public String getSpecificInterest(){
	    	return specificInterest;
	    } 
	    public String getCourseTitle (){
	    	return courseTitle;
	    }
	    public void setCourseId (String courseTitle){
	    	this.courseTitle = courseTitle;
	    }
	    public String getCDuration(){
	    	return c_duration;
	    }
	    
	    public void setC_duration(String c_duration){
	    	this.c_duration =c_duration;
	    }
	    public void setDescriptionOfInterest(String descriptionOfInterest ){
	    	this.descriptionOfInterest =descriptionOfInterest;
	    }
	    
	    public String getDescriptionOfInterest(){
	    	return descriptionOfInterest;
	    }
	    public void setExistingTraining(String existingTraining){
	    	this.existingTraining =existingTraining;
	    }
	    
	    public String getExistingTraining(){
	    	return existingTraining;
	    }
	    public void setCurrentJob(String currentJob ){
	    	this.currentJob =currentJob;
	    }
	    
	    public String getCurrentJob(){
	    	return currentJob;
	    }
	    
	    public void setEmailAddress(String email ){
	    	this.emailAddress =email;
	    }
	    
	    public String getEmailAddress(){
	    	return emailAddress;
	    }

		@Override
		public String toString() {
			return "BeanLearner [learnId=" + learnId + ", l_Firstname="
					+ l_Firstname + ", l_Othername=" + l_Othername
					+ ", l_Lastname=" + l_Lastname + ", l_TrainingInterest="
					+ l_TrainingInterest + ", specificInterest="
					+ specificInterest + ", courseTitle=" + courseTitle
					+ ", c_duration=" + c_duration + ", descriptionOfInterest="
					+ descriptionOfInterest + ", existingTraining="
					+ existingTraining + ", currentJob=" + currentJob
					+ ", emailAddress=" + emailAddress + "]";
		}

		
}
