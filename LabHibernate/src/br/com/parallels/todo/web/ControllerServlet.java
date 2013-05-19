package br.com.parallels.todo.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.parallels.todo.model.Usuario;
import br.com.parallels.todo.util.HibernateUtil;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		System.out.println("Recebido [" + login + "/" + senha + "]");
        
        Session session = HibernateUtil.getSessionfactory().getCurrentSession(); 
        Transaction transaction = session.beginTransaction();
        // HQL
        String queryString = "select u from Usuario u where u.nome = :nome and u.senha = :senha";
        Usuario usr = (Usuario) session.createQuery( queryString ).setParameter( "nome", login ).setParameter("senha", senha).uniqueResult();

        List<Usuario> listaAmigos = session.createQuery("from Usuario").list();
        
        
		if (usr!=null && usr.getNome() !=null ) {
			HttpSession s = request.getSession();
			s.setAttribute("username", login);
			s.setAttribute("listaAmigos", listaAmigos);
			request.getRequestDispatcher("./bemvindo.jsp").forward(request,response);
			//Versão sem JSTL e EL
			//request.getRequestDispatcher("./bemvindoscriptlet.jsp").forward(request,response);
		} else {
			System.out.println("Login inválido");
		}
        transaction.commit();

	}

}
