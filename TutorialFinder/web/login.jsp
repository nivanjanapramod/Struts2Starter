<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='s' uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="login">
	<s:textfield label="Login ID" key="userId" />
	<s:password label="Password" key="password" />
	<s:submit />
</s:form>
</body>
</html>