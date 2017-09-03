package cn.white.service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.white.dao.NoteBookDao;
import cn.white.entity.NoteBook;
import cn.white.util.NoteResult;

@Service(value = "notebookService")
public class NoteBookServiceImpl implements NoteBookService {

	@Autowired
	private NoteBookDao notebookDao;
	/*
	 * ������ǰ�˻�ȡ �����û�����id
	 */

	public NoteResult findNormalNoteBook(Integer userId) {
		NoteResult noteResult = new NoteResult();
		if (userId == null) {
			noteResult.setStatus(1);// ����Ϊ��
			noteResult.setMsg("����Ϊ��");
			return noteResult;
		} else {
			List<NoteBook> list = notebookDao.findNormalNoteBook(userId);
			noteResult.setStatus(0);// ����Ϊ��
			noteResult.setMsg("���ҳɹ�");
			noteResult.setData(list);
			return noteResult;
		}
	}

	/*
	 * �½�һ���ʼǱ�
	 */
	public NoteResult saveNoteBook(Integer user_id, String name, String desc, Integer type_id) {
		NoteResult noteResult = new NoteResult();
		NoteBook noteBook = new NoteBook();

		if (name == null) {
			noteResult.setStatus(1);
			noteResult.setMsg("û������ʼǱ�����");
			return noteResult;
		} else {
			Timestamp createtime = new Timestamp(System.currentTimeMillis());
			noteBook.setCn_user_id(user_id);
			noteBook.setCn_notebook_name(name);
			noteBook.setCn_notebook_desc(desc);
			noteBook.setCn_notebook_type_id(type_id);
			noteBook.setCn_notebook_createtime(createtime);
			notebookDao.saveNoteBook(noteBook);
			noteResult.setStatus(0);
			noteResult.setMsg("�½��ɹ�");
			return noteResult;
		}
	}

	
	
}
