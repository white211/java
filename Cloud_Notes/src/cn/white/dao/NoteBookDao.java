package cn.white.dao;

import java.util.List;
import cn.white.entity.NoteBook;

public interface NoteBookDao {
      public List<NoteBook> findNormalNoteBook(Integer userId);//查询普通笔记本
       
      public void saveNoteBook(NoteBook  notebook);//新建一个笔记本
      
}
