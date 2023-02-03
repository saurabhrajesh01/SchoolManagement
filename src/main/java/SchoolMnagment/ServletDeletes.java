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


@WebServlet("/VPAW")
public class ServletDeletes extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id= Integer.parseInt(req.getParameter("id"));
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("chavan");
		 EntityManager em=emf.createEntityManager();
		 EntityTransaction et=em.getTransaction();
		 Student s=em.find(Student.class, id);
		
		 s.setId(id);
		 
		 et.begin();
		 em.remove(s);
		 em.flush();
		 et.commit();
		 
		 RequestDispatcher rd=req.getRequestDispatcher("main.html");
			rd.include(req, resp);
			resp.setContentType("text/html");
		 
		 
		
	}

}
