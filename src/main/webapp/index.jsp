<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript">
    $(document).ready(function(){

    });
</script>

<%--<script type="text/javascript" src="js/json2.js"></script>--%>
<%--<script type="text/javascript">--%>
    <%--$("#content").click(function(){--%>
        <%--$.ajax("${pageContext.request.contextPath}/json/testRequestBody",--%>
        <%--{--%>
            <%--dataType : "json",--%>
            <%--type : "post",--%>
            <%--contentType : "application/json",--%>
            <%--data : JSON.stringify({id : 1, name : "Spring json test"}),--%>
            <%--async : true,--%>
            <%--success : function(data){--%>
                <%--console.log(data);--%>
                <%--$("#id").html(data.id);--%>
                <%--$("#name").html(data.name);--%>
                <%--$("#author").html(data.author)--%>
            <%--},--%>
            <%--error : function(){--%>
                <%--alter("数据发送失败")--%>
            <%--}--%>

        <%--});--%>
    <%--});--%>
<%--</script>--%>
<%--<script>--%>
    <%--function selectUser() {--%>
        <%--var xmlhttp = new XMLHttpRequest();--%>
        <%--xmlhttp.onreadystatechange = function () {--%>
            <%--if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {--%>
                <%--document.getElementById("test").innerHTML = xmlhttp.responseText;--%>
            <%--}--%>
        <%--}--%>

        <%--xmlhttp.open("POST", "user/showUser.do", true);--%>
        <%--xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded;charset=UTF-8");--%>
        <%--xmlhttp.send("username=zzh&&password=123");--%>
    <%--}--%>
<%--</script>--%>
<body>
<p>Hello World!</p>
编号：<span id="id"></span><br>
书名：<span id="name"></span><br>
作者：<span id="author"></span><br>
<button type="button" id="regiter_confirm">onclick test</button>
</body>
</html>