package service.test;

import coursemanagesystem.service.impl.SeminarGroupServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
public class SeminarGroupServiceTest {

    /*@Test
    public void testDeleteSeminarGroupMemberBySeminarGroupId(){
        SeminarGroupServiceImpl seminarGroupService=mock(SeminarGroupServiceImpl.class);
        BigInteger seminarGroupId=new BigInteger("1");
        seminarGroupService.deleteSeminarGroupByGroupId(seminarGroupId);
        verify(seminarGroupService).deleteSeminarGroupByGroupId(seminarGroupId);
    }*/
    @Test
    public void testGetSeminarGroupLeaderByGroupId(){
        SeminarGroupServiceImpl seminarGroupService=mock(SeminarGroupServiceImpl.class);
        BigInteger seminarGroupId=new BigInteger("1");
        BigInteger leaderId=seminarGroupService.getSeminarGroupLeaderByGroupId(seminarGroupId);
        assertNotNull(leaderId);
        System.out.println("leaderId="+leaderId);
        //verify(seminarGroupService).getSeminarGroupLeaderByGroupId(seminarGroupId);
    }

}
