<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login page</title>
</head>
 
<body>
<h2>Login</h2>
<s:actionerror />
<s:form action="login" method="post" namespace="/">
  <s:textfield name="mail" key="Mail" size="50" value="marioGalli@gmail.com" />
  <s:password name="password" key="Password" size="50" showPassword="true" value="premium" />
  <s:submit method="execute" key="Login" value="LogIn" />
</s:form>

<s:form action="registrationpage" method="post" namespace="/">
  <s:submit method="execute" key="Register Page" value="TakeMeToRegistration" />
</s:form>

</body>
</html>