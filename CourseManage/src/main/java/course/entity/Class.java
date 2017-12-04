package course.entity;

public class Class {
	private Integer id;
	private String name;
	private Integer numStudent;
	private ClassTime timeSite;
	private boolean calling;
	private String roster;
	private Proportion proportions;
	public Class() {
		
	}
	public Class(Integer id,String name,Integer numStudent,ClassTime timeSite,boolean calling,String roster,
			Proportion proportions) {
		this.id=id;
		this.name=name;
		this.numStudent=numStudent;
		this.timeSite=timeSite;
		this.calling=calling;
		this.roster=roster;
		this.proportions=proportions;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumStudent() {
		return numStudent;
	}
	public void setNumStudent(Integer numStudent) {
		this.numStudent = numStudent;
	}
	public ClassTime getTimeSite() {
		return timeSite;
	}
	public void setTimeSite(ClassTime timeSite) {
		this.timeSite = timeSite;
	}
	public boolean isCalling() {
		return calling;
	}
	public void setCalling(boolean calling) {
		this.calling = calling;
	}
	public String getRoster() {
		return roster;
	}
	public void setRoster(String roster) {
		this.roster = roster;
	}
	public Proportion getProportions() {
		return proportions;
	}
	public void setProportions(Proportion proportions) {
		this.proportions = proportions;
	}
	
}
