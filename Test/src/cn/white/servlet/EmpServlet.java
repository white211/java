package cn.white.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.white.dao.IEmpDao;
import cn.white.entity.Emp;
import cn.white.impl.EmpDaoImpl;
/*import javafx.print.Printer;*/

@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String str = request.getParameter("action");
		IEmpDao empdao = new EmpDaoImpl();
        PrintWriter out = response.getWriter();    
		
		if (str.equals("show")) {// 查询全部记录
			List<Emp> list = empdao.selectAll();
			request.setAttribute("list", list);
			request.getRequestDispatcher("infolist.jsp").forward(request, response);
		} else if (str.equals("count")) {// 查询员工总人数
			int count = empdao.countEmp();
			out.print("<script>alert('员工总人数为："+count+"人');window.location.href='index.jsp'</script>");
			
			
//			request.setAttribute("count", count);
//			request.getRequestDispatcher("count.jsp").forward(request, response);
			
			
		} else if (str.equals("modifier")) {// 获取数据到修改界面
			String id = request.getParameter("id");
			int id1 = Integer.parseInt(id.trim());
			Emp emp = new Emp();
			emp = empdao.selectByEmpno(id1);
			request.setAttribute("emp", emp);
			request.getRequestDispatcher("update.jsp").forward(request, response);

		}else if (str.equals("add1")) {
			Emp emp = new Emp();
			emp.setEmpno(Integer.parseInt(request.getParameter("empno").trim()));
			emp.setEmpName(request.getParameter("ename"));
			emp.setHiredate(new Date());
			emp.setJob(request.getParameter("job"));
			emp.setMgr(Integer.parseInt(request.getParameter("mgr").trim()));
			emp.setComm(Double.parseDouble(request.getParameter("comm")));
			emp.setSal(Double.parseDouble(request.getParameter("sal").trim()));
			emp.setDeptno(Integer.parseInt(request.getParameter("deptno").trim()));
			empdao.insertEmp(emp);
//			request.getRequestDispatcher("infolist.jsp").forward(request, response);
			out.print("<script>alert('添加成功');window.location.href='EmpServlet?action=show'</script>");
			
		} else if (str.equals("add2")) {
			Emp emp = new Emp();
			// emp.setEmpno(Integer.parseInt(request.getParameter("empno").trim()));
			emp.setEmpName(request.getParameter("ename"));
			emp.setHiredate(new Date());
			emp.setJob(request.getParameter("job"));
			emp.setMgr(Integer.parseInt(request.getParameter("mgr").trim()));
			emp.setComm(Double.parseDouble(request.getParameter("comm")));
			emp.setSal(Double.parseDouble(request.getParameter("sal").trim()));
			emp.setDeptno(Integer.parseInt(request.getParameter("deptno").trim()));
			empdao.insertEmpAutoId(emp);
//			request.getRequestDispatcher("infolist.jsp").forward(request, response);
			out.print("<script>alert('添加成功');window.location.href='EmpServlet?action=show'</script>");
			
		} else if(str.equals("update")){//执行修改操作
            Emp emp = new Emp();
            emp.setEmpno(Integer.parseInt(request.getParameter("empno").trim()));
            emp.setEmpName(request.getParameter("ename"));
			emp.setHiredate(new Date());
			emp.setJob(request.getParameter("job"));
			emp.setMgr(Integer.parseInt(request.getParameter("mgr").trim()));
			emp.setComm(Double.parseDouble(request.getParameter("comm")));
			emp.setSal(Double.parseDouble(request.getParameter("sal").trim()));
			emp.setDeptno(Integer.parseInt(request.getParameter("deptno").trim()));
			empdao.updateEmp(emp);
			out.print("<script>alert('修改成功');window.location.href='EmpServlet?action=show'</script>");
//			request.getRequestDispatcher("infolist.jsp").forward(request, response);
		}
		else if(str.equals("delete")){
			int empno = Integer.parseInt(request.getParameter("id").trim());
			empdao.deleteEmp(empno);
			
//			request.getRequestDispatcher("index.jsp").forward(request, response);
			out.print("<script>alert('删除成功');window.location.href='EmpServlet?action=show'</script>");
		}
		else if(str.equals("find")){
			String condition = request.getParameter("id");
			List<Emp> list = new ArrayList<Emp>();
			Emp emp = new Emp();
			
			emp.setEmpno(Integer.parseInt(condition.trim()));
//			emp.setEmpName(request.getParameter(condition));
			
			list = empdao.findEmpByExampleIf(emp);
			request.setAttribute("list", list);
			request.getRequestDispatcher("infolist.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
