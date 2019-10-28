<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/8
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
  <script>
    function selectemp(){

    }
  </script>
</head>
<body>
  <c:forEach items="${pageinfo.list}" var="emp">
    ${emp.ename}
  </c:forEach><br>
  <input type="text" value="${pageinfo.firstPage}"><br>
  <a href="../emp/selectemp">无刷新</a>
</body>
</html>
