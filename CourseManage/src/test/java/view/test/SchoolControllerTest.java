package view.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import coursemanagesystem.entity.School;
import coursemanagesystem.mapper.SchoolMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import coursemanagesystem.SchoolApplication;
import coursemanagesystem.entity.School;
import coursemanagesystem.mapper.SchoolMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SchoolApplication.class)
public class SchoolControllerTest {
	/*@Autowired
    private SchoolMapper schoolMapper;
	@Test
	public void findAllSchools() {
		List<School> schools=schoolMapper.findAllSchools();
		assertNotNull(schools);
        assertTrue(!schools.isEmpty());
	}
	@Test
	public void findSchoolById() {
		School school=schoolMapper.findSchoolById(1);
	}
	@Test
    public void createSchool() {
		School user = new School(3, "厦门大学", "福建省","厦门市");
		schoolMapper.insertUser(user);
		School newSchool = schoolMapper.findSchoolById(user.getId());
        assertEquals("厦门大学", newSchool.getName());
        assertEquals("厦门市", newSchool.getCity());
    }*/
}

