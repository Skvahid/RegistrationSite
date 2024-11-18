<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
<h2>Register Here...</h2>

<form action="createregistration" method="post">
<pre>
     Name: <input type="text" name="name"/>
    Course: <input type="text" name="course"/>
    Email: <input type="text" name="email"/>
     Mobile: <input type="text" name="mobile"/>
     <input type="submit" value="save"/>
     </pre>
</form>
<%
if(request.getAttribute("msg")!=null){
	out.println(request.getAttribute("msg"));
}

%>

</body>
</html>
