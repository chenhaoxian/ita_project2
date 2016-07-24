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
本人姓名：<input name="mPersonName" type="text" id="mPersonName" /><br>
电话：<input name="mTel" type="text" id="mTel"/><br>
密码：<input name="mPassword" type="password" id="mPassword"/><br>
<input type="submit" value="注册"/> 
</form>

<script type="text/javascript" src="res/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript">

function checkInput(){
	
	
}
</script>
</body>
</html>