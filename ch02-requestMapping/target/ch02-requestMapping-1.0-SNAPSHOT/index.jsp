<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/23
  Time: 6:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
       <p>第一个springmvc项目</p>
       <p><a href="user/some.do">发起some.do的get请求</a> </p>
       <form action="user/other.do.do" method="post">
           <input type="submit" value="submit">
       </form>
       <p><a href="user/third.do">发起third.do的请求</a> </p>
</body>
</html>
