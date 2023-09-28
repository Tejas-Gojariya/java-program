package chirag;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/servlet2")
public class servlet2 extends HttpServlet{


	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Cookie ck[]=req.getCookies();
		res.getWriter().println("Name : "+ck[0].getValue());
		res.getWriter().println("Address : "+ck[1].getValue());
	}	
}
