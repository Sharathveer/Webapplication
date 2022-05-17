package ai.jobiak.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadAttributesServlet
 */
@WebServlet("/ReadAttributesServlet")
public class ReadAttributesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadAttributesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
 PrintWriter out=response.getWriter();
 ServletContext context=getServletContext();
 out.println("DB Name"+context.getAttribute("dbname"));
 out.println("DB version"+context.getAttribute("dbversion"));
 out.println("JDK version"+request.getAttribute("jdk"));
 out.println("platform"+request.getAttribute("os"));
	}

}
