<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商家注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/auditServlet" method="post" enctype="multipart/form-data">
身份证：<input  name="mIdCard" type="text"/><br>
<input type="file" name="idCardImage"><br>
地址：<input name="mLocation" type="text"/><br>
店名：<input name="mBrand" type="text"/><br>
LOGO：<br>
<input type="file" name="logoImage"/><br>
<input type="submit" value="submit"/> 
</form>

</body>
</html>