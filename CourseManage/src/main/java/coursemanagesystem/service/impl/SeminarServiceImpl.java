package coursemanagesystem.service.impl;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import course.bo.GroupBO;
import course.bo.SeminarBO;
import course.bo.TopicBO;
import course.entity.Seminar;
import course.service.SeminarService;



@Service
public class SeminarServiceImpl implements SeminarService{
	
	/**
	 * 按courseId获取Seminar.
	 * @author zhouzhongjun
     * @param courseId 课程Id
     * @return null 讨论课列表
	 */

	public List<SeminarBO> listSeminarByCourseId(BigInteger courseId) {
			
		return null;
	};
	
	
	/**
	 * 按courseId删除Seminar.
	 * <p>先根据CourseId获得所有的seminar的信息，然后根据seminar信息删除相关topic的记录，然后再根据SeminarId删除SeminarGroup表记录,最后再将seminar的信息删除<br>  
	 * @author zhouzhongjun
     * @param courseId 课程Id
	 *@see SeminarServiceImpl #listSemiarByCourseId(BigInteger courseId)
	 *@see TopicService   #deleteTopicBySeminarId(BigInteger seminarId)
	 *@see SeminarGroupService  #deleteSeminarGroupBySeminarId(BigInteger seminarId)
	 * @return true删除成功 false删除失败
	 */

	public boolean deleteSeminarByCourseId(BigInteger courseId) {
			
		//删除自己
		return true;
	};

	/**
	 * 获得学生当前讨论课信息(小程序端获得讨论课信息进行选题分组、签到等).
	 * ＜p＞通过学生用户id和讨论课id获得学生当前的讨论课信息<br>* (此学生是否是队长，当前讨论课是否处于签到状态，当前讨论课是否可以选题，当前讨论课的组队方式).
	 * @author CaoXingmei
	 * @param seminarId 讨论课的id
	 * @param userId 用户的id
	 * @return 当前讨论课的信息
	 * @see SeminarGroupService #getSeminarGroupById(BigInteger userId, BigInteger seminarId)
	 */

	public SeminarBO getMySeminarBySeminarId(BigInteger seminarId,BigInteger userId){
		SeminarBO nowSeminar = new SeminarBO();
		return nowSeminar;
	}
	
	/**
	 * 获得学生相关的某个讨论课的信息.
	 * ＜p＞通过学生用户id和讨论课id获得学生某个讨论课的详细信息<br>* (包括讨论课信息，教师信息).
	 * @author CaoXingmei
	 * @param seminarId 讨论课的id
	 * @param userId 学生的id
	 * @return 相应的讨论课的详细信息
	 * 
	 */

	public SeminarBO getSeminarDetailBySeminarId(BigInteger seminarId,BigInteger userId){
		
		SeminarBO nowSeminar = new SeminarBO();
		return nowSeminar;
	}
	
	/**
	 * 用户通过讨论课id获得讨论课的信息.
	 * ＜p＞用户通过讨论课id获得讨论课的信息（包括讨论课名称、讨论课描述、分组方式、开始时间、结束时间）<br>*.
	 * @author CaoXingmei
	 * @param seminarId 讨论课的id
	 * @return 相应的讨论课信息
	 */

	public SeminarBO getSeminarBySeminarId(BigInteger seminarId){
		SeminarBO seminar = new SeminarBO();
		return seminar;
	}
	
	/**
	 * 按讨论课id修改讨论课.
	 * ＜p＞用户（老师）通过seminarId修改讨论课的相关信息<br>*.
	 * @author CaoXingmei
	 * @param seminarId 讨论课的id
	 * @param seminar 讨论课信息
	 * @return true(修改成功), false(修改失败)
	 */

	public boolean updateSeminarBySeminarId(BigInteger seminarId, SeminarBO seminar){
		return true;
	}
	
	/**
	 * 按讨论课id删除讨论课.
	 * ＜p＞用户（老师）通过seminarId删除讨论课<br>* (包括删除讨论课包含的topic信息和小组信息).
	 * @author CaoXingmei
	 * @param seminarId 讨论课的id
	 * @return true(删除成功), false(删除失败)
	 * @see SeminarGroupService #deleteSeminarGroupBySeminarId(BigInteger seminarId)
	 * @see TopicService#deleteTopicBySeminarId(BigInteger seminarId)
	 */

	public boolean deleteSeminarBySeminarId(BigInteger seminarId){
		List<TopicBO> topicList = new ArrayList<TopicBO>();
		List<GroupBO> groupList = new ArrayList<GroupBO>();
		return true;
	}
	
