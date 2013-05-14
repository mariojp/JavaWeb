package br.com.parallel.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
		if (login.equals("admin") && senha.equals("admin")) {
			HttpSession s = request.getSession();
			s.setAttribute("username", login);
			List<String> listaAmigos = new ArrayList<String>();
			listaAmigos.add("Joao");
			listaAmigos.add("Jose");
			s.setAttribute("listaAmigos", listaAmigos);
			request.getRequestDispatcher("./bemvindo.jsp").forward(request,response);
			//Versão sem JSTL e EL
			//request.getRequestDispatcher("./bemvindoscriptlet.jsp").forward(request,response);
		} else {
			System.out.println("Login inválido");
		}
	}

}
