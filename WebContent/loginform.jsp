<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="design.css" />
</head>
<body>
<form action="loginprocess" method="post">  
				
								<% 
								 Cookie ck[]=request.getCookies();  
								String username=null;
								 if (ck != null) {
								for (Cookie cookie : ck) {
									   if(cookie.getName().equals("username")){
										  username=cookie.getValue();
										 
									   }
								   } 
								}
					if(username!=null){
					if(!username.equals("") ){%>
					You are logged in as: <strong><%=username%></strong>.
					<a href="logoutprocess">Logout</a>
					<%}else {%>
					
				<table><tr>
				<td><input type="text" name="username" placeholder="Username" required/></td></tr>
				
				<tr>
				<td><input type="password" name="userpass" placeholder="Password" required/></td></tr>
				
				<tr><td><input type="submit" value="Login"/></td></tr></table>
				</form>  
				
				<%} 
					 }else {%>
					<table><tr>
					<td><input type="text" name="username" placeholder="Username" required/></td></tr>
					
					<tr>
					<td><input type="password" name="userpass" placeholder="Password" required/></td></tr>
					
					<tr><td><input type="submit" value="Login"/></td></tr></table>
					</form>  
			<%} %>
</html>