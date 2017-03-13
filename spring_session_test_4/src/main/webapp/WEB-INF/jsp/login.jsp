<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login.do" method="post">
    帐号 <input type="text" id="username" name="username"/>
    密码 <input type="password" id="password" name="password"/>
    <input type="submit" value="submit"/>
    <input type="reset" value="reset"/>
</form>
</body>
</html>
