package andreFernande;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/clienteServlet")
public class ClienteServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		int id = 0;
		String nome = req.getParameter("nome");
		String sexo = req.getParameter("sexo");
		String email= req.getParameter("email");
		String cpf = req.getParameter("cpf");
		String rg = req.getParameter("rg");
		id++;
		
		Cliente cliente = new Cliente(id,nome, sexo, email, cpf, rg);

		req.setAttribute("cliente", cliente);
		
		RequestDispatcher dispatcher =  req.getRequestDispatcher("ViewCliente.jsp");
		dispatcher.forward(req, resp);
	
	
	}
}
