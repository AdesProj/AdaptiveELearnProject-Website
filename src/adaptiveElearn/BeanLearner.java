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
	private String descriptionOfInterest;
	private String existingTraining;
	private String currentJob;
	private String emailAddress;
	
	public  BeanLearner () {}
	
	public  BeanLearner (int lId, String lFName, String lOName, String lLName, String lTraining, String spcInsterest, 
			String c_Title, String d_Interest, String existingT, String c_Job, String email) {
		lId =learnId;
		lFName = l_Firstname;
		lOName= l_Othername;
		lLName=l_Lastname;
		lTraining=l_TrainingInterest;
		spcInsterest=specificInterest;
		c_Title=courseTitle;
		d_Interest=descriptionOfInterest;
		existingT=existingTraining;
		c_Job=currentJob;
		email=emailAddress;
	}
	public  BeanLearner ( String lFName, String lOName, String lLName, String lTraining, String spcInsterest, 
			String c_Title, String d_Interest, String existingT, String c_Job, String email) {
		lFName = l_Firstname;
		lOName= l_Othername;
		lLName=l_Lastname;
		lTraining=l_TrainingInterest;
		spcInsterest=specificInterest;
		c_Title=courseTitle;
		d_Interest=descriptionOfInterest;
		existingT=existingTraining;
		c_Job=currentJob;
		email=emailAddress;
		
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
					+ ", descriptionOfInterest=" + descriptionOfInterest
					+ ", existingTraining=" + existingTraining
					+ ", currentJob=" + currentJob + ", emailAddress="
					+ emailAddress + "]";
		}
		
}
