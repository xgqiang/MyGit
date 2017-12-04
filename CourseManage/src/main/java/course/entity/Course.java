package course.entity;

public class Course {
	private Integer id;
	private User teacher;
	private String name;
	private Integer numClass;
	private Integer numStudent;
	private String startTime;
	private String endTime;
	private String description;
	private Proportion proportions;
	public Course() {
		
	}
	public Course(Integer id,User teacher,String name,Integer numClass,Integer numStudent,String startTime,String endTime,
			String description,Proportion proportions) {
		this.id=id;
		this.teacher=teacher;
		this.name=name;
		this.numClass=numClass;
		this.numStudent=numStudent;
		this.startTime=startTime;
		this.endTime=endTime;
		this.description=description;
		this.proportions=proportions;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getTeacher() {
		return teacher;
	}
	public void setTeacher(User teacher) {
		this.teacher = teacher;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumClass() {
		return numClass;
	}
	public void setNumClass(Integer numClass) {
		this.numClass = numClass;
	}
	public Integer getNumStudent() {
		return numStudent;
	}
	public void setNumStudent(Integer numStudent) {
		this.numStudent = numStudent;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Proportion getProportions() {
		return proportions;
	}
	public void setProportions(Proportion proportions) {
		this.proportions = proportions;
	}
	
	
}