	/**
	 * 新增讨论课.
	 * ＜p＞用户（老师）在指定的课程下创建讨论课<br>*
	 * @author YeHongjie
	 * @param courseId 课程的id
	 * @param seminarBO 讨论课信息
	 * @return seminarId 若创建成功返回创建的讨论课id，失败则返回-1
	 */

	public BigInteger insertSeminarByCourseId(BigInteger courseId, SeminarBO seminarBO)
	{
		
		BigInteger seminarId=BigInteger.valueOf(-1);
		return seminarId;
	}

        /**
	 * 根据讨论课Id获得属于该讨论课的所有小组信息
	 * @param seminarId 讨论课的id
	 * @return null 所有group的信息
	 */

	public List<GroupBO> listGroupBySeminarId(BigInteger seminarId)  {
        List<GroupBO> list;
		//list = GroupDao.listGroupBySeminarId(BigInteger seminarId);
		return null;
	}


        /**
	 * 根据话题Id获得选择该话题的所有小组的信息
	 * @param  topicId(话题的id)
	 * @return  null 所有选择该话题的所有group的信息
	 */

	public List<GroupBO> listGroupByTopicId(BigInteger topicId) {
        List<GroupBO> list;
		//list = GroupDao. listGroupByTopicId(BigInteger topicId);
		return null;
	}

        /**
     * 根据讨论课Id及用户id，获得该用户所在的讨论课的小组的信息
     * @param seminarId (讨论课的id)
     * @param userId（用户的id）
     * @return null Group的相关信息
     */

	public GroupBO getSeminarGroupById(BigInteger seminarId,BigInteger userId){
          GroupBO groupBO;
          ResultSet rs;
          //rs = GroupDao.listGroupBySeminarId(BigInteger seminarId);
          //for groupBO in rs
          //   if (GroupDao.(groupBO,userId)) //如果该用户在该小组中，则直接返回此小组的信息
          //          return groupBO;
          return null;   //如果该用户不在该讨论课的任何小组中返回空
    };


    /**
     * 方法简介
     * <p>根据groupId修改group<br>
     * @author aixing
     * @param groupId 要修改的group的Id
     * @param group 新的group信息
     * @return bi
     */

    public BigInteger updateSeminarGroupById(BigInteger groupId,GroupBO group){
        BigInteger bi=null;
        //修改此group
        return bi;
    }


    /**
	 * 自动分组.
	 * ＜p＞根据讨论课id和班级id，对签到的学生进行自动分组<br>*
	 * @author YeHongjie
	 * @param seminarId 讨论课的id
	 * @param classId 班级的id
	 * @return Boolean 自动分组成功返回true，否则返回false
	 */

    public boolean automaticallyGrouping(BigInteger seminarId,BigInteger classId)
    {
    	Boolean groupingState=Boolean.valueOf(false);
    	return groupingState;
    }
     
    /**
	 * 将学生加入小组.
	 * ＜p＞将用户加入指定的小组<br>*
	 * @author YeHongjie
	 * @param userId 学生的id
	 * @param groupId 要加入小组的id
	 * @return BigInteger 若创建成功返回该条记录的id，失败则返回-1
	 */

    public BigInteger insertStudnetIntoGroup(BigInteger userId,BigInteger groupId)
    {
    	BigInteger recordId = BigInteger.valueOf(-1);
    	return recordId;
    }

    /**
	 * 小组按id选择话题.
	 * <p>小组通过小组id和话题id选择讨论课的话题<br>
	 * @author heqi
	 * @param groupId 小组id
	 * @param topicId 话题id
	 * @return String 返回一个url
	 */

    public String insertTopicByGroupId(BigInteger groupId, BigInteger topicId){
		//TopicDao.insertTopicByGroupId(BigInteger groupId, BigInteger topicId)
		String url = null;
		return url;
	}

	
	/*List<Seminar> seminars = new ArrayList<Seminar>();
	Map<Integer, Seminar> Mapseminars = new HashMap<Integer, Seminar>();
	Random rand = new Random(38);
	public SeminarService() {
		
	}
	public void saveSeminar(Seminar seminar) {
		Integer id = -1;
		while (id < 0 ){
			id = rand.nextInt(1000);
		}
		seminar.setId(id);
		Mapseminars.put(id, seminar);
		seminars.add(seminar);
	}
	public Seminar findOne(Integer id) {
		return Mapseminars.get(id);
	}
	//以List形式,获取所有的课程
	public List<Seminar> getAllSeminars(){
		return seminars;
	}*/
}
