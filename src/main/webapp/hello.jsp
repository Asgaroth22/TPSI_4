<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
    </head>
    <body>
        Wersja jsp:<br>
        <h1>Cześć, ${person.firstName} ${person.lastName}!</h1><br>
        <a href="mailto:${person.emailAddress}">Wyślij do mnie email!</a><br>
        <br>
        Wersja jstl:<br>
        <h1>Cześć, <c:out value="${person.firstName} ${person.lastName}"/>!</h1><br>
        <a href="mailto:<c:out value="${person.emailAddress}"/>">Wyślij do mnie email!</a><br>
        <br>
        <!-- 
            jeśli napiszemy w formularzu <span style='color: pink'>Piotr</span> albo inny poprawny kod html, 
            to jsp traktuje to jako wykonywalny kod html, a jstl jako surowy tekst 
        -->
        <c:forEach items="${dniTygodnia}" var="dzien">
            <p>
                ${dzien}
            </p>
        </c:forEach>

    </body>
</html>