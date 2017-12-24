package service.test;

import coursemanagesystem.Application;
import coursemanagesystem.entity.SeminarGroup;
import coursemanagesystem.mapper.SeminarGroupMapper;
import coursemanagesystem.service.impl.SeminarGroupServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;
import java.util.List;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.mockito.Mockito.mock;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SeminarGroupServiceTest {

    @Autowired
    private SeminarGroupServiceImpl seminarGroupService;
    @Test
    public void testDeleteSeminarGroupMemberBySeminarGroupId(){
        BigInteger seminarGroupId=new BigInteger("3");
        seminarGroupService.deleteSeminarGroupByGroupId(seminarGroupId);
    }
    @Test
    public void testGetSeminarGroupLeaderByGroupId(){
        try{
            BigInteger groupId=new BigInteger("1");
            BigInteger leaderId=seminarGroupService.getSeminarGroupLeaderByGroupId(groupId);
            assertNotNull(leaderId);
            System.out.println("leaderId="+leaderId);
        }
        catch (Exception e){

        }

    }
    @Test
    public void testListSeminarGroupIdByStudentId(){
        try{
            BigInteger userId=new BigInteger("1");
            List<SeminarGroup> list1=seminarGroupService.listSeminarGroupIdByStudentId(userId);
            assertNotNull(list1);
            System.out.println("list1-size为"+list1.size());
        }
        catch (Exception e){

        }
    }

    @Test
    public void testInsertSeminarGroupMemberById(){
        try{
            BigInteger userId=new BigInteger("111");
            BigInteger groupId=new BigInteger("111");
            BigInteger seminarGroupMemberId=seminarGroupService.insertSeminarGroupMemberById(userId,groupId);
            assertNotNull(seminarGroupMemberId);
            System.out.println("seminarGroupMemberId="+seminarGroupMemberId);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testDeleteSeminarGroupBySeminarId(){
        try{
            BigInteger seminarId=new BigInteger("2");
            seminarGroupService.deleteSeminarGroupBySeminarId(seminarId);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


}
