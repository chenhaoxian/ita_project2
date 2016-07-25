<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Here</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body style="padding-top: 70px;">


<div class="container">
	<div class="row">
		<div class="col-md-offset-4 col-md-4">
			<div class="panel panel-default">
				<div class="panel-heading"><h3>Merchant manage system</h3></div>
				<div class="panel-body">
					<form method="post">
						<!-- 
						<div class="form-group">
							<label for="username">User</label>
							<input type="text" class="form-control" id="username" name="username" />
						</div> 
						-->
						<div class="form-group">
							<label for="password">Password</label>
							<input type="text" class="form-control" id="password" name="password" />
						</div>
						<div class="form-group">
							<input type="submit" class="btn btn-primary btn-block" value="Sign In"/>
							<!-- <a href="#" class="btn btn-success">Sign Up</a> -->
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>