<%@ page import="models.Personne" %>
<%@ page import="com.example.exercice01.ServletPersonnes" %>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: Administrateur--%>
<%--  Date: 06/09/2023--%>
<%--  Time: 15:44--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<jsp:useBean id="Personnes" type="java.util.List<models.Personne>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" %>
<%--<jsp:useBean id="personnes" type="java.util.List<com.example.exercice01.ServletPersonnes>" scope="request" />--%>

<%--<jsp:useBean id="Personnes" type="java.util.List" scope="request" />--%>


<html>
<head>
    <%@ include file="bootstrapImports.html"%>
    <title>Liste des personnes</title>
</head>
<body>
<h1>Liste des prenoms</h1>

<%--<table class="table">--%>
<%--    <thead>--%>
<%--    <tr>--%>
<%--        <% for (Personne pre : personnes) { %>--%>
<%--        <th scope="col"><%= pre %></th>--%>
<%--        <% } %>--%>
<%--    </tr>--%>
<%--    </thead>--%>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">Nom</th>
            <th scope="col">Prénom</th>
            <th scope="col">Âge</th>
        </tr>
        </thead>
        <tbody>
        <% for (Personne pre : Personnes) { %>
        <tr>
            <td><%= pre.getLastname() %></td>
            <td><%= pre.getFirstname() %></td>
            <td><%= pre.getYears() %></td>
        </tr>
        <% } %>
        </tbody>
    </table>
</body>
</html>
