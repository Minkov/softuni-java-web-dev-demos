<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%=request.getAttribute("title")%></title>
</head>
<body>
    <h1>
        <%=request.getAttribute("title") %>
    </h1>
    <p>Running on <%= request.getAttribute("client")%></p>
</body>
</html>