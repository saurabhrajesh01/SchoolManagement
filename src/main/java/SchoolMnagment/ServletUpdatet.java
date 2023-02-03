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
@WebServlet("/WEB")
public class ServletUpdatet extends HttpServlet

{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		int id= Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		Long sal=Long.parseLong(req.getParameter("sal"));
		String subject=req.getParameter("subject");
		
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("chavan");
		 EntityManager em=emf.createEntityManager();
		 EntityTransaction et=em.getTransaction();
		 
		 Teacher t= new Teacher();
		 t.setId(id);
		 t.setName(name);
		 t.setSal(sal);
		 t.setSubject(subject);
		 
		 et.begin();
		 em.merge(t);
		 et.commit();
		 
		 RequestDispatcher rd=req.getRequestDispatcher("main.html");
			rd.include(req, resp);
			resp.setContentType("text/html");
	}

}
