package SchoolMnagment;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servletlogin extends HttpServlet

{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("chavan");
	 EntityManager em=emf.createEntityManager();
	 EntityTransaction et=em.getTransaction();
	 
	 Principal p=new Principal();
	 
	
}
}
