<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="template/template_head.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Merchant Manage, Audition manage</h1>
<a href="<%=request.getContextPath() %>/Logout" class="btn btn-primary">sign out</a>
<a href="<%=request.getContextPath() %>/Content/Index" class="btn btn-primary">Index</a>

<p>need a navbar, it could navigate to the auditController</p>

<div class="container">
	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-default">
				<div class="panel-heading">Audition list</div>
				<div class="panel-body">
					<p>it is a list here, including a function to block the merchant</p>
				</div>
				<table class="table table-striped table-condensed">
					<tr>
						<th>ID</th>
						<th>Keeper</th>
						<th>Telephone</th>
						<th>Identity Card Number</th>
						<th>Identity Card Preview</th>
						<th>Location</th>
						<th>Merchant Name</th>
						<th>Logo Preview</th>
						<th>Options</th>
					</tr>
				<c:forEach var="each" items="${merchants}">
					<tr>
						<td>${each.mId}</td>
						<td>${each.mPersonName}</td>
						<td>${each.mTel}</td>
						<td>${each.mIdCard}</td>
						<td><img src='${each.mCardPath}' class='img-responsive img-rounded'/></td>
						<td>${each.mLocation}</td>
						<td>${each.mBrand}</td>
						<td><img src='${each.mLogoPath}' class='img-responsive img-rounded'/></td>
						<td>
							<div class="btn-group">
								<a href="<%=request.getContextPath()%>/Action/ConfirmAudition?tel=${each.mTel}" class="btn btn-primary">Confirm</a>
								<a href="<%=request.getContextPath()%>/Action/RejectAudition?tel=${each.mTel}" class="btn btn-info">Reject</a>
							</div>
						</td>
					</tr>
				</c:forEach>
				</table>
			</div>
		</div>
	</div>
</div>
<%@ include file="template/template_foot.jsp"%>