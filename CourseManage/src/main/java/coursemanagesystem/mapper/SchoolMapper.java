package coursemanagesystem.mapper;

import java.math.BigInteger;
import java.util.List;
import coursemanagesystem.entity.School;

public interface SchoolMapper {
	List<School> listSchoolByCity(String city);
	boolean insertSchool(School school);
	List<String> listProvince();
	List<String> listCity(String province);
	School getSchoolBySchoolId(BigInteger SchoolId);
}
