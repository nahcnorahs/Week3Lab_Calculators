<%-- 
    Document   : agecalculator
    Created on : Sep 21, 2022, 1:22:43 PM
    Author     : Sharon
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
         <form method="post" action="age">
             Enter your age: <input type="text" name="age"><br>
             <input type="submit" value="Age next birthday"><br>
        </form>
        <p>${message}</p>
    </body>
</html>
