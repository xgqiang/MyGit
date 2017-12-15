package course.veiw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import course.entity.School;
import course.mapper.SchoolMapper;

@RestController
public class SchoolController {
	@Autowired
    private SchoolMapper schoolMapper;
	@RequestMapping("/getSchools")
    public List<School> getUsers() {
        List<School> schools=schoolMapper.findAllSchools();
        return schools;
    }
	
	@RequestMapping("/add")
    public void save(School school) {
		schoolMapper.insertSchool(school);
    }
	
	@RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
		schoolMapper.deleteSchoolById(id);
    }
}
