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
<fmt:setBundle basename="labels"/>
	<h1><fmt:message key="greeting"/></h1>
	<h2><fmt:message key="welcome"/></h2>
	<h2><fmt:message key="date"/><%= LocalDate.now()%></h2>
    <%! int visitor=12001; %>
	
	<h2><fmt:message key="count"/><%=visitor++ %> </h2>
</body>
</html>