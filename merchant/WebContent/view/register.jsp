<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商家注册</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/bootstrap.min.css" />
</head>
<body>

<br><br><br><br>
<h2 align="center">商家注册</h2>
<form class="form-horizontal" action="${pageContext.request.contextPath }/registerServlet" method="post" >
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">本人姓名：</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="mPersonName" placeholder="本人姓名：" name="mPersonName">
    </div>
  </div>
 
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">电话：</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="mTel" placeholder="电话：" name="mTel">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">密码：</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="mPassword" placeholder="密码：" name="mPassword">
    </div>
  </div>
 
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">提交:</label>
    <div class="col-sm-10">
      <button type="submit" class="btn btn-default">Submit</button>
    </div>
  </div>
  
</form>


<script src="${pageContext.request.contextPath}/res/js/jquery-2.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/res/js/bootstrap.min.js"></script>
<script type="text/javascript">

function checkInput(){
	
	
}
</script>
</body>
</html>