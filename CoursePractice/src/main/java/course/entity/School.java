package course.entity;

import java.io.Serializable;

public class School implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String province;
	private String city;
	public School() {
		super();
	}
	public School(Integer id,String name,String province,String city) {
		super();
		this.id=id;
		this.name=name;
		this.province=province;
		this.city=city;
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
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	 @Override
	public String toString() {
	        // TODO Auto-generated method stub
	        return "id " + this.id + ", name " + this.name + ",province " + this.province+ ",city " + this.city;
	}
}
