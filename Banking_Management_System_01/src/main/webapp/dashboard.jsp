<%@ page contentType="text/html;charset=UTF-8" %>

<%
String username =
(String)session.getAttribute("username");

if(username==null){
response.sendRedirect("login.jsp");
return;
}
%>

<!DOCTYPE html>
<html>

<head>

<title>Dashboard</title>

</head>

<body>

<h2>Welcome <%= username %></h2>

<a href="logout">
Logout
</a>

</body>

</html>