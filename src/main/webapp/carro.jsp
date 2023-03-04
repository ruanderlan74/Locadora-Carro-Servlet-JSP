<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="br.com.ada.model.Carro"%>
<meta http-equiv="Content-Type" content="text/html" charset=UTF-8>
<html>
<head>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
    <div class="container-md">
            <p class="text-center fs-1">Carros</p>

        <%-- Verifica se a lista está vazia --%>

            <% List<Carro> carros = (List<Carro>) request.getAttribute("carros");%>

           <% if(carros == null || carros.isEmpty()) { %>
               <p>A lista está vazia.</p>
           <% } else {%>
           <% for(Carro carro : carros) { %>
               <p><%= carro.toString() %></p>
           <% } %>
           <% } %>
          <a href="http://localhost:8080/programacao-web-I-ee/carro-cadastra">  <button type="button" class="btn btn-primary">cadastrar</button></a>
           <a href="http://localhost:8080/programacao-web-I-ee/">  <button type="button" class="btn btn-primary">incio</button></a>

     </div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>