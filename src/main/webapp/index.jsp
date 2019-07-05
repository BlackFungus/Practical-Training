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
sid,tid,context,file
<form action="topic/replyRelease" method="get">
    sid：<input type="text" name="sid" /> <br />
    tid：<input type="text" name="tid" /> <br />
    context:<input type="text" name="context" /> <br />
    file:<input type="text" name="file" /> <br />
    <input type="submit" value="保存" /><br />
</form>

</body>
</html>
