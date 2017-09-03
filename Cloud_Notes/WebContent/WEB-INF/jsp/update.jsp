<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码的界面</title>
</head>
<body>

	<form action="${pageContext.request.contextPath }/user/update.do"
		method="post">
		原密码：<input type="password" name="lastPassword" id="lastPassword">
		新密码：<input type="password" name="newPassword" id="newPassword">
		<input type="submit" name="sub_btn" value="确认提交">
	</form>

</body>
</html>