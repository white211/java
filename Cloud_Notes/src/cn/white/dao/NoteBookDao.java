package cn.white.dao;

import java.util.List;
import cn.white.entity.NoteBook;

public interface NoteBookDao {
      public List<NoteBook> findNormalNoteBook(Integer userId);//��ѯ��ͨ�ʼǱ�
       
      public void saveNoteBook(NoteBook  notebook);//�½�һ���ʼǱ�
      
}
