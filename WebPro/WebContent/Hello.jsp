<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<body>
<fmt:setLocale value="${param.loc}"/>
<fmt:setBundle basename="labels"/>
	<h1><fmt:message key="greeting"/></h1>
	<h2><fmt:message key="welcome"/></h2>
	<h2><fmt:message key="date"/><%= LocalDate.now()%></h2>
    <%! int visitor=12001; %>
	
	<h2><fmt:message key="count"/><%=visitor++ %> </h2>
	<hr>
	<a href="Hello.jsp?loc=en">English</a> | <a href="Hello.jsp?loc=hi">Hindi</a>| <a href="Hello.jsp?loc=fr">French</a>| <a href="Hello.jsp?loc=es">Spanish</a>
</body>
</html>