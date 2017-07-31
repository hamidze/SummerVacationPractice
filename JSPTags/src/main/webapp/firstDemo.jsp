<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="person" class="test.Person"></jsp:useBean>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 使用out标签输出常量 -->
<c:out value="This is our first JSTL demo"></c:out><br>
<c:out value="${username}"></c:out>
<c:out value="${1+2}"></c:out>
<%String username = "mike"; request.setAttribute("username", username); %>

<c:out value="${empty username}"></c:out>

<!-- 使用out标签输出变量 -->
<!-- 直接输出变量 -->
<%session.setAttribute("name", "Jessica"); %>
<c:out value="${name}"></c:out>
<!-- 当变量不存在时，通过default属性输出默认值 -->
<c:out value="${name1}" default="error"></c:out><br>
<!-- 设置输出转义后的字符需要escapeXml属性值设置成false -->
<c:out value="&ltout标签&gt" escapeXml="false"></c:out><br>


<!-- 存值到scope中 -->
<c:set value="today" var="day" scope="session"></c:set>
<c:out value="${day}"></c:out><br>

<c:set var="age" scope="application">eleven</c:set>
<c:out value="${age}"></c:out><br>

<!-- 通过set标签向person中赋值 -->
<c:set target="${person}" property="name2" value="Mike"></c:set>
<c:out value="${person.name2}"></c:out>&nbsp;&nbsp;
<c:set target="${person}" property="age2" value="26"></c:set>
<c:out value="${person.age2}"></c:out>&nbsp;&nbsp;
<c:set target="${person}" property="address" value="北京市 朝阳区"></c:set>
<c:out value="${person.address}"></c:out>&nbsp;&nbsp;<br>

<c:set target="${person}" property="name2">Mike</c:set>
<c:out value="${person.name2}"></c:out>&nbsp;&nbsp;
<c:set target="${person}" property="age2">26</c:set>
<c:out value="${person.age2}"></c:out>&nbsp;&nbsp;
<c:set target="${person}" property="address">北京市 朝阳区</c:set>
<c:out value="${person.address}"></c:out>&nbsp;&nbsp;<br>
</body>
</html>