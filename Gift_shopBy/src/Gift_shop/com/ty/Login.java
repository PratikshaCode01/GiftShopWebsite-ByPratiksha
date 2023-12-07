package Gift_shop.com.ty;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login {
	@WebServlet("/login")
	public static class login extends HttpServlet {
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			RequestDispatcher dispatcher=null;
			Connection con=null;
		

			String fqcn="com.mysql.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306?user=root&password=Pratu@452";
			


			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			
			String username=req.getParameter("us");
			String passWord=req.getParameter("pass");
			
			try {
				
				//step 1
				Class.forName(fqcn);
				
				//step 2
				 con=DriverManager.getConnection(url);
				
				//step 3
	
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("Select * from  project2.signup  where email='"+username+"' and Password='"+passWord+"'");
				if (rs.next()) {
					resp.sendRedirect("index.html");
					
				} else {
	out.print("<h1>please Enter valid username and password..!</h1><br>");
//					resp.sendRedirect("<h1>please Enter valid username and password..!</h1><br>");
				
	req.setAttribute("error", "Please Enter valid username and password..!");
	resp.sendRedirect("login.html");
				}
				con.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
	}

//	public static Object wrong() {
//		// TODO Auto-generated method stub
//		return null;
//		
//	}




}
