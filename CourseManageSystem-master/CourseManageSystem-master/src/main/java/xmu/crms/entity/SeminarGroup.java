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
public class SeminarGroup {
	private BigInteger id;
	private Seminar seminar;
	private ClassInfo classInfo;
	private String report;
	private Integer reportGrade;
	private Integer presentationGrade;
	private Integer finalGrade;
	private User leader;
	private FixGroup fixGroup;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Seminar getSeminar() {
		return seminar;
	}

	public void setSeminar(Seminar seminar) {
		this.seminar = seminar;
	}

	public ClassInfo getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public Integer getReportGrade() {
		return reportGrade;
	}

	public void setReportGrade(Integer reportGrade) {
		this.reportGrade = reportGrade;
	}

	public Integer getPresentationGrade() {
		return presentationGrade;
	}

	public void setPresentationGrade(Integer presentationGrade) {
		this.presentationGrade = presentationGrade;
	}

	public Integer getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(Integer finalGrade) {
		this.finalGrade = finalGrade;
	}

	public User getLeader() {
		return leader;
	}

	public void setLeader(User leader) {
		this.leader = leader;
	}

	public FixGroup getFixGroup() {
		return fixGroup;
	}

	public void setFixGroup(FixGroup fixGroup) {
		this.fixGroup = fixGroup;
	}

	@Override
	public String toString() {
		return "SeminarGroup [id=" + id + ", seminar=" + seminar + ", classInfo=" + classInfo + ", report=" + report
				+ ", reportGrade=" + reportGrade + ", presentationGrade=" + presentationGrade + ", finalGrade="
				+ finalGrade + ", leader=" + leader + ", fixGroup=" + fixGroup + "]";
	}
}
