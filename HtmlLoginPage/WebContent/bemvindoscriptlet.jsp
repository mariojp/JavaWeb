<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head> 


<body>
Bem vindo <%=request.getSession().getAttribute("username") %>, <br />
<br />
Segue sua lista de amigos <br />
<%
List<String> listaAmigos = (List<String>) request.getSession().getAttribute("listaAmigos");
for(String amigo : listaAmigos){%>
	Entre em contato com <%=amigo%><br />
<%}
%>
</body>
</html>