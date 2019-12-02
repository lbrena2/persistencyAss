<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Registration page</title>
</head>
 
<body>
<h2>Registration</h2>
<s:actionerror />
<s:form action="register" method="post" namespace="/">
  <s:textfield name="mail" key="Mail" size="50" value="marioGalli@gmail.com" />
  <s:textfield name="name" key="Name" size="50" value="Mario" />
  <s:textfield name="surname" key="Surname" size="50" value="Galli" />
  <s:password name="password" key="Password" size="50" showPassword="true" value="premium" />
  <s:password name="repeatpassword" key="Repeat Password" size="50" showPassword="true" value="premium" />
  <s:textfield name="streetAdress" key="StreetAdress" size="50" value="via degli orti 31" />
  <s:textfield name="city" key="City" size="50" value="Bergamo" />
  <s:textfield name="state" key="State" size="50" value="Italia" />
  
  <s:submit method="execute" key="Register" value="Register" />
</s:form>

<s:form action="loginpage" method="post" namespace="/">
  <s:submit method="execute" key="Login Page" value="TakeMeToLoginPage" />
</s:form>
<h2>Look for someone?</h2>
<s:form action="searchBy" method="post" namespace="/">
  <s:textfield name="searchByName" key="searchByName" size="50" value="Mario" />
  <s:submit method="execute" key="searchByName" value="searchByName" />
</s:form>
<s:form action="searchBy" method="post" namespace="/">
  <s:textfield name="searchByAddress" key="searchByAddress" size="50" value="via degli orti 31" />
  <s:submit method="execute" key="searchByAddress" value="searchByAddress" />
</s:form>
<s:form action="searchBy" method="post" namespace="/">
  <s:textfield name="searchByBestFriend" key="searchByBestFriend" size="50" value="Luca" />
  <s:submit method="execute" key="searchByBestFriend" value="searchByBestFriend" />
</s:form>
</body>
</html>