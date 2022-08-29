<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='s' uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Form</title>
</head>
<body>
<s:form action="tutorials/getTutorial">
	<s:textfield label="Enter the Language" key="language" />
	<s:submit />
</s:form>
</body>
</html>