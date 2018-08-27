<%@ page import="com.joker.User" %>
<%@ page import="com.joker.util.CommonUtil" %>
<%@ page import="com.joker.Test" %><%--
  Created by IntelliJ IDEA.
  User: Chen7
  Date: 2018/8/28
  Time: 0:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>maven 示例</title>
</head>
<body>
    <%
        User user = new User("张三",22,1,"深圳市福田区");
        Test test = new Test();
    %>
    Hello Maven!!<br/>2222
    姓名：<%=user.getName()%><br/>
    年龄：<%=user.getAge()%><br/>
    性别：<%=CommonUtil.chanslateSex(user.getSexDm())%>
    地址：<%=user.getAddr()%>
<%=test.getStr()%>
</body>
</html>
