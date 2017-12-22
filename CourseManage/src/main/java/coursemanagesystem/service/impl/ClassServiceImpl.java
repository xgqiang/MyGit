package coursemanagesystem.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
/*import java.util.HashMap;
import java.util.Iterator;*/
import java.util.List;

import coursemanagesystem.entity.ClassInfo;
import coursemanagesystem.service.ClassService;
import org.springframework.stereotype.Service;



@Service
public class ClassServiceImpl implements ClassService {
	
	/**
	 * 按classId删除CourseSelection表的一条记录 .
	 * @author zhouzhongjun
     * @param classId 班级Id
     * @return true/false 是否成功删除
	 */
	public void deleteClassSelectionByClassId(BigInteger classId){
		return false;
	}
	/**
	 * 按课程名称和教师名称获取班级列表.
	 * <p>根据课程名和教师名获取课程ID，通过课程ID获取班级列表;若课程名和班级名均不为空，取交集<br>
	 * @author yexiaona
	 * @param courseName 课程名称
	 * @param teacherName 教师名称
	 * @return List 班级列表
	 * @see ClassServiceImpl #listClassByCourseName(String courseName)
	 * @see ClassServiceImpl #listClassByTeacherName(String teacherName)
	 */

	public List<ClassInfo> listClassByName(String courseName, String teacherName){
		List<ClassInfo> list=new ArrayList<ClassInfo>();
		return list;
	}
	
	/**
	 * 按课程名称获取班级列表.
	 * <p>根据课程名获取课程ID，通过课程ID获取班级列表<br>
	 * @author yexiaona
	 * @param courseName 课程名称
	 * @return list 班级列表
	 * @see CourseService #listCourseByCourseName(String courseName)
	 * @see ClassServiceImpl #listClassByCourseId(BigInteger courseId)
	 */

	public List<ClassInfo> listClassByCourseName(String courseName)
	{
		List<ClassInfo> list=new ArrayList<ClassInfo>();
		return list;
	}
	
	/**
	 * 按教师名称获取班级列表.
	 * <p>根据教师名称获取课程ID，通过课程ID获取班级列表<br>
	 * @author yexiaona
	 * @param teacherName 教师名称
	 * @return list 班级列表
	 * @see CourseService #listCourseByTeacherName(String teacherName)
	 * @see ClassServiceImpl #listClassByCourseId(BigInteger courseId)
	 */

	public List<ClassInfo> listClassByTeacherName(String teacherName)
	{
		List<ClassInfo> list=new ArrayList<ClassInfo>();
		return list;
	}
	
	/**
	 * 根据教师ID获取班级列表.
	 * @author yexiaona
	 * @param userId 教师ID
	 * @return list 班级列表
	 * @see CourseService #listCourseByUserId(BigInteger userId)
	 */

	public List<ClassInfo> listClassByUserId(BigInteger userId)
	{
		List<ClassInfo> list=new ArrayList<ClassInfo>();
		return list;
	}
	
	/**
	 * 根据课程ID获得班级列表.
	 * @author yexiaona
	 * @param courseId 课程ID
	 * @return list 班级列表
	 */

	public List<ClassInfo> listClassByCourseId(BigInteger courseId)
	{
		List<ClassInfo> list=new ArrayList<ClassInfo>();
		return list;
	}
	
	/**
	 * 按班级id获取班级详情.
	 * <p>根据班级id获取班级<br>
	 * @author yexiaona
	 * @param classId 班级ID
	 * @return ClassBO 班级
	 */

	public ClassInfo getClassByClassId(BigInteger classId)
	{
		ClassInfo classBo=new ClassInfo();
		return classBo;
	}
	
	/**
	 * 按班级id和班级修改班级信息.
	 * <p>根据班级id修改班级信息<br>
	 * @author yexiaona
	 * @param classId 班级ID
	 * @return boolean 班级修改是否成功情况
	 * @see ScoreRuleService #updateScoreRuleById(BigInteger scoreRuleId)
	 */

	public void updateClassByClassId(BigInteger classId)
	{
		return false;
	}
	
	/**
	 * 按班级id删除班级.
	 * <p>根据班级id删除班级<br>
	 * @author yexiaona
	 * @param classId 班级ID
	 * @return boolean 班级删除是否成功情况
	 * @see ScoreRuleService #deleteScoreRuleById(BigInteger scoreRuleId)
	 * @see ClassServiceImpl #deleteCourseSelectionById(BigInteger classId,User user)
	 * @see FixGroupService #deleteFixGroupByClassId(BigInteger classId)
	 * @see SeminarGroupService #deleteSeminarGroupByClaaId(BigInteger classId)
	 */

