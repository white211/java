package cn.white.dao;

import java.util.List;

import cn.white.entity.Stu;

public interface IStuDao {
    public List<Stu> selectAll();
    public Stu selectOne();
    public Stu selectBySid(String sid);
}
