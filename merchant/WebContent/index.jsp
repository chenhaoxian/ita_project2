<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>商家登录：</h1>
<form action="loginServlet" method="post">
	账号：<input name="mTel" type="text"/><br />
	密码：<input name="mPassword" type="password"/><br/>
	<input type="submit" value="登录"/> 
</form>
<h2>想加入我们？</h2>
<h3>点击按钮注册：</h3>
<a href="view/register.jsp">点击注册</a>
</body>
</html>