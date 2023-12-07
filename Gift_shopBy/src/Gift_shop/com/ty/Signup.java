package Gift_shop.com.ty;

import java.io.IOException;
import java.lang.*;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet("/signup")
	public class Signup extends HttpServlet{
		static String pass1;
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
//			String name=req.getParameter("us");
//			String email=req.getParameter("em");
//			String pw=req.getParameter("pw");
//			String phno=req.getParameter("phno");
			

			String uname=req.getParameter("us");
			String uemail=req.getParameter("em");
			String upw=req.getParameter("pw");
			String Reupw=req.getParameter("re_pw");

			String uphno=req.getParameter("phno");
			
			RequestDispatcher dispatcher=null;
			Connection con=null;
			PrintWriter out=resp.getWriter();

			out.print(uname);
			out.print(uemail);
			out.print(upw);
			out.print(uphno);
			
			if (uname == null || uname.equals("")) {
				req.setAttribute("status", "invalidName");
				dispatcher=req.getRequestDispatcher("login.html");
				dispatcher.forward(req, resp);
			}
			
			if (uemail == null || uname.equals("")) {
				req.setAttribute("status", "invalidEmail");
				dispatcher=req.getRequestDispatcher("login.html");
				dispatcher.forward(req, resp);
			}
			if (upw == null || upw.equals("")) {
				req.setAttribute("status", "invalidUpwd");
				dispatcher=req.getRequestDispatcher("login.html");
				dispatcher.forward(req, resp);
			}else if(!upw.equals(Reupw)){
				req.setAttribute("status", "invalidConfirmUpwd");
				dispatcher=req.getRequestDispatcher("login.html");
				dispatcher.forward(req, resp);

			}
			if (uphno == null || uphno.equals("")) {
				req.setAttribute("status", "invalidPhno");
				dispatcher=req.getRequestDispatcher("login.html");
				dispatcher.forward(req, resp);
			}
			else if(uphno.length()>10) {
				req.setAttribute("status", "InvalidPhnoLength");
				dispatcher=req.getRequestDispatcher("login.html");
				dispatcher.forward(req, resp);
			}
			
			
			String fqcn="com.mysql.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306?user=root&password=Pratu@452";
			
			try {
				//step 1
				Class.forName(fqcn);
				
				//step 2
				 con=DriverManager.getConnection(url);
				
				//step 3
				PreparedStatement ps=con.prepareStatement("insert into project2.signup(name,email,password,phno) values(?,?,?,?)");
				
				ps.setString(1, uname);
				ps.setString(2, uemail);
				ps.setString(3, upw);
				ps.setString(4, uphno);
			
				int rowc=ps.executeUpdate();
				dispatcher=req.getRequestDispatcher("signup.html");
				
				dispatcher.forward(req, resp);
				System.err.println("inserted...!");
						
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				try {
					con.close();
				} catch (Exception e2) {
					e2.printStackTrace();
					// TODO: handle exception
				}
				
			}
			

		}
	}


