package cn.white.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.white.entity.NoteBook;
import cn.white.entity.User;
import cn.white.service.NoteBookService;
import cn.white.util.NoteResult;

@Controller
public class NoteBookController {
    
	@Resource(name = "notebookService")
	private NoteBookService notebookService;
   /*
    * 查找笔记本
    */
	@RequestMapping("/notebook/findNormal.do")
	@ResponseBody
	public NoteResult findNormal(Integer userId) {
		NoteResult noteResult = new NoteResult();
		noteResult = notebookService.findNormalNoteBook(userId);
		return noteResult;
	}
	
	/*
	 * 新建一个笔记本
	 */
	@RequestMapping("/notebook/saveNoteBook.do")
	@ResponseBody
	public NoteResult saveNoteBook(Integer user_id, String name, String desc, Integer type_id) {
		NoteResult noteResult = new NoteResult();
		noteResult = notebookService.saveNoteBook(user_id, name, desc, type_id);
		return noteResult;
	}
	
}










