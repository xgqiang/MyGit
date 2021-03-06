package course.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;

import course.entity.School;

@RunWith(SpringRunner.class)
@MybatisTest
public class SchoolMapperTest {
	@Autowired
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
		System.out.println(school.getName());
	}
	@Test
    public void createSchool() {
		School school = new School(0, "厦门大学", "福建省","厦门市");
		schoolMapper.insertSchool(school);
		School newSchool = schoolMapper.findSchoolById(school.getId());
        assertEquals("厦门大学", newSchool.getName());
        assertEquals("厦门市", newSchool.getCity());
    }
}
