<%--
  Created by IntelliJ IDEA.
  User: maakaa
  Date: 27.04.19
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Home</title>
</head>
<body>
    <div class="container">
        <h2>Latest articles:</h2>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Title</th>
                <th scope="col">Author</th>
                <th scope="col">Content</th>
                <th scope="col">Created</th>
                <th scope="col">Updated</th>
                <th scope="col">Categories</th>
            </tr>
            </thead>
            <c:forEach items="${latestArticles}" var="latestArticle">
                <tr>
                    <td>${latestArticle.id}</td>
                    <td>${latestArticle.title}</td>
                    <td>${latestArticle.author.firstName} ${latestArticle.author.lastName}</td>
                    <td><c:set var="content" value="${latestArticle.content}"/>
                        ${fn:substring(content, 0, 200)}</td>
                    <td>${latestArticle.created}</td>
                    <td>${latestArticle.updated}</td>
                    <td>${latestArticle.categories}</td>
                </tr>
            </c:forEach>
        </table>
        <h2>Categories:</h2>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
                <th scope="col">Description</th>
                <th scope="col">Show articles</th>
            </tr>
            </thead>
            <c:forEach items="${categories}" var="category">
                <tr>
                    <td>${category.id}</td>
                    <td>${category.name}</td>
                    <td>${category.description}</td>
                    <td><a href="/categories/${category.id}">Show articles</a> </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
