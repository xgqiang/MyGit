package course.entity;

public class User {
	private Integer id;
	private String type;
	private String number;
	private String name;
	private String phone;
	private String email;
	private String gender;
	private String school;
	private String title;
	private String password;
	private String unionId;
	private String avatar;
	public User() {
		
	}
	public User(Integer id,String type,String number,String name,String phone,String email,String gender,String school,
			String title,String password,String unionId,String avatar) {
		this.id=id;
		this.type=type;
		this.number=number;
		this.name=name;
		this.phone=phone;
		this.email=email;
		this.gender=gender;
		this.school=school;
		this.title=title;
		this.password=password;
		this.unionId=unionId;
		this.avatar=avatar;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUnionId() {
		return unionId;
	}
	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
}
