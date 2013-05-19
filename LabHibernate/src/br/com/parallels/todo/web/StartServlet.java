package br.com.parallels.todo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hsqldb.server.Server;

import br.com.parallels.todo.model.Usuario;
import br.com.parallels.todo.util.HibernateUtil;

/**
 * Servlet implementation class HSQLDBStart
 */
@WebServlet(urlPatterns={"/StartServlet"}, loadOnStartup=1)
public class StartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	Server server;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StartServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
        Session session = HibernateUtil.getSessionfactory().getCurrentSession(); 
        Transaction transaction = session.beginTransaction();
        Usuario u = new Usuario();
        u.setNome("admin");
        u.setSenha("senha");
        u.setEmail("admin@email.com");
        session.save(u);
        
        Usuario u2 = new Usuario();
        u2.setNome("Jose");
        u2.setSenha("senha");
        u2.setEmail("jose@email.com");
        session.save(u2);
        
        transaction.commit();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
