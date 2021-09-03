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
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
           $("button").click(function () {
                //alert("hhhh");
               $.ajax({
                   //url:"returnVoid-ajax.do",
                   //url:"returnStudentJson.do",
                   //url:"returnStudentJsonArray.do",
                   url:"returnStringData.do",
                   data:{
                       name:"jack",
                       age:20
                   },
                   type:"post",
                   //dataType:"json",
                   dataType:"text",
                   success:function (resp) {
                       //alert(resp)
                       //alert(resp.name+resp.age);
                       /*$.each(resp,function (i,n) {
                                 alert(n.name+n.age);
                       })*/
                       alert(resp);
                   }
               })
           })
        })
    </script>
</head>
<body>
       <form action="returnString-view.do" method="post">
           姓名<input type="text" name="name"><br/>
           年龄<input type="text" name="age"><br/>
           <input type="submit" value="submit">
       </form>

       <form action="returnString-view2.do" method="post">
           姓名<input type="text" name="name"><br/>
           年龄<input type="text" name="age"><br/>
           <input type="submit" value="submit">
       </form>
       <br/>
         <button id="btn" >ajax</button>
</body>
</html>
