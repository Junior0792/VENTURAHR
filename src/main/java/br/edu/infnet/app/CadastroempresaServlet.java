package br.edu.infnet.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
 
@WebServlet(name = "CadastroempresaServlet", urlPatterns = {"/CadastroempresaServlet"})
public class CadastroempresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CadastroempresaServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
	        try {
	            out.println("<!DOCTYPE html>");
	            out.println("<html>");
	            out.println("<head>");
	            out.println("<title>Cadastro</title>");
	            out.println("</head>");
	            out.println("<body>");
	            out.println("<h1>Cadastro de Empresa</h1>");
	            out.println("</body>");
	            out.println("</html>");

	            String nome = request.getParameter("nome");
	            String email = request.getParameter("email");
	            String endereco = request.getParameter("endereco");
	            String telefone = request.getParameter("telefone");
	            String razao = request.getParameter("razao");
	            String cnpj = request.getParameter("cnpj");

	            ArrayList<String> erros = new ArrayList<>();

	            if(StringUtils.isBlank(nome)) {

	                erros.add("O campo Nome � obrigat�rio");
	            }
	            if(StringUtils.isBlank(email)) {

	                erros.add("O campo Email � obrigat�rio");
	            }
	            if (StringUtils.isBlank(endereco)) {

	                erros.add("O campo endere�o � obrigat�rio");
	            }
	            if (StringUtils.isBlank(telefone)) {

	                erros.add("O campo telefone � obrigatorio");
	            }
	            
	            if(StringUtils.isNotBlank(telefone) && !StringUtils.isNumeric(telefone)) {
	            	
	            	erros.add("O campo telefone s� deve ter n�meros");
	            }
	            if (StringUtils.isBlank(razao)) {

	                erros.add("O campo raza� � obrigatorio");
	            }

	            if (StringUtils.isBlank(cnpj)) {

	                erros.add("O campo cnpj � obrigatorio");
	            }
	            if(StringUtils.isNotBlank(cnpj) && !StringUtils.isNumeric(cnpj)) {
	            	
	            	erros.add("O campo cnpj s� deve ter n�meros");
	            }

	            if (erros.isEmpty()) {
	                
	                out.println("<h3 style= 'color:gray' >O Contato " + nome + " foi cadastrado com Sucesso</h3>");
	                
	            } else {

	                out.println("<h3 style='color: red'>Existem erros a serem tratados:</h3>");

	                for (String erro : erros) {

	                    out.println("<h3 style='color: red'>" + erro + "</h3>");
	                }
	            }

	        } finally {
	            out.close();
	        
	    }
    

	}

}
