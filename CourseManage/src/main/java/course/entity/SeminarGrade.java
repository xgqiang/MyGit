package course.entity;

public class SeminarGrade {
	private Integer groupId;
	private Integer presentationGrade;
	private Integer reportGrade;
	public SeminarGrade() {
		
	}
	public SeminarGrade(Integer groupId,Integer presentationGrade,Integer reportGrade) {
		this.groupId=groupId;
		this.presentationGrade=presentationGrade;
		this.reportGrade=reportGrade;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public Integer getPresentationGrade() {
		return presentationGrade;
	}
	public void setPresentationGrade(Integer presentationGrade) {
		this.presentationGrade = presentationGrade;
	}
	public Integer getReportGrade() {
		return reportGrade;
	}
	public void setReportGrade(Integer reportGrade) {
		this.reportGrade = reportGrade;
	}
	
}
