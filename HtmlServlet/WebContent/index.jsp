<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Alo Mundo com JSP
  Faça parte de nossa newsletter:
  <form action="IndexServlet" method="post">
    <input type="text" name="email" />
    <input type="submit" name="Cadastrar-se" />
</form>
<%= request.getAttribute("texto") == null ? "" : request.getAttribute("texto") %>
</body>
</html>