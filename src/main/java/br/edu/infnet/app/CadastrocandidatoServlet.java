package br.edu.infnet.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

@WebServlet(name = "CadastrocandidatoServlet", urlPatterns = {"/CadastrocandidatoServlet"})
public class CadastrocandidatoServlet extends HttpServlet {

  
	private static final long serialVersionUID = 1L;

	@Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cadastro</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Cadastro de Candidato</h1>");
            out.println("</body>");
            out.println("</html>");

            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            String endereco = request.getParameter("endereco");
            String telefone = request.getParameter("telefone");
            String cpf = request.getParameter("cpf");

            ArrayList<String> erros = new ArrayList<>();

            if(StringUtils.isBlank(nome)) {

                erros.add("O campo Nome é obrigatório");
            }
            if(StringUtils.isBlank(email)) {

                erros.add("O campo Email é obrigatório");
            }
            if (StringUtils.isBlank(endereco)) {

                erros.add("O campo endereço é obrigatório");
            }
            if (StringUtils.isBlank(telefone)) {

                erros.add("O campo telefone é obrigatorio");
            }
            if(StringUtils.isNotBlank(telefone) && !StringUtils.isNumeric(telefone)) {
            	
            	erros.add("O campo telefone só deve ter números");
            }

            if (StringUtils.isBlank(cpf)) {

                erros.add("O campo cpf é obrigatorio");
            }
            if(StringUtils.isNotBlank(cpf) && !StringUtils.isNumeric(cpf)) {
            	
            	erros.add("O campo cpf só deve ter numeros");
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
