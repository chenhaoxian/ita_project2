<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<h1>Advertisement field</h1>
	<h1>Show All Merchant</h1>
	<h1></h1>
	<table>
		<tr>
			<td style="border: solid 1px #a0c6e5; height: 20px;">${merchant.mId}</td>
			<td style="border: solid 1px #a0c6e5; height: 20px;">${merchant.mTel}</td>
			<td style="border: solid 1px #a0c6e5; height: 20px;">${merchant.mLocation}</td>
			<td style="border: solid 1px #a0c6e5; height: 20px;">${merchant.mBrand}</td>
			<td><%out.write("<img src=\"http://usr.im/200x150\"/>");%>
			</td>
			
			<td><a href="showMenu">Menu</a></td>
		</tr>
		<!--
<c:forEach var="c" items="${cs}">
		<tr>
			<td>${c.id }</td><td>${c.cname }</td>
			<td><fmt:formatNumber value="${c.price }" pattern="$##,###.00"></fmt:formatNumber></td>
			<td>${c.backGround }</td>
			<td>${c.count }</td>
			<td></td>
			<td><a href="delete?id=${c.id }">delete</a></td>
		</tr>
	</c:forEach>
	-->
	</table>
</body>
</html>