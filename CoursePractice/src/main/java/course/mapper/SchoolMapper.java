package course.mapper;

import java.util.List;

import course.entity.School;

public interface SchoolMapper {
	void insertSchool(School school);
	School findSchoolById(Integer id);
	List<School> findAllSchools();
	void deleteSchoolById(Integer id);
}
