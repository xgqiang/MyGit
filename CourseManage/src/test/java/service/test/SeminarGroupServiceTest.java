package service.test;

import coursemanagesystem.Application;
import coursemanagesystem.mapper.SeminarGroupMapper;
import coursemanagesystem.service.impl.SeminarGroupServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.mockito.Mockito.mock;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SeminarGroupServiceTest {

    //SeminarGroupServiceImpl seminarGroupService;
    @Autowired
    private SeminarGroupMapper seminarGroupMapper;
    @Test
    public void testDeleteSeminarGroupMemberBySeminarGroupId(){
        BigInteger seminarGroupId=new BigInteger("1");
        //seminarGroupService.deleteSeminarGroupByGroupId(seminarGroupId);
        seminarGroupMapper.deleteSeminarGroupByGroupId(seminarGroupId);
    }
    @Test
    public void testGetSeminarGroupLeaderByGroupId(){
        BigInteger seminarGroupId=new BigInteger("1");
        //BigInteger leaderId=seminarGroupService.getSeminarGroupLeaderByGroupId(seminarGroupId);
        BigInteger leaderId=seminarGroupMapper.getSeminarGroupLeaderByGroupId(seminarGroupId);
        assertNotNull(leaderId);
        System.out.println("leaderId="+leaderId);
    }

}
