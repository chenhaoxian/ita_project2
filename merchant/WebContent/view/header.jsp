<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<div style="background-color: #CCCCCC ">
你好 ： ${sessionScope.merchant.mPersonName } &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;<a href="${pageContext.request.contextPath }/signOutServlet">【注销】</a>   &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;<a href="${pageContext.request.contextPath }/showAllFoodServlet">【管理菜品】</a>
&nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;<a href="${pageContext.request.contextPath }/view/addFoodPage.jsp">【添加菜品】</a>
</div>
</body>
</html>