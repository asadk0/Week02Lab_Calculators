<%-- 
    Document   : agecalculator
    Created on : Sep 23, 2020, 2:08:47 PM
    Author     : 759175
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <!--Adding path here will mess things up i.e don't do /age-->
        <form action="age" method="post">
            <label>Enter your age: </label><input type="text" name="inputAge"><br>
            <input type="submit" value="Age next birthday">
        <p>${ageAttribute}</p>
        <!--Adding / path here will mess things up again i.e don't do /arithmetic-->
        <a href="arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
