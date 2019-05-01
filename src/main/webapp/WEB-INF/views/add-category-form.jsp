
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add new Category</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2>Add new Category:</h2>
    <form:form method="post" modelAttribute="category">
        <form:input type="hidden" name="id" path="id"/>

        Name:
        <form:input path="name"/><br>
        <form:errors path="name" cssClass="text-danger"/><br>

        Description:
        <form:input path="description" /><br>
        <form:errors path="description" cssClass="text-danger"/><br>

        <input type="submit" value="save"><br>
    </form:form>

    <a href="<c:url value="all"/>">Show all Categories</a><br>
    <a href="<c:url value="http://localhost:8080/"/>">Home</a><br>
</div>

</body>
</html>
