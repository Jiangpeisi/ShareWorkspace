<%--
  Created by IntelliJ IDEA.
  User: jiang
  Date: 2020/3/9
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>入门程序</h3>
    <a href="test/hello?username=root&password=123">入门连接</a>
    <form action="form/login" method="post">
        账户:<input type="text" name="username"><br/>
        密码:<input type="password" name="password"><br/>
        金额:<input type="text" name="acountList[0].money"><br/>
        金额:<input type="text" name="acountList[1].money"><br/>
        金额:<input type="text" name="acountMap['one'].money"><br/>
        金额:<input type="text" name="acountMap['two'].money"><br/>
        <input type="submit" value="提交"><br/>
    </form>
    <a href="test/getApi?username=root&password=123">获取API</a>
    <br/>
    <a href="student/insert">测试SpringMvc</a>
</body>
</html>
