package course.entity;

public class Seminar {
	private Integer id;
	private String name;
	private String description;
	private String groupingMethod;
	private String startTime;
	private String endTime;
	private Proportion proportions;
	public Seminar() {
		
	}
	public Seminar(Integer id,String name,String description,String groupingMethod,String startTime,String endTime,
			Proportion proportions) {
		this.id=id;
		this.name=name;
		this.description=description;
		this.groupingMethod=groupingMethod;
		this.startTime=startTime;
		this.endTime=endTime;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGroupingMethod() {
		return groupingMethod;
	}
	public void setGroupingMethod(String groupingMethod) {
		this.groupingMethod = groupingMethod;
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
	public Proportion getProportions() {
		return proportions;
	}
	public void setProportions(Proportion proportions) {
		this.proportions = proportions;
	}
	
}
