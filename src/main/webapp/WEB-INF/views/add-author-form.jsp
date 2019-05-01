<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add new Author</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2>Add new Author:</h2>
    <form:form method="post" modelAttribute="author">
        <form:input type="hidden" name="id" path="id"/>

        First Name:
        <form:input path="firstName"/><br>
        <form:errors path="firstName" cssClass="text-danger"/><br>

        Last name:
        <form:input path="lastName" /><br>
        <form:errors path="lastName" cssClass="text-danger"/><br>

        <input type="submit" value="Save"><br>
    </form:form>

    <a href="<c:url value="all"/>">Show all Authors</a><br>
    <a href="<c:url value="http://localhost:8080/"/>">Home</a><br>
</div>

</body>
</html>
