package br.com.parallel.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

		request.setAttribute("atributo", 1);
		HttpSession s = request.getSession();
		s.setAttribute("session-atributo", 2);
		
		/**
		 * Forward
		 * Resultado:
		 * atributo=1
		 * session-atributo=2
		 * parametro=3
		 * 
		 */
		//request.getRequestDispatcher("./target.jsp?parametro=3").forward(request, response);
		/**
		 * Redirect
		 * Resultado:
		 * atributo=null
		 * session-atributo=2
		 * parametro=3
		 * 
		 */
		response.sendRedirect("./target.jsp?parametro=3");

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
