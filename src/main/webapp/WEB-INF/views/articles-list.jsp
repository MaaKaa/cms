<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Articles</title>
</head>
<body>
<div class="container">
    <h2>Articles:</h2>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Title</th>
            <th scope="col">Content</th>
            <th scope="col">Created</th>
            <th scope="col">Updated</th>
            <th scope="col">Author(s)</th>
            <th scope="col">Categories</th>
            <th scope="col">Actions</th>
        </tr>
        </thead>
        <c:forEach items="${articles}" var="article">
            <tr>
                <td>${article.id}</td>
                <td>${article.title}</td>
                <td>${article.content}</td>
                <td>${article.created}</td>
                <td>${article.updated}</td>
                <td>${article.author}</td>
                <td>${article.categories}</td>
                <td><a href="edit/${article.id}">Edit</a> <a href="delete/${article.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <a href="<c:url value="add"/>">Add Article</a><br>
    <a href="<c:url value="http://localhost:8080/"/>">Home</a><br>
</div>
</body>
</html>
