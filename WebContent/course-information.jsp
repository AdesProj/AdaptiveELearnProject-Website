<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,adaptiveElearn.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Courses || Adaptive E-Learn Systems</title>
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
						<li><a href='index.jsp' > <span>Home</span></a></li>
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
				<INPUT TYPE="button" VALUE="Back" onClick="history.go(-1)"> <br><br>
					<%
					    CourseDAO pconnect = new CourseDAO();
					int infoId = Integer.parseInt(request.getParameter("course_info_id"));
					ArrayList<BeanCourseInfo> course_info = pconnect.getCourseInfo(infoId);
							%>
					<table border="1">
						<tr>
							<th>Course Information Id</th>
							<th>Negotiable Course Duration</th>
							<th>Course Delivery Method</th>
							<th>Course Placement_option</th>
							<th>Course Content Summary</th>
							<th>Course Accreditation Level</th>
							<th>Course Assessment Method</th>
							<th>Cert Prog Route</th>
							<th>Course Objectives</th>
							<th>Course Benefits</th>
						</tr>
					<%
								for (BeanCourseInfo t : course_info) {
									out.println("<tr><td> " + t.geCourse_info_id() + "</td>");
									out.println("<td> " + t.getNegotiable_course_duration()+ "</td>");
									out.println("<td> " + t.getCourse_delivery_method() + "</td>");
									out.println("<td> " + t.getCourse_placement_option() + "</td>");
									out.println("<td> " + t.getCourse_content_summary() + "</td>");
									out.println("<td> " + t.getCourse_accreditation_level() + "</td>");
									out.println("<td> " + t.getcourse_assessment_method() + "</td>");
									out.println("<td> " + t.getCert_prog_route() + "</td>");
									out.println("<td> " + t.getCourse_objectives() + "</td>");
									out.println("<td> " + t.getCourse_benefits() + "</td>");
									%>
				
			
							<%}
				
						%> 
					</table>
				<br><Br>
				
				
				</div>
			</div>
		</div>
		<div id="leftcolumnwrap">
			<div id="leftcolumn">
		
				
			</div>
		</div>
		<div id="footerwrap">
			<div id="footer">
				<i><span>Adaptive E-Learn Systems (ADES) Ltd, Innospace, The Shed, Chester Street, Manchester, M1 5GD</span></i>
				</br>� 2015 Adaptive E-Learning
				<div id="accessibility">
					
				</div>
			</div>

		</div>
	</div>
</body>
</html>