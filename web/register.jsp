<%--
  Created by IntelliJ IDEA.
  User: 86130
  Date: 2019/7/15
  Time: 11:38
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
            var sUserName = document.frmLogin.username.value;
            var sPassword = document.frmLogin.password.value;
            var doublePassword = document.frmLogin.doublepassword.value;
            var sSex = document.frmLogin.sex.value;
            var sHobbys = document.frmLogin.hobbys.value;
            var sPhone = document.frmLogin.phone.value;
            var sEmail = document.frmLogin.email.value;
            var sAddrs = document.frmLogin.addrs.value;
            if( sUserName.length==0 )
            {
                alert("请输入用户名！");
                return false;

            }
            if( sPassword.length==0 )
            {
                alert("请输入密码！");
                return false;
            }
            if( !(sPassword==doublePassword ))
            {
                alert("二次密码输入有误！");
                return false;
            }
            if( sSex.length==0 )
            {
                alert("性别？");
                return false;
            }
            if( sHobbys.length==0 )
            {
                alert("爱好不能为空");
                return false;
            }
            if( sPhone.length==0 )
            {
                alert("手机号不能为空");
                return false;
            }
            if( sEmail.length==0 )
            {
                alert("email不能为空");
                return false;
            }
            if( sAddrs.length==0 )
            {
                alert("地址不能为空");
                return false;
            }

            return true;
        }
    </script>


</head>
<body background="img/two.jpg" style="background-size: cover">
<div class="divForm2">
    <form action="registerServlet" method="post"  name="frmLogin" onsubmit="return validateLogin()">
        <table  class="divForm3" >
            <tr >
                <td colspan="2"  style="text-align: center">
                    注册
                </td>
            </tr>
            <tr>
                <td >
                    用户名：
                </td>
                <td>
                    <input type="text" name="username" >
                </td>
            </tr>
            <tr>
                <td >
                    密码：
                </td>
                <td>
                    <input type="text" name="password" >
                </td>
            </tr>
            <tr>
                <td >
                    二次输入密码：
                </td>
                <td>
                    <input type="text" name="doublepassword" >
                </td>
            </tr>
            <tr>
                <td>
                    性别：
                </td>
                <td>
                    <input type="radio" name="sex" value="男" checked>男
                    <input type="radio" name="sex" value="女">女
                </td>
            </tr>
            <tr>
                <td>
                    爱好：
                </td>
                <td>
                    <input type="text" name="hobbys">
                </td>
            </tr>
            <tr>
                <td>
                    手机号码：
                </td>
                <td>
                    <input type="text" name="phone">
                </td>
            </tr>
            <tr>
                <td>
                    邮箱：
                </td>
                <td>
                    <input type="text" name="email">
                </td>
            </tr>
            <tr>
                <td>
                    地址：
                </td>
                <td>
                    <input type="text" name="addrs">
                </td>
            </tr>
            <tr  style="text-align: center">
                <td  colspan="2">
                    <input type="submit" value="提交信息" >
                </td>
            </tr>
        </table>

    </form>
</div>
</body>
</html>
