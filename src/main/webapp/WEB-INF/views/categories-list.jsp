<%--
  Created by IntelliJ IDEA.
  User: maakaa
  Date: 01.05.19
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Categories</title>
</head>
<body>
<div class="container">
    <h2>Categories:</h2>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Description</th>
            <th scope="col">Show articles</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <c:forEach items="${categories}" var="category">
            <tr>
                <td>${category.id}</td>
                <td>${category.name}</td>
                <td>${category.description}</td>
                <td><a href="/categories/${category.id}">Show articles</a> </td>
                <td><a href="edit/${category.id}">Edit</a> <a href="delete/${category.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <a href="<c:url value="add"/>">Add Category</a><br>
    <a href="<c:url value="http://localhost:8080/"/>">Home</a><br>
</div>
</body>
</html>
