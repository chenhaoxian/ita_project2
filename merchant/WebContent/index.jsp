<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/bootstrap.min.css" />
</head>
<body>

<br><br><br><br><br>
<h1 align="center">登录</h1>
<form class="form-horizontal" action="${pageContext.request.contextPath }/loginServlet" method="post" >
  <div class="form-group">
    <label for="" class="col-sm-2 control-label">账号</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="mTel" placeholder="账号：" name="mTel" >
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
    <div class="col-sm-10">
     <input type="password" class="form-control" id="mPassword" placeholder="密码：" name="mPassword">
    </div>
  </div>
  
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Sign in</button>
    </div>
  </div>
</form>

<h2 align="center">想加入我们？</h2>
<h3 align="center">点击按钮注册：</h3>
<h3 align="center"><a href="view/register.jsp" >点击注册</a></h3>



<script src="${pageContext.request.contextPath}/res/js/jquery-2.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/res/js/bootstrap.min.js"></script>
</body>
</html>