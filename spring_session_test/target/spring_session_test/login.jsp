<%--
  Created by IntelliJ IDEA.
  User: linyo_000
  Date: 2017/2/16
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
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
