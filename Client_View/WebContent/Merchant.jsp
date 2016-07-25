<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#EED5D2">
 	<h1>Advertisement field</h1>
 	<p style="text-align:center"><a style="" target="blank" title="" href="http://pos.baidu.com/cclick.php?K60000ayw_EgkRG5rsOBejY7KuOS-Tu6v7XueA_muLODS6kNNDccteQWR5cocyWHZZkdGo0wSitHPSuhjpekJcw-TH89nHbjLDKNY2fnVa00A8HnIqQkkwZFSKsv.DD_iTnx-xIec8ij21qj55EX1BsTEpMfkxgbtXh1FvIhOgmMI3soDkEo_o__LeSg_4mTTzs1f_NSrOkR.mhwGujdDPbcYwHwKn1nYf1c3wbR3wHPDrDD1wHNAPR7Af1m4rfKWTA-b5RfvfWw7PDD1n1wjnW9AwH97nYf3fHP7PRmdfRujPWb40ZIbg17YTh7buHYkrfKLu7tzIZF9uARqnHbsP0KbUvd9py4xuh-zTLwxIZF9uARqP0KbUvd9py4xTvNWUv4bgLwzmyw-5Hfsr0KsU1YknfKsm1YkrjT0mv9VujYk0ZPWpAdb5H00TL0qnfK9uZfqnfKvpyw-UdqWpA78UhN_5H00IgP-T-qYXgK-5HD0TvNzIh-8udqYXgK-5H00ugfqn0KVm1Ys0A7bmvk9TLnqn0KYIHddnWn4rjT1n6KYUHYkPjnYPW030Zwb5Hc1rH6Ln1c0IA7z5HD0TLPs5HD0IZws5HD0mvqVTAk-5H00ULnqnH00mMcqnHc0myI-5HRknjc0mLwo5fKbIZ0qnfKdThsqpZwYTjCEQLGCpyw9Uz4Bmy-bIi4WUvYEUA-8p1qdThsqpN7FNM6kHYdwRA9kUvdBryR3i-7HiyFsX-DYXAGVX-GgTbVWHhb4PAVPHW7luAdZiNPkuyqVUAf4IYI-Tj9Hn1KKfy71ngNFyWNypMbvRhGdXD4iIdt0Iv-bIA6qrHms0A9-pyICIjY4n0K9uZ9xmh-bgvPsUHYzP1T0mv6qn0K9IywGuy4WuNqYTh7buHYYrjT0mv9GUAwxTLw9uvNxpyfqnW0Y0AI-Uhw-T-qGujYznjD0phqBgLFEUANxpyfqPjms0Ad9TMFGmyI-gv-b5Hn3P6K1IA7YpyPxTZFETANzIZbqnHbzc1fzPin1rHn0IARqPWmznj00mLFW5HcknWfv0j" id="res0">
 	<img style="" src="http://ubmcmm.baidustatic.com/media/v1/0f0005DtCaKyi1dpKT7t4f.jpg"></a>
</p>
	
	<h1 align="center">                      Show All Merchant</h1>
	<h1></h1>
	<table align="center" border="1">
		<tr>
			<td align="center" valign="middle" style="border: solid 1px #a0c6e5; height: 20px;width:100px">Id</td>
			<td align="center" valign="middle" style="border: solid 1px #a0c6e5; height: 20px;width:150px">Tel</td>
			<td align="center" valign="middle" style="border: solid 1px #a0c6e5; height: 20px;width:150px">Location</td>
			<td align="center" valign="middle" style="border: solid 1px #a0c6e5; height: 20px;width:150px">Brand</td>
			<td align="center" valign="middle" style="border: solid 1px #a0c6e5; height: 20px;width:150px">Picture</td>
		</tr>
<c:forEach var="merchant" items="${merchants}">
	<tr>
			<td align="center" valign="middle"  style="border: solid 1px #a0c6e5; height: 20px;">${merchant.mId}</td>
			<td  align="center" valign="middle" style="border: solid 1px #a0c6e5; height: 20px;">${merchant.mTel}</td>
			<td  align="center" valign="middle" style="border: solid 1px #a0c6e5; height: 20px;">${merchant.mLocation}</td>
			<td  align="center" valign="middle" style="border: solid 1px #a0c6e5; height: 20px;">${merchant.mBrand}</td>
			<!--  <%out.write("<img src=\"http://usr.im/200x150\"/>");%>-->
			<td align="center" valign="middle" ><img alt="" src="${merchant.mLogoPath}">
			</td>
			<td><a href="showMenu?id=${merchant.mId }">Menu</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>