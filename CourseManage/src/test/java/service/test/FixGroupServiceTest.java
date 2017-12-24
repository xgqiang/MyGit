package service.test;

import coursemanagesystem.Application;
import coursemanagesystem.service.impl.FixGroupServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class FixGroupServiceTest {
    @Autowired
    private FixGroupServiceImpl fixGroupService;
    @Test
    public void testInsertFixGroupByClassId(){
        try{
            BigInteger userId=new BigInteger("112");
            BigInteger classId=new BigInteger("15");
            BigInteger fixGroupId=fixGroupService.insertFixGroupByClassId(classId,userId);
            assertNotNull(fixGroupId);
            System.out.println("fixGroupId="+fixGroupId);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertStudnetIntoGroup(){
        try{
            BigInteger userId=new BigInteger("113");
            BigInteger groupId=new BigInteger("27");
            BigInteger fixGroupMemberId=fixGroupService.insertStudnetIntoGroup(userId,groupId);
            assertNotNull(fixGroupMemberId);
            System.out.println("fixGroupMemberId="+fixGroupMemberId);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
