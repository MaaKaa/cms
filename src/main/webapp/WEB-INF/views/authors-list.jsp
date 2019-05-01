
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Authors</title>
</head>
<body>
<div class="container">
    <h2>Authors:</h2>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">First Name</th>
            <th scope="col">Last Name</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <c:forEach items="${authors}" var="author">
            <tr>
                <td>${author.id}</td>
                <td>${author.firstName}</td>
                <td>${author.lastName}</td>
                <td><a href="edit/${author.id}">Edit</a> <a href="delete/${author.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
