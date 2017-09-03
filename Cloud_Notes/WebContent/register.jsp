<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册界面</title>
</head>
<body>

	<form action="${pageContext.request.contextPath }/user/register.do"
		method="post">
		用户名：<input type="text" name="username" id="username"></br> 密 码：<input
			type="password" name="password" id="password"></br> 个人简介：
		<textarea name="user_desc" id="user_desc"></textarea>
		</br> <input type="submit" name="sub_btn" id="sub_btn" value="注册">
	</form>

</body>
</html>