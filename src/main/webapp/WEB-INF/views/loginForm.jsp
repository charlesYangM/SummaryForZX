<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/7
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/json2.js"></script>
<script type="text/javascript">
    $(document).ready(function () {

        $("#login").click(function () {
            $.ajax("${pageContext.request.contextPath}/user/login",
                    {
                        dataType: "json",
                        type: "post",
                        contentType: "application/json",
                        data: JSON.stringify({username: $("#username").val(), password: $("#password").val()}),
                        async: true,
                        success: function (data) {

                            $("#isLogin").html(data.data.username + " , " + data.data.stateInfo)
                            $("#edit_button").show(200);
                        },
                        error: function () {
                            alert("数据发送失败")
                        }
                    });
        });
    });
</script>
<body>
<span><label id="isLogin"></label> </span>
<table>
    <tr>
        <td><label>登录名：</label></td>
        <td><input type="text" id="username" name="username"></td>
    </tr>
    <tr>
        <td><label>密码：</label></td>
        <td><input type="password" id="password" name="password"></td>
    </tr>
    <tr>
        <td><button type="button" id="login">登录</button></td>
        <td><a href="${pageContext.request.contextPath}/user/register">
            <button>转去注册</button>
        </a></td>
    </tr>

    <tr id="edit_button" style="display:none;">
        <td><a href="${pageContext.request.contextPath}/user/edit_summay">
            <button>编写总结</button>
        </a></td>
    </tr>
</table>
</body>
</html>
