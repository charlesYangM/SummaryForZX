<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/3/003
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        Spittr
    </title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="resources/style.css"/> "/>
</head>
<body>
    <h1>Welcome to Spittr</h1>

    <a href="<c:url value="/spittles"/> "> Spittles</a>
    <a href="<c:url value="/spitter/register"/> "> Register</a>

</body>
</html>
