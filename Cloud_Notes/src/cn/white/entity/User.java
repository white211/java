package cn.white.entity;

public class User {// �����洢�û���Ϣ��ʵ����
	private Integer cn_user_id;// �û�id
	private String cn_user_name;// �û�����
	private String cn_user_password;// �û�����
	private String cn_user_desc;// ˵��

	public Integer getCn_user_id() {
		return cn_user_id;
	}

	public void setCn_user_id(Integer cn_user_id) {
		this.cn_user_id = cn_user_id;
	}

	public String getCn_user_name() {
		return cn_user_name;
	}

	public void setCn_user_name(String cn_user_name) {
		this.cn_user_name = cn_user_name;
	}

	public String getCn_user_password() {
		return cn_user_password;
	}

	public void setCn_user_password(String cn_user_password) {
		this.cn_user_password = cn_user_password;
	}

	public String getCn_user_desc() {
		return cn_user_desc;
	}

	public void setCn_user_desc(String cn_user_desc) {
		this.cn_user_desc = cn_user_desc;
	}

}
