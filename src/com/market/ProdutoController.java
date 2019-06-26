package com.market;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.market.dao.ProdutoDAO;
import com.market.dao.ProdutoDAOImpl;
/**
 * Servlet implementation class ProdutoControler
 */
@WebServlet("/produto")
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProdutoController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProdutoDAO produtoDao = new ProdutoDAOImpl();
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		if(id == null || id.isEmpty()) {
			id = "0";
		}
		String cmd = request.getParameter("cmd");
		int idInt = Integer.parseInt(id);
		Float preco = Float.parseFloat(request.getParameter("preco")); 
		String nome = request.getParameter("nome");
		Float peso = Float.parseFloat(request.getParameter("peso"));
		
		Produto prod = new Produto();
		prod.setId(idInt);
		prod.setPreco(preco);
		prod.setNome(nome);
		prod.setPeso(peso);
		
		if("Adicionar".equals(cmd)) {
			produtoDao.adicionar(prod);
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
