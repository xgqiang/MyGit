package coursemanagesystem.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import coursemanagesystem.entity.ClassInfo;
import coursemanagesystem.entity.Course;
import coursemanagesystem.service.ClassService;
import coursemanagesystem.service.CourseService;
import coursemanagesystem.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class CourseServiceImpl implements CourseService {
	
	/**
	 * 按userId获取与当前用户相关联的课程列表.
	 * <p>老师与他相关联的课程列表<br> 
	 * @author zhouzhongjun
	 * @param userId 用户Id
	 * @return null 课程列表
	 */

	public List<Course> listCourseByUserId(BigInteger userId) {
		return null;
	};	
	
	/**
	 * 按userId创建课程.
	 * @author zhouzhongjun
	 * @param userId 用户Id
	 * @param course 课程信息
	 * @return courseId 新建课程的id
	 */

	public  BigInteger insertCourseByUserId(BigInteger userId,Course course) {
		
		BigInteger courseId = null;
		return  courseId;
	};	
	
	
	/**
	 * 按courseId获取课程 .
	 * @author zhouzhongjun
	 * @param courseId 课程Id
	 * @return course
	 */

	public  Course getCourseByCourseId(BigInteger courseId) {

		Course course=new Course();
		return course;
		
	};	
	
	
	/**
	 * 传入courseId和course信息修改course信息.
	 * @author zhouzhongjun
     * @param courseId 课程Id
	 * @param course 课程信息
	 * @return true修改成功  false修改失败
	 */

	public void updateCourseByCourseId(BigInteger courseId,Course course) {
		
		return true;
		
	};	
	
	/**
	 * 按courseId删除课程.
	 * <p>先根据courseID删除Seminar 和 class,然后再将course的信息删除<br>  
	 * @author zhouzhongjun
     * @param courseId 课程Id
	 *@see SeminarServiceImpl #deleteSemiarByCourseId(BigInteger courseId)
	 *@see ClassServiceImpl   #deleteClassByCourseId(BigInteger courseId)
	 *@return true删除成功  false删除失败
	 */

	public void deleteCourseByCourseId(BigInteger courseId) {
		
		
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

	public List<Course> listCourseByCourseName(String courseName)
	{
		List<Course> list=new ArrayList<Course>();
		return list;
	}
	/**
	 * 按课程名称获取班级列表.
	 * <p>根据课程名获取课程ID，通过课程ID获取班级列表<br>
	 * @author YeXiaona
	 * @param courseName 课程名称
	 * @return list 班级列表
	 * @see CourseService #listCourseByCourseName(String courseName)
	 * @see ClassService #listClassByCourseId(BigInteger courseId)
	 * @exception InfoIllegalException courseId格式错误时抛出
	 * @exception CourseNotFoundException 未找到课程
	 * @exception ClassNotFoundException 未找到班级
	 */
	public List<ClassInfo> listClassByCourseName(String courseName) throws
			InfoIllegalException,CourseNotFoundException,ClassNotFoundException{
		List<ClassInfo> list=new ArrayList<ClassInfo>();
		return list;
	}

	/**
	 * 根据教师名称列出课程名称.
	 * <p>根据教师名称列出课程名称<br>
	 * @author yexiaona
	 * @param teacherName 教师名称
	 * @return list 课程列表
	 * @see UserServiceImpl #listUserByUserName(String userName)
	 * @see CourseServiceImpl #listCourseByUserId(BigInteger userId)
	 */

	public List<Course> listCourseByTeacherName(String teacherName)
	{
		List<Course> list=new ArrayList<Course>();
		return list;
	}
	/**
	 * 按教师名称获取班级列表.
	 * <p>根据教师名称获取课程ID，通过课程ID获取班级列表<br>
	 * @author YeXiaona
	 * @param teacherName 教师名称
	 * @return list 班级列表
	 * @see UserService #listUserIdByUserName(String userName)
	 * @see CourseService #listClassByUserId(BigInteger userId)
	 * @exception UserNotFoundException 未找到用户
	 * @exception CourseNotFoundException 未找到课程
	 * @exception ClassNotFoundException 未找到班级
	 */
	public List<ClassInfo> listClassByTeacherName(String teacherName) throws
			UserNotFoundException,CourseNotFoundException,ClassNotFoundException{
		List<ClassInfo> list=new ArrayList<ClassInfo>();
		return list;
	}
	/**
	 * 根据教师ID获取班级列表.
	 * @author YeXiaona
	 * @param userId 教师ID
	 * @return list 班级列表
	 * @see CourseService #listCourseByUserId(BigInteger userId)
	 * @see ClassService #listClassByCourseId(BigInteger courseId)
	 * @exception InfoIllegalException userId格式错误时抛出或courseId格式错误时抛出
	 * @exception CourseNotFoundException 未找到课程
	 * @exception ClassNotFoundException 未找到班级
	 */
	public List<ClassInfo> listClassByUserId(BigInteger userId)
			throws InfoIllegalException,CourseNotFoundException,
			ClassNotFoundException{
		List<ClassInfo> list=new ArrayList<ClassInfo>();
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
