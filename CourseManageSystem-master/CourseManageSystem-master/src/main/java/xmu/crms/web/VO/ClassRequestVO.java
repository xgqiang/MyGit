package xmu.crms.web.VO;

import java.math.BigInteger;

public class ClassRequestVO {
	private BigInteger id;
	
	private Integer numStudent;

	private String name;

	private String time;

	private String site;

	private Integer calling;

	private String roster;

	private Proportion proportions;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Integer getCalling() {
		return calling;
	}

	public void setCalling(Integer calling) {
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

	public ClassRequestVO() {
		super();
	}

	public ClassRequestVO(BigInteger id, String name, Integer numStudent, String time, String site, Integer calling,
			String roster, Proportion proportions) {
		super();
		this.id = id;
		this.name = name;
		this.numStudent = numStudent;
		this.time = time;
		this.site = site;
		this.calling = calling;
		this.roster = roster;
		this.proportions = proportions;
	}

	@Override
	public String toString() {
		return "ClassRequestVO [id=" + id + ", name=" + name + ", numStudent=" + numStudent + ", time=" + time
				+ ", site=" + site + ", calling=" + calling + ", roster=" + roster + ", proportions=" + proportions
				+ "]";
	}

}