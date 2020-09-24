<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 23, 2020, 2:22:36 PM
    Author     : 759175
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label>First: </label><input type="text" name="firstValue" value="${first}"><br>
            <label>Second: </label><input type="text" name="secondValue" value="${second}"><br>
            <input type="submit" name="+" value="+">
            <input type="submit" name="-" value="-">
            <input type="submit" name="*" value="*">
            <input type="submit" name="%" value="%">
            <p>Result: ${result}</p>
            <a href="age">Age Calculator</a>
        </form>
    </body>
</html>
