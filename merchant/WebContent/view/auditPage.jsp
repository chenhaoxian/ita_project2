<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/bootstrap.min.css" />
<title>商家注册</title>
</head>
<body>
<jsp:include page="header2.jsp"></jsp:include>

<h1 align="center">提交审核信息</h1>

<form class="form-horizontal" action="${pageContext.request.contextPath }/auditServlet" method="post" enctype="multipart/form-data">
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">身份证：</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="mIdCard" placeholder="身份证：" name="mIdCard">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">上传身份证图片:</label>
    <div class="col-sm-10">
      <input type="file" name="idCardImage" name="idCardImage"/><br>
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">地址：</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="mLocation" placeholder="地址：" name="mLocation">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">店名：</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="mBrand" placeholder="店名：" name="mBrand">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">LOGO：</label>
    <div class="col-sm-10">
      <input type="file" name="logoImage" name="logoImage"/><br>
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
</body>
</html>