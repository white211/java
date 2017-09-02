package cn.white.utils;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private MyBatisUtil() {
	}

	static String resouce = "mybatis-config.xml";
	static SqlSessionFactory sessionFactory = null;
	static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();

	static {
		Reader reader = null;

		try {
			reader = Resources.getResourceAsReader(resouce);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			sessionFactory = builder.build(reader);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError("初始化MyBatis错误");
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sessionFactory;
	}

	public static SqlSession getSession() {
		SqlSession session = threadLocal.get();
		// 如果session为空则打开新的session
		if (session == null) {
			session = (sessionFactory != null) ? sessionFactory.openSession() : null;
			threadLocal.set(session);
		}

		return session;
	}

	public static void closeSession() {
		SqlSession session = (SqlSession) threadLocal.get(); // 2
		threadLocal.set(null);
		if (session != null) {
			session.close();
		}
	}
}
