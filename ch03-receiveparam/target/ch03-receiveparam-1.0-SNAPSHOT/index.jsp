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
       <form action="receive.do" method="post">
           姓名<input type="text" name="name"><br/>
           年龄<input type="text" name="age"><br/>
           <input type="submit" value="submit">
       </form>

       <br/>

       <form action="receive1.do" method="post">
           姓名<input type="text" name="rname"><br/>
           年龄<input type="text" name="rage"><br/>
           <input type="submit" value="submit">
       </form>

       <form action="receive2.do" method="post">
           姓名<input type="text" name="name"><br/>
           年龄<input type="text" name="age"><br/>
           <input type="submit" value="submit">
       </form>
</body>
</html>
