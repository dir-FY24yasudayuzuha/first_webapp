<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="ISO-8859-1">
        <title>kuku</title>
    </head>
    <body>
        <% for (int i = 1; i < 10; i++){ %>
            <% for(int j = 1; j < 10; j++){ %>
                 <% int result = i * j; %>
                 <p><%= i%> × <%= j%> = <%= result %></p>
            <% } %>
        <% } %>
    </body>
</html>