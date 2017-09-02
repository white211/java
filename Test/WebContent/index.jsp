<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>这是首页</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

#main {
	width: 800px;
	margin: 0 auto;
	padding-bottom: 100px;
}

table {
	margin: 0 auto;
	width: 800px;
	border-collapse: collapse;
	border: 1px solid black;
	width: 660px;
	border-collapse: collapse;
}

tr, td {
	font-size: 20px;
	border: 1px solid black;
}

table tr td:first-child {
	width: 120px;
}

input[type="text"] {
	height: 30px;
	line-height: 30px;
	width: 300px;
}

#sub-btn1, #sub-btn2 {
	width: 100px;
	height: 30px;
	line-height: 30px;
	border: none;
	border-radius: 3px;
	margin-left: 200px;
	margin-top: 10px;
	margin-bottom: 10px
}
</style>
</head>
<body>
	<div id="main">
		<table>
			<caption style="font-size: 25px;">雇员后台管理</caption>
			<tr>
				<td>查询员工人数</td>
				<td><a href="EmpServlet?action=count">开始查询</a></td>
			</tr>
			<tr>
				<td>查看全部信息</td>
				<td><a href="EmpServlet?action=show">查看</a></td>
			</tr>
			<tr>
				<td>查询数据</td>
				<td>
				<form action="EmpServlet?action=find" method="post">
				   <input type="text" name="id" placeholder="请输入员工编号" style="height:20px;line-height:20px;">
				   <input type="submit" value="开始查询" name="find_btn" style="width:100px;height:25px;line-height:25px;font-size:18px;">
				</form>
				</td>
			</tr>
			<tr>
				<td>添加数据(有编号)</td>
				<td>
					<div>
						<form action="EmpServlet?action=add1" method="post">
							员工编号：<input type="text" name="empno" id="empno"> </br>员工姓名：<input
								type="text" name="ename" id="ename"></br> 员工职位：<select name="job">
								<option>--请选择--</option>
								<option value="MANAGER">MANAGER</option>
								<option value="SALESMAN">SALESMAN</option>
								<option value="ANALYST">ANALYST</option>
								<option value="PRESIDENT">PRESIDENT</option>
								<option value="CLERK">CLERK</option>
							</select> </br>领导编号：<input type="text" name="mgr" id="mgr"> </br>入职时间：<input
								type="text" name="hiredate" id="hiredate"> </br>员工工资：<input
								type="text" name="sal" id="sal"> </br>奖励金额：<input
								type="text" name="comm" id="comm"> </br>部门编号：<input
								type="text" name="deptno" id="deptno"> </br>
								 <input
								type="submit" name="btn1" id="sub-btn1" value="提交">
								
						</form>
					</div>
				</td>
			</tr>
			<tr>
				<td>添加数据(无编号)</td>
				<td>
					<div>
						<form action="EmpServlet?action=add2" method="post">
							员工姓名：<input type="text" name="ename" id="ename"> </br>员工职位：<select name="job">
								<option>--请选择--</option>
								<option value="MANAGER">MANAGER</option>
								<option value="SALESMAN">SALESMAN</option>
								<option value="ANALYST">ANALYST</option>
								<option value="PRESIDENT">PRESIDENT</option>
								<option value="CLERK">CLERK</option>
							</select> </br>领导编号：<input type="text" name="mgr" id="mgr"> </br>入职时间：<input
								type="text" name="hiredate" id="hiredate"> </br>员工工资：<input
								type="text" name="sal" id="sal"> </br>奖励金额：<input type="text"
								name="comm" id="comm"> </br>部门编号：<input type="text"
								name="deptno" id="deptno"> </br>
								 <input type="submit" name="btn2" id="sub-btn2" value="提交">
						</form>
					</div>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>