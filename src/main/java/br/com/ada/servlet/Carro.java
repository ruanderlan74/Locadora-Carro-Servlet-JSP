package br.com.ada.servlet;

import br.com.ada.persistence.CarroRepository;
import br.com.ada.persistence.ClienteRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/carro")
public class Carro extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("carros", CarroRepository.getInstance().listarTodos());
        RequestDispatcher rd = request.getRequestDispatcher("/carro.jsp");
        rd.forward(request, response);
    }
}
