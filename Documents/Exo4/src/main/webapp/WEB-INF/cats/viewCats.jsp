<%@ page import="com.example.exercice03.models.Cat" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 07/09/2023
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Liste des Chats</title>
</head>
<body>
<h1>Liste des Chats</h1>
<table border="1">
  <tr>
    <th>Nom</th>
    <th>Race</th>
    <th>Repas préféré</th>
    <th>Date de naissance</th>
  </tr>
  <% for (Cat cat : (List<Cat>) request.getAttribute("cats")) { %>
  <tr>
    <td><%= cat.getName() %></td>
    <td><%= cat.getBreed() %></td>
    <td><%= cat.getFavMeal() %></td>
    <td><%= cat.getDateOfBirth() %></td>
  </tr>
  <% } %>
</table>
<br>
<a href="<%= request.getContextPath() %>/cats/add">Ajouter un nouveau chat</a>
</body>
</html>
