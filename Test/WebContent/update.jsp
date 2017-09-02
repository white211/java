<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新员工数据</title>
<style>
* {
	margin: 0;
	padding: 0;
}

#main {
	width: 660px;
	margin: 0 auto;
	border: 1px solid black;
	font-size: 20px;
	padding: 50px;
}

input[type="text"] {
	height: 30px;
	line-height: 30px;
	width: 400px;
}
</style>
</head>
<body>
	<div id="main">
		<form method="post" action="EmpServlet?action=update&no=${emp.empno}">
			员工编号：<input type="text" name="empno" id="empno" value="${emp.empno} "></br>
			员工姓名：<input type="text" name="ename" id="ename"
				value="${emp.empName}"></br> 员工职位：<select name="job"
				>
				<option value="${emp.job}" selected="selected">${emp.job}</option>
				<option value="MANAGER">MANAGER</option>
				<option value="SALESMAN">SALESMAN</option>
				<option value="ANALYST">ANALYST</option>
				<option value="PRESIDENT">PRESIDENT</option>
				<option value="CLERK">CLERK</option>
			</select> </br> 领导编号：<input type="text" name="mgr" id="mgr" value="${emp.mgr}">
			</br> 入职时间：<input type="text" name="hiredate" id="hiredate"
				value="${emp.hiredate}"> </br> 员工工资：<input type="text" name="sal"
				id="sal" value="${emp.sal}"> </br> 奖励金额：<input type="text"
				name="comm" id="comm" value="${emp.comm}"> </br> 部门编号：<input
				type="text" name="deptno" id="deptno" value="${emp.deptno}">
			</br>

			<div style="margin-left: 200px;margin-top: 20px;">
				<input type="submit" value="提交修改" name="modifier_btn" style="border:none;font-size:20px;border-radius:3px;"> 
				<a href="EmpServlet?action=show">返回员工列表</a>
			</div>
		</form>
	</div>
</body>
</html>