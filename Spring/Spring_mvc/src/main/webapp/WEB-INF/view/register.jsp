<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form:form modelAttribute="user" method="post" action="register">


<form:label path="id"> User id</form:label>
<form:input path="id"/>
<br>
<form:label path="name"> User name</form:label>
<form:input path="name"/>
<br>
<form:label path="email"> Email</form:label>
<form:input path="email"/>
<br>
<form:label path="phoneno"> Phone number</form:label>
<form:input path="phoneno"/>
<br>
<form:label path="age"> Age</form:label>
<form:input path="age"/>
<br>
<form:label path="password"> Password</form:label>
<form:password path="password"/>
<br>
<form:label path="gender"> User id</form:label>
male<form:radiobutton path="gender" value="male"/>
female<form:radiobutton path="gender" value="female"/>
<br>
<form:button>Register</form:button>






</form:form>



</body>
</html>