<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商家注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/registerServlet" method="post">
本人姓名：<input name="mPersonName" type="text"/><br>
电话：<input name="mTel" type="text"/><br>
密码：<input name="mPassword" type="password"/><br>
<input type="submit" value="注册"/> 
</form>

</body>
</html>