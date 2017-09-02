<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示员工信息</title>
<style>
* {
	margin: 0;
	padding: 0;
}

#main {
	width: 1000px;
	margin: 0 auto;
	padding-bottom: 30px;
	margin-top: 30px;
}

table {
	width: 1000px;
	border-collapse: collapse;
	margin: 0 auto;
	border: 1px solid black;
	text-align: center;
}

th {
	border: 1px solid black;
	height: 30px;
}

tr, td {
	border: 1px solid black;
	height: 30px;
	line-height: 30px;
	text-align: center;
}
</style>
</head>
<body>

	<div id="main">
		
		<table>
			<caption style="font-size: 20px;">员工管理</caption>
			<tr>
				<th>员工编号</th>
				<th>员工姓名</th>
				<th>职位</th>
				<th>入职时间</th>
				<th>工资</th>
				<th>领导编号</th>
				<th>部门编号</th>
				<th>操作</th>
			</tr>

			<c:forEach items="${list}" var="emp" varStatus="status">
				<tr>
					<td>${emp.empno}</td>
					<td>${emp.empName}</td>
					<td>${emp.job}</td>
					<td>${emp.hiredate}</td>
					<td>${emp.sal}</td>
					<td>${emp.mgr}</td>
					<td>${emp.deptno}</td>
					<td>
					<p>
					<a href="EmpServlet?action=modifier&id=${emp.empno}">修改</a>
					<a href="EmpServlet?action=delete&id=${emp.empno}" onClick="return confirm('确定删除吗？');">删除</a>
					</p>
					</td>
				</tr>
			</c:forEach>

		</table>
		<p style="text-align: center;">
			<a href="index.jsp">返回首页</a>
		</p>
	</div>
</body>
</html>



