package course.entity;

public class Proportion {
	private Integer c;
	private Integer b;
	private Integer a;
	private Integer report;
	private Integer presentation;
	public Proportion() {
		
	}
	public Proportion(Integer c,Integer b,Integer a,Integer report,Integer presentation) {
		this.c=c;
		this.b=b;
		this.a=a;
		this.report=report;
		this.presentation=presentation;
	}
	public Integer getC() {
		return c;
	}
	public void setC(Integer c) {
		this.c = c;
	}
	public Integer getB() {
		return b;
	}
	public void setB(Integer b) {
		this.b = b;
	}
	public Integer getA() {
		return a;
	}
	public void setA(Integer a) {
		this.a = a;
	}
	public Integer getReport() {
		return report;
	}
	public void setReport(Integer report) {
		this.report = report;
	}
	public Integer getPresentation() {
		return presentation;
	}
	public void setPresentation(Integer presentation) {
		this.presentation = presentation;
	}
	
	
	
}
