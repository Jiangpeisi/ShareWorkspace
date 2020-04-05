<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
    <script>
        $().ready(function () {
            $("#button_ajax").click(function () {
                $.ajax({
                    type: 'post',
                    contentType: 'application/json',
                    url: '/student/login',
                    dataType: 'json',
                    data: JSON.stringify({
                        "username": $("#username").val(),
                        "password": $('#password').val()
                    }),
                    async : true,
                    success: function (json) {
                        alert(json["info"]);
                    },
                    error: function () {
                        alert("eror");
                    }
                });
            });
        });
    </script>

</head>
<body>
<h1>Student login</h1>
<form action="/student/login" method="post">
    账户:<input type="text" name="username" id="username"><br/>
    密码:<input type="password" name="password" id="password"><br/>
    <input type="submit" value="form提交" id="button"><br/>
</form>
<input type="submit" value="ajax提交json" id="button_ajax"><br/>
</body>

</html>