package cn.white.impl;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.swing.plaf.multi.MultiButtonUI;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.white.utils.MyBatisUtil;
import cn.white.dao.IEmpDao;
import cn.white.entity.Emp;

public class EmpDaoImpl implements IEmpDao {
	
	//实现动态查询
	public List<Emp> findEmpByExampleIf(Emp emp) {
		SqlSession session = MyBatisUtil.getSession();
		List<Emp> list = new ArrayList<Emp>();
		try {
			list = session.selectList("cn.white.dao.IEmpDao.findEmpByExampleIf",emp);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession();
		}
		return list;
	}

	public int countEmp() {
		SqlSession session = MyBatisUtil.getSession();
		int count = 0;
		try {
			count = session.selectOne("cn.white.dao.IEmpDao.countEmp");
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession();
		}
		return count;
	}
	//执行更新操作
	public void updateEmp(Emp emp) {
		SqlSession session = MyBatisUtil.getSession();
		try {
			session.update("cn.white.dao.IEmpDao.updateEmp", emp);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession();
		}
	}
	//实现删除操作
	public void deleteEmp(int empno) {
		SqlSession session = MyBatisUtil.getSession();
		try {
			session.insert("cn.white.dao.IEmpDao.deleteEmp", empno);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession();
		}
	}
	
	//自动增长的插入
	public void insertEmpAutoId(Emp emp) {
		SqlSession session = MyBatisUtil.getSession();
		try {
			session.insert("cn.white.dao.IEmpDao.insertEmpAutoId", emp);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession();
		}
	}

	// 创建插入操作
	public void insertEmp(Emp emp) {
		SqlSession session = MyBatisUtil.getSession();
		try {
			session.insert("cn.white.dao.IEmpDao.insertEmp", emp);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession();
		}
	}

	// //创建查询全部的方法
	public List<Emp> selectAll() {
		SqlSession session = MyBatisUtil.getSession();
		List<Emp> list = new ArrayList<Emp>();
		try {
			list = session.selectList("cn.white.dao.IEmpDao.selectAll");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			MyBatisUtil.closeSession();
		}

		return list;
	}

	// 查询某条记录的方法
	public Emp selectOne() {
		SqlSession session = MyBatisUtil.getSession();
		Emp emp = null;
		try {
			emp = session.selectOne("cn.white.dao.IEmpDao.selectOne");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession();
		}
		return emp;
	}

	// 查询指定记录的方法
	public Emp selectByEmpno(int empno) {
		SqlSession session = MyBatisUtil.getSession();
		Emp emp = null;
		try {
			emp = session.selectOne("cn.white.dao.IEmpDao.selectByEmpno", empno);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession();
		}

		return emp;
	}


	

	// public List<Emp> selectAll() {
	// String resource = "mybatis-config.xml";
	// Reader reader = null;
	// SqlSessionFactory factory = null;
	// SqlSession session = null;
	// List<Emp> list = new ArrayList<Emp>();
	// try {
	// reader = Resources.getResourceAsReader(resource);
	// SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
	// factory = builder.build(reader);
	// session = factory.openSession();
	// // 相当于执行映射文件中的select * from emp 语句
	// list = session.selectList("cn.white.dao.IEmpDao.selectAll");
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// } finally {
	// session.close();
	// }
	// return list;
	// }
	//
	// // 实现查询单个记录
	// @Override
	// public Emp selectOne() {
	// String resource = "mybatis-config.xml";
	// Reader reader = null;
	// SqlSessionFactory factory = null;
	// SqlSession session = null;
	// Emp emp = new Emp();
	// // List<Emp> list = new ArrayList<Emp>();
	// try {
	// reader = Resources.getResourceAsReader(resource);
	// SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
	// factory = builder.build(reader);
	// session = factory.openSession();
	// // 相当于执行映射文件中的select * from emp 语句
	// emp = session.selectOne("cn.white.dao.IEmpDao.selectOne");
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// } finally {
	// session.close();
	// }
	// return emp;
	// }
	//
	// // 动态根据查询
	// @Override
	// public Emp selectByEmpno(int empno) {
	// String resource = "mybatis-config.xml";
	// Reader reader = null;
	// SqlSessionFactory factory = null;
	// SqlSession session = null;
	// Emp emp = new Emp();
	// // List<Emp> list = new ArrayList<Emp>();
	// try {
	// reader = Resources.getResourceAsReader(resource);
	// SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
	// factory = builder.build(reader);
	// session = factory.openSession();
	// // 相当于执行映射文件中的select * from emp 语句
	// emp = session.selectOne("cn.white.dao.IEmpDao.selectByEmpno",empno);
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// } finally {
	// session.close();
	// }
	// return emp;
	// }

}
