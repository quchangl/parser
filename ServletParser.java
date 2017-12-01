import java.io.*;
import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class ServletParser extends HttpServlet {

    ResourceBundle rb = ResourceBundle.getBundle("LocalStrings");
    Parser myParser;
    String words[]={
		"shit","fuck","cunt","assole","suck"
	};
	
	public void init()
	{
		myParser = new Parser(words);
	}

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body bgcolor=\"white\">");
        out.println("<head>");
		
	String msg= "What an assole";
	
	
	
	String title = "Parser Test";

	out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>" + title + "</h3>");
	    out.println("<font face=verdana size=-1>");
        out.println("<h2>What i entered was :"+msg);
        out.println("<br><br>Parsed output is :"+myParser.checkBadOnes(msg));        
        out.println("</body>");
        out.println("</html>");
    }
}



