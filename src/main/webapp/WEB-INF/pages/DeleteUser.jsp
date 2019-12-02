<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Delete user page</title>
</head>
 
<body>
<h2>WELCOME <s:property value="mail" /></h2>
<s:property escape="false" value="list" />

<s:form action="mainpage" method="post" namespace="/">
  <s:submit method="execute" key="Main Page" value="TakeMeToMainPage" />
</s:form>
</body>
</html>