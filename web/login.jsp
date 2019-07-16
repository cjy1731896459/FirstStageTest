<%--
  Created by IntelliJ IDEA.
  User: 86130
  Date: 2019/7/15
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">

        .divForm2{
            border-radius:30px;
            background: aliceblue;
            position: absolute;/*绝对定位*/
            height: 300px;

            text-align: center;/*(让div中的内容居中)*/
            top: 50%;
            left: 80%;
            margin-top: -200px;
            margin-left: -150px;
        }
        .divForm3{
            height: 300px;
            border:2px solid darkslategray;
            border-radius:30px;
            font-size: 20px;
            font-weight: bolder;
            font-family: Arial;
        }
    </style>
    <script language="javaScript">
        function validateLogin()
        {
           var username = document.getElementById("loginname")
            var password = document.getElementById("passwordname")

            if( username.length==0 )
            {
                alert("请输入用户名！");
                return false;

            }
            if( password.length==0 )
            {
                alert("请输入密码！");
                return false;
            }

            return true;
        }
    </script>


</head>
<body background="img/two.jpg" style="background-size: cover">
<div class="divForm2">
    <form action="loginServlet" method="post"  onsubmit="return validateLogin()">
        <table  class="divForm3" >
            <tr >
                <td colspan="2"  style="text-align: center">
                    登录
                </td>
            </tr>
            <tr>
                <td >
                    用户名：
                </td>
                <td>
                    <input type="text" id="loginname" name="username" >
                </td>
            </tr>
            <tr>
                <td >
                    密码：
                </td>
                <td>
                    <input type="text"id="passwordname" name="password" >
                </td>
            </tr>
            <tr  style="text-align: center">
                <td  colspan="2">
                    <input type="submit" value="提交信息" >
                </td>
            </tr>
            <tr  style="text-align: center">
                <td  colspan="2">
                    <input type="button" value="注册" onclick="" >
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
