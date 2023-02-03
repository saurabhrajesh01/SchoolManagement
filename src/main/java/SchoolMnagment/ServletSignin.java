package SchoolMnagment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/vaish")
public class ServletSignin extends HttpServlet
{
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String name=req.getParameter("name");
	int age=Integer.parseInt(req.getParameter("age"));
	long mobno=Long.parseLong(req.getParameter("mobno"));
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	
	
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("chavan");
	 EntityManager em=emf.createEntityManager();
	 EntityTransaction et=em.getTransaction();
	
	Principal p=new Principal();
	p.setName(name);
	p.setAge(age);
	p.setMobno(mobno);
	p.setEmail(email);
	p.setPassword(password);
	
	et.begin();
	em.persist(p);
	et.commit();
	 
	RequestDispatcher rd=req.getRequestDispatcher("main.html");
	rd.include(req, resp);
	resp.setContentType("text/html");
			
	
	
	
	
	
	
	
	
	
	
}
}
