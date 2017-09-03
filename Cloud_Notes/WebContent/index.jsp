<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>这是首页</title>
</head>
<body>
	<h1>云笔记的首页</h1>
	<!-- <script type="text/javascript">
		window.location.href = 'login.jsp';
	</script> -->
	
	<a href="${pageContext.request.contextPath }/login.jsp">登陆</a>
	<a href="${pageContext.request.contextPath }/register.jsp">注册</a>
</body>
</html>