<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Advertisement field</h1>
<table>
		<tr>
			<td style="border: solid 1px #a0c6e5; height: 20px;">${food.fId}</td>
			<td style="border: solid 1px #a0c6e5; height: 20px;">${food.fName}</td>
			<td style="border: solid 1px #a0c6e5; height: 20px;">${food.fPrice}</td>
			<td style="border: solid 1px #a0c6e5; height: 20px;">${food.fViewPath}</td>
			<td><%out.write("<img src=\"http://usr.im/200x150\"/>");%>
			</td>
			
			<td><a href="showMenu">Order</a></td>
		</tr>
		</table>
</body>
</html>