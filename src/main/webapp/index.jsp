<%--
  Created by IntelliJ IDEA.
  User: 黑色菌体
  Date: 2019/6/30
  Time: 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Hello World!</h2>

<a href="account/findAll">测试查询</a>
<h3>测试保存</h3>
<form action="account/save" method="get">
    姓名：<input type="text" name="name" /> <br />
    金额：<input type="text" name="money" /><br />
    <input type="submit" value="保存" /><br />
</form>
</body>
</html>
