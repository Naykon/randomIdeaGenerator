<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSTL Demo</title>
</head>
<body>
<div>
I'm bored. Give me
<form action="/" method="post">
    <input type="number" name="num" /> random ideas.
    <br/>
    <p><input type="submit" value="Go!"></p>
</form>
</div>

<div id="main-content">
    <c:if test="${not empty warning}">
        <p><c:out value="${warning}" /></p>
    </c:if>

    <c:if test="${not empty error}">
        <p><c:out value="${error}" /></p>
    </c:if>

    <c:if test="${not empty ideas}">
        <p>Here are your ideas:</p>
        <ul>
    <c:forEach var="idea" items="${ideas}">
        <li>
        <c:out value="${idea}" />
        </li>
    </c:forEach>
        </ul>
    </c:if>
</div>
</body>
</html>