package ai.jobiak.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FactoialServlet
 */
@WebServlet("/FactoialServlet")
public class FactoialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
public FactoialServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		out.println("<html><head><title>FactorialServlet</title></head><body>");
         int n1 =Integer.parseInt(request.getParameter("num"));
         int num=5;
         int fact=1;
         for(int i=1;i<=num;i++)
         {
        	 fact*=i;
         }
         out.println("<h1>the factorial of 5 is:"+fact);
         out.println("</body></html>");
	}
}
         
         
         
         
         
         