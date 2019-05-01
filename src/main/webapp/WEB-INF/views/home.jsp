<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Home</title>
</head>
<body>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light shadow fixed-top">
        <div class="container">
            <a class="navbar-brand" href="#">My Books</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                    aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="articles/all">Articles</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="authors/all">Authors</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="categories/all">Categories</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Full Page Image Header with Vertically Centered Content -->
    <header class="masthead">
        <div class="container h-10">
            <div class="row h-50 align-items-center">
                <div class="col-12 text-center">
                    <h1 class="font-weight-light">CMS</h1>
                    <p class="lead">Manage your content</p>
                </div>
            </div>
        </div>
    </header>

    <div class="container">
        <h2>Latest articles:</h2>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Title</th>
                <th scope="col">Content</th>
                <th scope="col">Created</th>
                <th scope="col">Updated</th>
                <th scope="col">Author</th>
                <th scope="col">Categories</th>
            </tr>
            </thead>
            <c:forEach items="${latestArticles}" var="latestArticle">
                <tr>
                    <td>${latestArticle.id}</td>
                    <td>${latestArticle.title}</td>
                    <td><c:set var="content" value="${latestArticle.content}"/>
                        ${fn:substring(content, 0, 200)}</td>
                    <td>${latestArticle.created}</td>
                    <td>${latestArticle.updated}</td>
                    <td>${latestArticle.author.firstName} ${latestArticle.author.lastName}</td>
                    <td>${latestArticle.categories}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="<c:url value="articles/add"/>">Add Article</a><br>
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
        <a href="<c:url value="categories/add"/>">Add Category</a><br>
    </div>
</body>
</html>
