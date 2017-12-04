package course.entity;

public class ClassTime {
	private String week;
	private Integer day;
	private Integer lesson;
	private String site;
	public ClassTime() {
		
	}
	public ClassTime(String week,Integer day,Integer lesson,String site) {
		this.week=week;
		this.day=day;
		this.lesson=lesson;
		this.site=site;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getLesson() {
		return lesson;
	}
	public void setLesson(Integer lesson) {
		this.lesson = lesson;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	
}
