package br.com.ada.servlet;

import br.com.ada.model.Cliente;
import br.com.ada.persistence.ClienteRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cliente-cadastra")
public class CadastraCliente extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("cadastroCliente.jsp");
        rd.forward(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String documento = req.getParameter("documento");
        if (nome.equals("") || documento.equals("")) {
            resp.getWriter().print("Algum dado obrigatório não foi preenchido");
        }else{
            Cliente cliente = new Cliente(nome,documento);
            ClienteRepository.getInstance().salvar(cliente);
            req.setAttribute("nome", nome);
            req.setAttribute("documento", documento);
            RequestDispatcher rd = req.getRequestDispatcher("resumoCliente.jsp");
            rd.forward(req, resp);
        }
    }
}
