package cn.white.entity;

public class Stu {
	private String sid;
	private String sname;
	private String age;
	private String gender;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Stu [sid=" + sid + ", sname=" + sname + ", age=" + age + ", gender=" + gender + "]";
	}

}