	public void deleteClassByClassId(BigInteger classId)
	{
		boolean isDeleted=false;
		return isDeleted;
	}
	
	/**
	 * 学生按班级id选择班级.
	 * <p>根据班级id和用户id新增选课记录<br>
	 * @author yexiaona
	 * @param userId 用户id
	 * @param classId 班级id
	 * @return url 选课url
	 */

	public String insertCourseSelectionById(BigInteger userId,BigInteger classId)
	{
		String url=new String();
		return url;
	}
	
	/**
	 * 学生按班级id取消选择班级.
	 * <p>根据班级id和用户id删除选课记录及与该班级相关的信息<br>
	 * @author yexiaona
	 * @param userId 用户id
	 * @param classId 班级id
	 * @return boolean 取消班级是否成功
	 */

	public void deleteCourseSelectionById(BigInteger userId,BigInteger classId)
	{
		boolean isDeleted=true;
		return isDeleted;
	}
	
	/**
	 * 老师获取该班级签到、分组状态.
	 * <p>根据讨论课id及班级id，获得该班级的签到、分组状态<br>
	 * @author yexiaona
	 * @param seminarId 讨论课id
	 * @return classBO 班级
	 * @see SeminarGroupService #listSeminarGroupBySeminarId(BigInteger seminarId)
	 */

	public ClassInfo getCallGroupStatusById(BigInteger seminarId)
	{
		ClassInfo classBO=new ClassInfo();
		return classBO;
	}
	
	/**
	 * 新建班级.
	 * <p>根据教师id和课程id新建班级<br>
	 * @author yexiaona
	 * @param userId 教师id
	 * @param courseId 课程id
	 * @return classBO 班级
	 * @see ClassServiceImpl #insertCourseSelectionById(BigInteger userId,BigInteger classId)
	 */

	public BigInteger insertClassById(BigInteger userId,BigInteger courseId)
	{
		ClassInfo classBO=new ClassInfo();
		return classBO.getId();
	}
	
	/**
	 * 按courseId删除Class.
	 * <p>先根据CourseId获得所有的class的信息，然后根据class信息删除courseSelection表的记录，然后再根据courseId和classId删除ScoureRule表记录，再调用根据classId删除固定分组，最后再将班级的信息删除<br>  
	 * @author zhouzhongjun
     * @param courseId 课程Id
	 *@see ClassServiceImpl  #listClassByCourseId(BigInteger courseId)
	 *@see ClassServiceImpl   #deleteClasssSelectionByClassId(BigInteger classId)
	 *@see ScoreRuleService  #deleteScoreRuleById(BigInteger CourseId,BigInteger ClassId)
	 *@see FixGroupService  #deleteFixGroupByClassId(BigInteger ClassId)
	 *@return true删除成功 false删除失败
	 */

	public void deleteClassByCourseId(BigInteger courseId) {
			
		//删除自己
		return true;
	}

	@Override
	public void deleteScoreRuleById(BigInteger classId) {
		return null;
	}

	@Override
	public ClassInfo getScoreRule(BigInteger classId) {
		return null;
	}

	@Override
	public BigInteger insertScoreRule(BigInteger classId, ClassInfo proportions) {
		return null;
	}

	@Override
	public void updateScoreRule(BigInteger classId, ClassInfo proportions) {
		return null;
	}

	;
	
	
	
	/*List<Class> classes = new ArrayList<Class>();
	Map<Integer, Class> Mapclasses = new HashMap<Integer, Class>();
	Random rand = new Random(32);
	public ClassService() {
		
	}
	public void saveClass(Class aclass) {
		Integer id = (int) -1;
		while (id < 0 ){
			id = rand.nextInt(1000);
		}
		aclass.setId(id);
		Mapclasses.put(id, aclass);
		classes.add(aclass);
	}
	public Class findOne(Integer id) {
		return Mapclasses.get(id);
	}
	//以List形式,获取所有的课程
	public void deleteClass(Integer id) {
		Mapclasses.remove(id);
		Iterator<Class> sListIterator = classes.iterator();  
		while(sListIterator.hasNext()){  
			Class e = sListIterator.next();  
		    if(e.getId()==id){  
		    sListIterator.remove();  
		    }  
		}
	}
	public List<Class> getAllClasses(){
		return classes;
	}*/
}
