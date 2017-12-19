package coursemanagesystem.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import course.bo.CourseBO;
import course.entity.Course;
import course.service.CourseService;


@Service
public class CourseServiceImpl implements CourseService{
	
	/**
	 * 按userId获取与当前用户相关联的课程列表.
	 * <p>老师与他相关联的课程列表<br> 
	 * @author zhouzhongjun
	 * @param userId 用户Id
	 * @return null 课程列表
	 */

	public List<CourseBO> listCourseByUserId(BigInteger userId) {
		return null;
	};	
	
	/**
	 * 按userId创建课程.
	 * @author zhouzhongjun
	 * @param userId 用户Id
	 * @param course 课程信息
	 * @return courseId 新建课程的id
	 */

	public  BigInteger insertCourseByUserId(BigInteger userId,CourseBO course) {
		
		BigInteger courseId = null;
		return  courseId;
	};	
	
	
	/**
	 * 按courseId获取课程 .
	 * @author zhouzhongjun
	 * @param courseId 课程Id
	 * @return course
	 */

	public  CourseBO getCourseByCourseId(BigInteger courseId) {
		
		CourseBO course=new CourseBO();
		return course;
		
	};	
	
	
	/**
	 * 传入courseId和course信息修改course信息.
	 * @author zhouzhongjun
     * @param courseId 课程Id
	 * @param course 课程信息
	 * @return true修改成功  false修改失败
	 */

	public boolean updateCourseByCourseId(BigInteger courseId,CourseBO course) {
		
		return true;
		
	};	
	
	/**
	 * 按courseId删除课程.
	 * <p>先根据courseID删除Seminar 和 class,然后再将course的信息删除<br>  
	 * @author zhouzhongjun
     * @param courseId 课程Id
	 *@see SeminarService #deleteSemiarByCourseId(BigInteger courseId)
	 *@see ClassService   #deleteClassByCourseId(BigInteger courseId)
	 *@return true删除成功  false删除失败
	 */

	public boolean deleteCourseByCourseId(BigInteger courseId) {
		
		
		//删除自己
		return true;
	};
	

	
	/**
	 * 根据课程名称获取课程列表.
	 * <p>根据课程名称获取课程列表<br>
	 * @author yexiaona
	 * @param courseName 课程名称
	 * @return list 课程列表
	 * @see CourseServiceImpl #listCourseByCourseName(String courseName)
	 * @see CourseServiceImpl #getCourseByCourseId(BigInteger courseId)
	 */

	public List<CourseBO> listCourseByCourseName(String courseName)
	{
		List<CourseBO> list=new ArrayList<CourseBO>();
		return list;
	}
	
	/**
	 * 根据教师名称列出课程名称.
	 * <p>根据教师名称列出课程名称<br>
	 * @author yexiaona
	 * @param teacherName 教师名称
	 * @return list 课程列表
	 * @see UserService #listUserByUserName(String userName)
	 * @see CourseServiceImpl #listCourseByUserId(BigInteger userId)
	 */

	public List<CourseBO> listCourseByTeacherName(String teacherName)
	{
		List<CourseBO> list=new ArrayList<CourseBO>();
		return list;
	}
	
	/*List<Course> courses = new ArrayList<Course>();
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
	}*/
}
