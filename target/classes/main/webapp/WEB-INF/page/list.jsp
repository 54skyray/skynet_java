<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>列表</title>
</head>

<body>
<table style="width:100%;border:1px white solid">
    <tr bgcolor="#4F81BD" style="color: #fff;">
        <th style="text-align: center">id</th>
        <th style="text-align: center">guid</th>
        <th style="text-align: center">rule</th>
        <th style="text-align: center">type</th>
        <th style="text-align: center">category</th>
        <th style="text-align: center">source</th>
        <th style="text-align: center">description</th>
        <th style="text-align: center">ctime</th>
    </tr>
    <c:forEach items="${blackList}" var="black">
        <tr bgcolor="${black.id%2 == 0?'#D0D8E8':'#E9EDF4'}">
            <td align="center">${black.id}</td>
            <td align="center">${black.guid}</td>
            <td align="center">${black.rule}</td>
            <td align="center">${black.type}</td>
            <td align="center">${black.category}</td>
            <td align="center">${black.source}</td>
            <td align="center">${black.description}</td>
            <td align="center">${black.ctime}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>