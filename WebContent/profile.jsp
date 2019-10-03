<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true" import="com.Controller.User"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sucessful login</title>
</head>
<body>
	<%-- <%@include file="users.jsp" %> --%>
	<h2>Welcome <%User user=(User)session.getAttribute("user"); %> 
	<%=user.getUserid() %>
	</h2> 
</body>
</html>