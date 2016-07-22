<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="template/template_head.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Merchant Manage</h1>

<form action="." method="post">
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
		<input type="submit" class="btn btn-primary" value="Sign In"/>
		<!-- <a href="#" class="btn btn-success">Sign Up</a> -->
	</div>
</form>

<%@ include file="template/template_foot.jsp"%>