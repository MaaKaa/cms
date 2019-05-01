<%--
  Created by IntelliJ IDEA.
  User: maakaa
  Date: 29.04.19
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Show articles by category</title>
</head>
<body>
<div class="container">
    <h2>Show articles by category:</h2>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Title</th>
            <th scope="col">Author</th>
            <th scope="col">Content</th>
            <th scope="col">Created</th>
            <th scope="col">Updated</th>
        </thead>
        <c:forEach items="${articlesByCategory}" var="article">
            <tr>
                <td>${article.id}</td>
                <td>${article.title}</td>
                <td>${article.author.firstName} ${article.author.lastName}</td>
                <td>${article.content}</td>
                <td>${article.created}</td>
                <td>${article.updated}</td>
            </tr>
        </c:forEach>
        <a href="<c:url value="all"/>">Show all Categories</a><br>
        <a href="<c:url value="http://localhost:8080/"/>">Home</a><br>
</div>
</body>
</html>
