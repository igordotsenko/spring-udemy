<%--
  Created by IntelliJ IDEA.
  User: idotsenko
  Date: 11/2/18
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Page</title>
</head>
<body>
<h3>${param.firstname}</h3>
<h3>${firstnameCaps}</h3>
<h3>${lastnameCaps}</h3>

<img src="${pageContext.request.contextPath}/resources/image/imgonline-com-ua-Resize-inch-mm-cm-vtifaK8Bq7pmHgPm.jpg">
</body>
</html>
