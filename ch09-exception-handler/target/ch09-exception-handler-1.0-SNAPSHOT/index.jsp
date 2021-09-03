<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/23
  Time: 6:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>

<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
</head>
<body>
       <p>forward</p>
       <form action="some.do" method="post">
           姓名：<input type="text" name="name"><br/>
           密码：<input type="text" name="age"><br/>
           <input type="submit" value="submit">
       </form>
</body>
</html>
