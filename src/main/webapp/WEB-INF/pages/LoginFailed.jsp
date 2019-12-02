<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login failed page</title>
<script>
setTimeout(function(){ document.getElementById("loginPage").submit(); }, 3000);
</script>
</head>
 
<body>
<h2>LOGIN FAILED, REDIRECTING...</h2>

<s:form id="loginPage" action="loginpage" method="post" namespace="/">
</s:form>

</body>
</html>