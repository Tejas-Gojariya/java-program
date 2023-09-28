package chirag;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/welcome")
public class DemoServ extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String val = req.getParameter("nameVal");
		String addr= req.getParameter("addr");
		
		PrintWriter out=res.getWriter();
		
//		Cookies
		Cookie ck1=new Cookie("name",val);
		Cookie ck2=new Cookie("addr",addr);
		res.addCookie(ck1);
		res.addCookie(ck2);
		
		res.setContentType("text/html");		
		out.println("<html>");
		out.println("<h3>Welcome "+ck1.getValue()+"</h3>");
		out.println("<form action='servlet2'>");
		out.println("<input type='submit' value='show'>");
		out.println("</html>");
		out.close();	

	}
	
}