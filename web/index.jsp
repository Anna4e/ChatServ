<%--
  Created by IntelliJ IDEA.
  User: Anna
  Date: 27.01.2017
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
      </head>
  <body>
  <%
    String login = (String)session.getAttribute("user_login");
  %>

  <%
    if (login == null || "".equals(login)) {
  %>

  <form action="/login" method="POST">
    Login: <input type="text" name="login"><br>
    <input type="submit" />
  </form>

  <%
  } else {
  %>

  <h1>You are logged in as: <%= login %></h1>
  <br>Click this link to <a href="/login?a=exit">logout</a>

  <%
    }
  %>

  </body>
</html>
