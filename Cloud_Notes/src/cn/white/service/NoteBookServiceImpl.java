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
	 * 参数从前端获取 即用用户名的id
	 */

	public NoteResult findNormalNoteBook(Integer userId) {
		NoteResult noteResult = new NoteResult();
		if (userId == null) {
			noteResult.setStatus(1);// 参数为空
			noteResult.setMsg("参数为空");
			return noteResult;
		} else {
			List<NoteBook> list = notebookDao.findNormalNoteBook(userId);
			noteResult.setStatus(0);// 参数为空
			noteResult.setMsg("查找成功");
			noteResult.setData(list);
			return noteResult;
		}
	}

	/*
	 * 新建一个笔记本
	 */
	public NoteResult saveNoteBook(Integer user_id, String name, String desc, Integer type_id) {
		NoteResult noteResult = new NoteResult();
		NoteBook noteBook = new NoteBook();

		if (name == null) {
			noteResult.setStatus(1);
			noteResult.setMsg("没有输入笔记本名称");
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
			noteResult.setMsg("新建成功");
			return noteResult;
		}
	}

	
	
}
