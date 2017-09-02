package cn.white.dao;

import java.util.List;

import cn.white.entity.Emp;

public interface IEmpDao {
      public List<Emp> selectAll();
      
      public Emp selectOne();
      
      public Emp selectByEmpno(int empno);
      
      public void insertEmp(Emp emp);
      
      public void insertEmpAutoId(Emp emp);
      
      public void deleteEmp(int empno);
      
      public void updateEmp(Emp emp);
      
      public int countEmp();
      
      public List<Emp> findEmpByExampleIf(Emp emp);
}
