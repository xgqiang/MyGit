package course.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import course.entity.Course;


@Service
public class CourseService {
	List<Course> courses = new ArrayList<Course>();
	List<Course> selectCourses = new ArrayList<Course>();
	Map<Integer, Course> MapCourses = new HashMap<Integer, Course>();
	Map<Integer, Course> MapSelectCourses = new HashMap<Integer, Course>();
	
	Random rand = new Random(34);
	public CourseService() {
		
	}
	public void saveCourse(Course course) {
		Integer id = (int) -1;
		while (id < 0 ){
			id = rand.nextInt(1000);
		}
		course.setId(id);
		MapCourses.put(id, course);
		courses.add(course);
	}
	public void saveSelectCourse(Integer id) {
		Course selectCourse=MapCourses.get(id);
		MapSelectCourses.put(id, selectCourse);
		selectCourses.add(selectCourse);
	}
	
	public Course findOne(Integer id) {
		return MapCourses.get(id);
	}
	public Course findOneSelect(Integer id) {
		return MapSelectCourses.get(id);
	}
	public void deleteCourse(Integer id) {
		Iterator<Course> sListIterator = courses.iterator();  
		while(sListIterator.hasNext()){  
			Course e = sListIterator.next();  
		    if(e.getId()==id){  
		    sListIterator.remove();  
		    }  
		} 
		MapCourses.remove(id);
	}
	public void deleteSelectCourse(Integer id) {
		Iterator<Course> sListIterator = selectCourses.iterator();  
		while(sListIterator.hasNext()){  
			Course e = sListIterator.next();  
		    if(e.getId()==id){  
		    sListIterator.remove();  
		    }  
		} 
		MapSelectCourses.remove(id);
	}
	//以List形式,获取所有的课程
	public List<Course> getAllCourses(){
		return courses;
	}
	public List<Course> getAllSelectCourses(){
		return selectCourses;
	}
}
