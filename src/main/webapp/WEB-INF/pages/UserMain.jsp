<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Main page</title>
</head>
 
<body>
<h2>WELCOME <s:property value="mail" /></h2>
<s:form action="deleteuser" method="post" namespace="/">
  <s:submit method="execute" key="Delete User" value="DeleteUser" />
</s:form>
<s:form action="search" method="post" namespace="/">
  <s:submit method="execute" key="Search" value="Search" />
</s:form>
<s:form action="addBestFriend" method="post" namespace="/">
	<s:textfield name="friendToAdd" key="friendToAdd"  size="50" value="luca" />
  <s:submit method="execute" key="Add Best Friend" value="AddBestFriend" />
</s:form>
<s:form action="loginpage" method="post" namespace="/">
  <s:submit method="execute" key="Login Page" value="TakeMeToLoginPage" />
</s:form>
</body>
</html>