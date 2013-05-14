<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head> 


<body>
Bem vindo ${username}, <br />
<br />
Segue sua lista de amigos <br />
<c:forEach items="${listaAmigos}" var="amigo">
  Entre em contato com ${amigo} <br />
</c:forEach>
</body>
</html>