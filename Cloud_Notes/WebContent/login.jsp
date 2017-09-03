<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆界面设计</title>
</head>
<body>

	<form action="${pageContext.request.contextPath }/user/login.do"
		method="post">
		用户名：<input type="text" name="username" id="username"></br> 密 码：<input
			type="password" name="password" id="password"></br> <input
			type="submit" name="sub_btn" id="sub_btn" value="登陆"> <a
			href="${pageContext.request.contextPath }/register.jsp">注册用户</a>
	</form>

</body>
</html>



