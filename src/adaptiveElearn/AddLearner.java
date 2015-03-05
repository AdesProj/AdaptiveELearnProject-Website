package adaptiveElearn;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddLearner
 */
@WebServlet("/add-learner")
public class AddLearner extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddLearner() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		LearnerDAO lconnect = new LearnerDAO();
		String fName = request.getParameter("firstname");
		System.out.println(fName);
		String lName = request.getParameter("lastname");
		String oName = request.getParameter("othername");
		String lEmail = request.getParameter("learner-email");
		String lTraining =request.getParameter("learner-training-interests");
		String interest = request.getParameter("specific-interest");
		String courseTitle = request.getParameter("course-choice-title");
		String duration = request.getParameter("course-choice-duration");
		String description = request.getParameter("description-of-interest");
		String eTraining = request.getParameter("existing-training");
		String cJob = request.getParameter("current-expected-job" );
		BeanLearner l =new BeanLearner (fName, lName, oName, lTraining, interest, courseTitle, duration, description,
				eTraining, cJob, lEmail );
		lconnect.add(l);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/learner-account.jsp");
		requestDispatcher.forward(request, response);
	}

}
