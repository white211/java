package cn.white.service;

import java.util.List;

import cn.white.entity.NoteBook;
import cn.white.util.NoteResult;

public interface NoteBookService {
    public NoteResult findNormalNoteBook(Integer userId);//��ѯ�û����еıʼǱ�
    
    public NoteResult saveNoteBook( Integer user_id, String name, String desc, Integer type_id);
    
}
