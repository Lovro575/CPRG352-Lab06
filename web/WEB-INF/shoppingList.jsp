<%-- 
    Document   : shoppingList
    Created on : Oct 21, 2021, 1:01:31 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShoppingList</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <form method="GET" action="ShoppingList">
            <p>Hello, ${usernameAttribute} <a href="ShoppingList">Logout</a></p>
            <h4>List</h4>
            <label>Add item:</label>
            <input type="text" name="item" value="">
            <input type="s">
        </form>
    </body>
</html>
