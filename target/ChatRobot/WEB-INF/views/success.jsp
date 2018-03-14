<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
    <title>test</title>
</head>
<body>
    登录名：${requestScope.user.username}<br>
    生日：<fmt:formatDate value="${requestScope.user.birthday}" pattern="yyyy年MM月dd日"/><br>
</body>
</html>