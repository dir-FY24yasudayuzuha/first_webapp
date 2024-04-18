<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% request.getSession().removeAttribute("username"); %>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <h1>ログアウト</h1>
        <p><a href="session_b.jsp">前のページ</a></p>
        <p><a href="session_a.jsp">最初のページ</a></p>
    </body>
</html>