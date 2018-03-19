<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/16
  Time: 17:48
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
        $("#edit_summay").click(function () {
            $.ajax("${pageContext.request.contextPath}/user/edit_summay",
                    {
                        dataType: "json",
                        type: "post",
                        contentType: "application/json",
                        data: JSON.stringify({
                            workContent: $("#workContent").val(),
                            questions: $("#questions").val(),
                            solution: $("#solution").val(),
                            saveDay: $("#saveDay").val()
                        }),
                        async: true,
                        success: function (data) {
                            $("#isSummarySave").html(data.data.user.username + " , " + data.data.stateInfo)
                        },
                        error: function () {
                            alert("数据发送失败")
                        }
                    });
        });

        $("#querySummaryByDate").click(function () {
            var showQueryState = $( "#showQueryState" );
            var  showSummary =  $("#showSummary")
            $.ajax("${pageContext.request.contextPath}/user/querySummaryByDate",
                    {
                        dataType: "json",
                        type: "post",
                        contentType: "application/json",
                        data: JSON.stringify({
                            querySaveDay: $("#querySaveDay").val()
                        }),
                        async: true,
                        success: function (data) {
                            if(data.data.state == 1){
                                showQueryState.html(data.data.stateInfo);
                                showQueryState.show();
                                $("#showWorkContent").html(" 工作内容： " + data.data.summary.workContent);
                                $("#showQuestions").html(" 存在问题： " + data.data.summary.questions);
                                $("#showSolution").html(" 解决方法： " + data.data.summary.solution);
                                showSummary.show();
                            }else{
                                showQueryState.html(data.data.stateInfo);
                                showQueryState.show();
                                showSummary.hide();
                            }
                        },
                        error: function () {
                            alert("数据发送失败")
                        }
                    });
        });
    });
</script>
<body>
<span><label id="isSummarySave"></label> </span>
<table>
    <tr>
        <td><label>工作内容： </label></td>
        <td><textarea  type="text" id="workContent" name="workContent"></textarea></td>
    </tr>
    <tr>
        <td><label>存在问题： </label></td>
        <td><textarea type="text" id="questions" name="questions"></textarea></td>
    </tr>
    <tr>
        <td><label>解决方法： </label></td>
        <td><textarea type="text" id="solution" name="solution"></textarea></td>
    </tr>
    <tr>
        <td><label>总结日期： </label></td>
        <td><input type="text" id="saveDay" name="saveDay"/></td>
    </tr>
    <tr>
        <td>
            <button type="button" id="edit_summay">提交总结</button>
        </td>
    </tr>
    <tr>
        <td><label>查询日期： </label></td>
        <td><input type="text"  id="querySaveDay"/></td>
        <td>
            <button type="button" id="querySummaryByDate">查询该日期总结</button>
        </td>
    </tr>
</table>
<span><label id="showQueryState" style="display:none;"></label> </span>
<table id="showSummary" style="display:none;">
    <tr>
        <td><label>工作内容： </label></td>
        <td><label id="showWorkContent"></label></td>
    </tr>
    <tr>
        <td><label>存在问题： </label></td>
        <td><label id="showQuestions"></label></td>
    </tr>
    <tr>
        <td><label>解决方法： </label></td>
        <td><label id="showSolution"></label></td>
    </tr>

</table>
</body>
</html>