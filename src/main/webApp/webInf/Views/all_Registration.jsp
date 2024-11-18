<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="Menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Registration</title>
</head>
<body>
	<h2>All Registrations</h2>
	<table>
       <tr>
       <th>name</th>
       <th>course</th>
       <th>email</th>
       <th>mobile</th>
      </tr>
      
      <%
      ResultSet result =(ResultSet)request.getAttribute("result");
      while(result.next()){
      %>
      <tr>
       <td><%=result.getString(1)%></td>
       <td><%=result.getString(2)%></td>
       <td><%=result.getString(3)%></td>
       <td><%=result.getString(4)%></td>
      </tr>
      
      
      
      <%} %>
	</table>

</body>
</html>
