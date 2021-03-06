package xmu.crms.entity;

import java.math.BigInteger;
/**
 * 
* <p>Title: Course.java<／p>
* <p>Description: <／p>
* <p>Copyright: Copyright (c) 2018<／p>
 * @author Jackey
 * @date 2018年1月3日
 */
public class User {
	private BigInteger id;
	private String phone;
	private String wechatId;
	private String openid;
	private String avatar;
	private String password;
	private String name;
	private School school;
	private Integer gender;
	private Integer type;
	private String number;
	private Integer education;
	private Integer title;
	private String email;

	public User(String phone, String password, String name,  Integer gender, Integer type, String number,
			String email) {
		super();
		this.phone = phone;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.type = type;
		this.number = number;
		this.email = email;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String phone, String password) {
		super();
		this.phone = phone;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", phone=" + phone + ", wechatId=" + wechatId + ", openid=" + openid + ", avatar="
				+ avatar + ", password=" + password + ", name=" + name + ", school=" + school + ", gender=" + gender
				+ ", type=" + type + ", number=" + number + ", education=" + education + ", title=" + title + ", email="
				+ email + "]";
	}

	public User(BigInteger id, String phone, String wechatId, String openid, String avatar, String password,
			String name, School school, Integer gender, Integer type, String number, Integer education, Integer title,
			String email) {
		super();
		this.id = id;
		this.phone = phone;
		this.wechatId = wechatId;
		this.openid = openid;
		this.avatar = avatar;
		this.password = password;
		this.name = name;
		this.school = school;
		this.gender = gender;
		this.type = type;
		this.number = number;
		this.education = education;
		this.title = title;
		this.email = email;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWechatId() {
		return wechatId;
	}

	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Integer getEducation() {
		return education;
	}

	public void setEducation(Integer education) {
		this.education = education;
	}

	public Integer getTitle() {
		return title;
	}

	public void setTitle(Integer title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
