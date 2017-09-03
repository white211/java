package cn.white.entity;

import java.sql.Timestamp;

public class NoteBook {
    private Integer cn_notebook_id;//笔记本id
    private Integer cn_user_id;//用户id
    private Integer cn_notebook_type_id;//笔记本类型id
    private String cn_notebook_name;//笔记本名称
    private String cn_notebook_desc;//笔记本说明
    private Timestamp cn_notebook_createtime;//笔记本创建日期
	public Integer getCn_notebook_id() {
		return cn_notebook_id;
	}
	public void setCn_notebook_id(Integer cn_notebook_id) {
		this.cn_notebook_id = cn_notebook_id;
	}
	public Integer getCn_user_id() {
		return cn_user_id;
	}
	public void setCn_user_id(Integer cn_user_id) {
		this.cn_user_id = cn_user_id;
	}
	public Integer getCn_notebook_type_id() {
		return cn_notebook_type_id;
	}
	public void setCn_notebook_type_id(Integer cn_notebook_type_id) {
		this.cn_notebook_type_id = cn_notebook_type_id;
	}
	public String getCn_notebook_name() {
		return cn_notebook_name;
	}
	public void setCn_notebook_name(String cn_notebook_name) {
		this.cn_notebook_name = cn_notebook_name;
	}
	public String getCn_notebook_desc() {
		return cn_notebook_desc;
	}
	public void setCn_notebook_desc(String cn_notebook_desc) {
		this.cn_notebook_desc = cn_notebook_desc;
	}
	public Timestamp getCn_notebook_createtime() {
		return cn_notebook_createtime;
	}
	public void setCn_notebook_createtime(Timestamp cn_notebook_createtime) {
		this.cn_notebook_createtime = cn_notebook_createtime;
	}
    
}
