<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/bootstrap.min.css" />
<title>商品管理</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h1 align="center">商品管理</h1>
<table class="table">
<tr><td align="center">商品名</td><td align="center">价格</td><td align="center">图片</td><td align="center">删除</td></tr>
	<c:forEach items="${foodList }" var="food">
		<tr >
		<td colspan="1" align="center" >${food.fName} </td>
		<td colspan="1" align="center">${food.fPrice}  </td>
		<td colspan="1" align="center"><img alt="" src="${food.fViewPath }"> </td>
		<td colspan="1" align="center"><a href="${pageContext.request.contextPath }/deleteFoodServlet?fId=${food.fId}">delete</a> </td>
		</tr>
		
		
	</c:forEach>
	</table>



<script src="${pageContext.request.contextPath}/res/js/jquery-2.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/res/js/bootstrap.min.js"></script>
</body>
</html>