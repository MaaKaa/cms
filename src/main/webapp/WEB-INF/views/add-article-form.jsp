<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add new Article</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2>Add new Article:</h2>
    <form:form method="post" modelAttribute="article">
        <form:input type="hidden" name="id" path="id"/>

        Title:
        <form:input path="title"/><br>
        <form:errors path="title" cssClass="text-danger"/><br>

        Content:
        <form:textarea path="content" /><br>
        <form:errors path="content" cssClass="text-danger"/><br>

        Choose author:
        <form:select path="author.id">
            <form:options items="${authors}" itemLabel="lastName" itemValue="id"/>
        </form:select><br>

        <!-- pole z możliwością wyboru wielu kategorii. Nie działa: po zaznaczeniu checkboxa artykuł nie zapisuje się w bazie. -->
        Choose category:
        <form:checkboxes path="categories" items="${categories}" itemLabel="name" itemValue="id"/>

        <input type="submit" value="save"><br>
    </form:form>

    <a href="<c:url value="all"/>">Show all articles</a><br>
    <a href="<c:url value="http://localhost:8080/"/>">Home</a><br>
</div>

</body>
</html>
