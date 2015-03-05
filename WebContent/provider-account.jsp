<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,adaptiveElearn.*"%>
<%  ProviderDAO pconnect = new ProviderDAO();
	LoginDAO loconnect = new LoginDAO();
	LearnerDAO lconnect = new LearnerDAO(); %>
    <!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Provider Account || Adaptive E-Learn Systems</title>
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
						<li><a href='user-validation.jsp'><span>Register</span> </a></li>			
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
	 if (!type.equals("provider") && type!=null){
		 request.setAttribute("errorMessage", "Sorry learners cannot login to provider area!"); 
		 request.getRequestDispatcher("login.jsp").forward(request, response);  
		 return;
	 }
	 ArrayList<BeanProvider> pDet=pconnect.viewProviderByEmail(username);
	 ArrayList<BeanLearner> lDet=lconnect.viewAllLearners();

	String name="";

          %>
          <%for (BeanProvider p : pDet) { 
          name=p.getP_Firstname();%>
          Personal Details:<br>
          Provider ID: <%=p.getProvId() %> <br>
          Full Name: <%=p.getP_Firstname()%> <%=p.getP_Lastname()%> <br>
          Email Address: <%=p.getEmailAddress() %> <br>
          Course Taught: <%=p.getP_Course_Taught()%> <br>
          Qualified Subject Degree: <%=p.getP_Degree() %> <br>
          Office Hours: <%=p.getP_Office_Hours() %> <br>
         
         
          
          
          <% } %>
         <h2> Welcome to your provider profile, <%=name%>!</h2>
         
         	<table border="1">
         		<tr>
							<th>Learner ID</th>
							<th>First Name</th>
							<th>Other Name</th>
							<th>Last Name</th>
							<th>Email Address</th>
							<th>Training Interests</th>
							<th>Specific Interests</th>
							<th>Existing Training</th>
							<th>Current Job</th>
						</tr>
					
								<%for (BeanLearner l : lDet) {%>
		<tr><td> <%=l.getLearnId() %> </td>
         <td> <%=l.getL_Firstname()%> </td>
        <td> <%if(l.getL_Othername()==""){ out.println(l.getL_Othername());}%> </td>
         <td><%=l.getL_Lastname()%> </td>
           <td><%=l.getEmailAddress() %> </td>
         <td> <%=l.getL_TrainingInterest() %> </td>
         <td> <%=l.getSpecificInterest() %> </td>
         <td> <%if(l.getExistingTraining()=="Y"){out.println("Yes");}else out.println("No");%></td> 
        <td> <%if(l.getCurrentJob()==""){ out.println(l.getCurrentJob());}else out.println("None");%></td></tr>
        
          
          <%} %>
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