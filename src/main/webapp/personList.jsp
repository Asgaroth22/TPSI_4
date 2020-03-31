<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
    </head>
    <body>
        Lista osób:<br>
        <table border="1">
        <tr>
            <th>Imię</th><th>Nazwisko</th><th>Email</th>
        </tr>
        <c:forEach items="${persons}" var="person">
            <tr><td>${person.firstName}</td><td>${person.lastName}</td><td>${person.emailAddress}</td></tr>
        </c:forEach>
       </table>
    </body>
</html>