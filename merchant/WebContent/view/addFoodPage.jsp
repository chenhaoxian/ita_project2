<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/bootstrap.min.css" />
<title>添加商品</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h1>商品添加</h1>

<form class="form-horizontal" action="${pageContext.request.contextPath}/addFoodServlet" method="post" enctype="multipart/form-data">
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">菜品名称：</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="fName" placeholder="菜品名称" name="fName">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">价格:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="fPrice" placeholder="价格" name="fPrice">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">上传商品图片:</label>
    <div class="col-sm-10">
      <input type="file" name="foodImage" name="foodImage"/><br>
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