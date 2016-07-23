<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="template/template_head.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Merchant Manage</h1>
<a href="<%=request.getContextPath() %>/Logout" class="btn btn-primary">sign out</a>

<p>need a navbar, it could navigate to the auditController</p>
<p>it is a list here, including a function to block the merchant</p>

<table border="1">
	<tr>
		<th>ID</th>
		<th>Keeper</th>
		<th>Telephone</th>
		<th>Identity Card Number</th>
		<th>Identity Card Preview</th>
		<th>Location</th>
		<th>Merchant Name</th>
		<th>Logo Preview</th>
	</tr>
<c:forEach var="each" items="${merchants}">
	<tr>
		<td>${each.mId}</td>
		<td>${each.mPName}</td>
		<td>${each.mTel}</td>
		<td>${each.mIdCard}</td>
		<td>${each.mCardPath}</td>
		<td>${each.mLocation}</td>
		<td>${each.mBrand}</td>
		<td>${each.mLogoPath}</td>
	</tr>
</c:forEach>
</table>
<%@ include file="template/template_foot.jsp"%>