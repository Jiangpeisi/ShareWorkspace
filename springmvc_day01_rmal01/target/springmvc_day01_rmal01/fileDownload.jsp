<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="java.net.URLEncoder" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>文件下载</title>
</head>
<body>
<a href="download.action?filename=<%=URLEncoder.encode("__pom.xml","UTF-8")%>">文件下载</a>
</body>
</html>