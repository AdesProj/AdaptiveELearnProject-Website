<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,adaptiveElearn.*"%>
<%  LearnerDAO lconnect = new LearnerDAO();
	LoginDAO loconnect = new LoginDAO();
	CourseDAO cconnect = new CourseDAO(); %>
    <!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home || Adaptive E-Learn Systems</title>
<link rel="stylesheet" type="text/css" href="design.css" />
</head>
<body>
	<div id="wrapper">
		<div id="headerwrap">
			<div id="header">
				<div id="logo">
				<a href="index.html"><img src="http://www.adaptive-elearn.com/wp-content/uploads/2014/08/cropped-Untitled-26.png" width="1500" height="118" alt="Adaptive E-Learning"></a>
			</div>
			</div>
		</div>
		
		<div id="navigationwrap">
			<div id="navigation">
				<div id="tabs24">
					<ul>
						<li><a href='index.jsp' class='current'> <span>Home</span></a></li>
						<li><a href='about-us.html'><span>About Us</span></a></li>
						<li><a href='sample-training-video.html'><span>Sample Training Video</span></a></li>										
						<li><a href='product-services.html'><span>Adaptive-Elearn Product and Services</span></a></li>
						<li><a href='view-courses.jsp'><span>Courses</span></a></li>	
						<li><a href='learner-account.jsp'><span>Learner Account</span></a></li>		
						<li><a href='provider-account.jsp'><span>Provider Account</span></a></li>		
						<li><a href='user-validation.html'><span>Register</span> </a></li>			
						<li><a href='contact-us.html'><span>Contact Us</span></a></li>
						<li><a href='blog.html'><span>Blog</span></a></li>
					</ul>
				</div>
			</div>
		</div>
		<div id="contentliquid">
			<div id="contentwrap">
				<div id="content">
  <%   Cookie ck[]=request.getCookies();  
	String username=null;
	String type=null;
	 if (ck != null) {
	for (Cookie cookie : ck) {
		   if(cookie.getName().equals("username")){
			  username=cookie.getValue();
		   }
		   if(cookie.getName().equals("usertype")){
			   type=cookie.getValue();
		   }
	   } 
	}
	 
	 if (username == null || username.equals("")){
		 request.setAttribute("errorMessage", "Please login first!"); 
		 request.getRequestDispatcher("login.jsp").forward(request, response);  
		 return;
		 }
	 if (!type.equals("learner") && !type.equals("provider") && type!=null){
		 request.setAttribute("errorMessage", "Sorry providers cannot login to learner area!"); 
		 request.getRequestDispatcher("login.jsp").forward(request, response);  
		 return;
	 }
	 ArrayList<BeanCourse> cDet=cconnect.viewCoursesByLearnerEmail(username);
	 //BeanUsers usr =null;
	 //usr=loconnect.retrieveUserByUsername(username);
	String name="";
	 ArrayList<BeanLearner> lDet=lconnect.viewLearnerByEmail(username);
          %>
          <%for (BeanLearner l : lDet) {
          name=l.getL_Firstname();%>
          Learner ID: <%=l.getLearnId() %> <br>
          Full Name: <%=l.getL_Firstname()%> <%if(l.getL_Othername()==""){ out.println(l.getL_Othername());}%> <%=l.getL_Lastname()%> <br>
          Email Address: <%=l.getEmailAddress() %> <br>
          Training Interests: <%=l.getL_TrainingInterest() %> <br>
          Specific Interests: <%=l.getSpecificInterest() %> <br>
          Existing Training: <%if(l.getExistingTraining()=="Y"){out.println("Yes");}else out.println("No");%> <br>
          Current Job: <%if(l.getCurrentJob()==""){ out.println(l.getCurrentJob());}else out.println("None");%> 
        
          
          
          
          <% } %>
         <h3> Here is a list of your courses, <%=name%>!</h3>
         	<table border="1">
         		<tr>
							<th>Course Id</th>
							<th>course title</th>
							<th>Subject Domain</th>
							<th>Duration</th>
							<th>Start Date</th>
							<th>End Date</th>
							<th>Cost</th>
							<th>Course Requirements</th>
							<th>Course Information Id </th>
						</tr>
					
								<%for (BeanCourse c : cDet) {%>
									<tr><td> <%=c.getCourse_id()%></td>
									<td> <%=c.getCourse_title()%> </td>
									<td> <%=c.getSubject_domain()%> </td>
									<td> <%=c.getCourse_duration()%> </td>
									<td> <%=c.getCourse_start_date()%> </td>
									<td> <%=c.getCourse_end_date()%> </td>
									<td> <%=c.getCourse_cost()%> </td>
									<td> <%if(c.getCourse_requirments()==""){ out.println(c.getCourse_requirments());}else out.println("None");%> </td>
									<td> <%=c.getCourse_info_id()%> </td></tr> <%} %>
				
         	</table>
         	

				
				</div>
			</div>
		</div>
		<div id="leftcolumnwrap">
			<div id="leftcolumn">
		<jsp:include page="loginform.jsp" />
				
			</div>
		</div>
		<div id="footerwrap">
			<div id="footer">
				<i><span>Adaptive E-Learn Systems (ADES) Ltd, Innospace, The Shed, Chester Street, Manchester, M1 5GD</span></i>
				</br>ï¿½ 2015 Adaptive E-Learning
				<div id="accessibility">
					
				</div>
			</div>

		</div>
	</div>
</body>
</html>