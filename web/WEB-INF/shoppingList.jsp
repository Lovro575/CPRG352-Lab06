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
         <p>Hello, ${sessionUsername} <a href="ShoppingList?action=logout">Logout</a></p>
        <form method="POST" action="">
            <h4>List</h4>
            <label>Add item:</label>
            <input type="text" name="items" value=""><input type="submit" value="Add Item"> 
            <input type="hidden" name="action" value="Add">
        </form>
            
        <form method="POST" action="">
            <ul>
                <li><input type="radio" name="pickItem" value="${itemsList}">${itemsList}</li>
            </ul>

            <input type="submit" name="delete" value="Delete">
            <input type="hidden" name="action" value="delete">
        </form>
    </body>
</html>
