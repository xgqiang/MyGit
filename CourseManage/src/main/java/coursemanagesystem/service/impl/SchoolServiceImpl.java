package coursemanagesystem.service.impl;

import coursemanagesystem.entity.School;
import coursemanagesystem.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service("schoolService")
public class SchoolServiceImpl {
    @Autowired(required = false)
    private SchoolMapper schoolMapper;

    public List<School> listSchoolByCity(String city){

        return schoolMapper.listSchoolByCity(city);
    }


    public BigInteger insertSchool(School school){
        schoolMapper.insertSchool(school);
        return school.getId();
    }


    public List<String> listProvince(){
        return schoolMapper.listProvince();
    }


    public List<String> listCity(String province){
        return schoolMapper.listCity(province);

    }


    public School getSchoolBySchoolId(BigInteger SchoolId){
        return schoolMapper.getSchoolBySchoolId(SchoolId);

    }
}
