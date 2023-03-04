package br.com.ada.servlet;

import br.com.ada.model.Carro;
import br.com.ada.persistence.CarroRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/carro-cadastra")
public class CadastraCarro extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("cadastroCarro.jsp");
        rd.forward(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String placa = req.getParameter("placa");
        String nome = req.getParameter("nome");
        String tipo = req.getParameter("tipo");
        Carro carro = new Carro(placa, nome, tipo);
        if (nome.equals("") || placa.equals("")||tipo.equals("")) {
            resp.getWriter().print("Algum dado obrigatório não foi preenchido");
        }else {
            CarroRepository.getInstance().salvar(carro);
            req.setAttribute("placa", nome);
            req.setAttribute("nome", nome);
            req.setAttribute("tipo", tipo);
            RequestDispatcher rd = req.getRequestDispatcher("resumoCarro.jsp");
            rd.forward(req, resp);
        }
    }
}
