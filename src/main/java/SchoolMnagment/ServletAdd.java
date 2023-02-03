package SchoolMnagment;

import java.io.IOException;

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
@WebServlet("/sauri")
public class ServletAdd extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id= Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		double fees=Double.parseDouble(req.getParameter("fees"));
		String stream=req.getParameter("stream");
		
		
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("chavan");
		 EntityManager em=emf.createEntityManager();
		 EntityTransaction et=em.getTransaction();
		 
		 Student s=new Student();
		 s.setId(id);
		 s.setName(name);
		 s.setStream(stream);
		 s.setFees(fees);
		 
		 et.begin();
		 em.persist(s);
		 et.commit();
		 
		 RequestDispatcher rd=req.getRequestDispatcher("main.html");
			rd.include(req, resp);
			resp.setContentType("text/html");
		 
		 
	}
	

}
