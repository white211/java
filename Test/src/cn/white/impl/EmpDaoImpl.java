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
	
	//ʵ�ֶ�̬��ѯ
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
	//ִ�и��²���
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
	//ʵ��ɾ������
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
	
	//�Զ������Ĳ���
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

	// �����������
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

	// //������ѯȫ���ķ���
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

	// ��ѯĳ����¼�ķ���
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

	// ��ѯָ����¼�ķ���
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
	// // �൱��ִ��ӳ���ļ��е�select * from emp ���
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
	// // ʵ�ֲ�ѯ������¼
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
	// // �൱��ִ��ӳ���ļ��е�select * from emp ���
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
	// // ��̬���ݲ�ѯ
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
	// // �൱��ִ��ӳ���ļ��е�select * from emp ���
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
