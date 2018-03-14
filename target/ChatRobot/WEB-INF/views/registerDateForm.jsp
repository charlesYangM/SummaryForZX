<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/7
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="registerDate" method="post">
    <table>
        <tr>
            <td><label>登录名： </label></td>
            <td><input type="text" id="username" name="username"></td>
        </tr>
        <tr>
            <td><label>生日：</label></td>
            <td><input type="text" id="birthday" name="birthday"></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>
