package adaptiveElearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/** 
 * Servlet implementation class LoginProcess
 * Servlet to process logout
 */
@WebServlet("/logoutprocess")
public class LogoutProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutProcess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //retrieve cookies and declare variables
		Cookie ck[]=request.getCookies(); 
		String username=null;
		String type=null;
		int nmeArrNo=0;
		int typArrNo=0;
		//get the specific cookies
		 if (ck != null) {
		for (int i = 0; i < ck.length; i++) {
			   if(ck[i].getName().equals("username")){
				  username=ck[i].getValue();
				  nmeArrNo=i;
			   }
			   if(ck[i].getName().equals("usertype")){
				   type=ck[i].getValue();
					  typArrNo=i; 
			   }
		   }
		 } //remove cookies and logout
	    	if(typArrNo!=0 && nmeArrNo!=0){
	    		if(!username.equals("") || username!=null){
				 ck[nmeArrNo] =new Cookie("username","");  
				 ck[typArrNo] =new Cookie("usertype","");  
			        ck[nmeArrNo].setMaxAge(-1);  
			        ck[typArrNo].setMaxAge(-1);  
			        response.addCookie(ck[nmeArrNo]); 
			        response.addCookie(ck[typArrNo]); 
			request.setAttribute("errorMessage", "You have logged out!");
	    	RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
	    	rd.forward(request,response);  
	    	return; 
	    	}else {
				request.setAttribute("errorMessage", "You cannot logout as you were not logged in!");
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
		    	rd.forward(request,response);  
		    	return;
			}
			}else {
				request.setAttribute("errorMessage", "You cannot logout as you were not logged in!");
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
		    	rd.forward(request,response);  
		    	return;
			}
	    
		
		}
		 
	

}
