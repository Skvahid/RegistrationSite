<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h2>Login Here...</h2>
<form action="logincontroller" method="post">
    User Name: <input type="text" name="email"/>
    Password:  <input type="password" name="password"/>
    <input type="submit" name="Login"/>
    
    <%if(request.getAttribute("errormsg")!=null){
    	
    	out.println(request.getAttribute("errormsg"));
    }
    	%>
    

</form>
</body>
</html>
