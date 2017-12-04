package course.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import course.entity.Seminar;



@Service
public class SeminarService {
	List<Seminar> seminars = new ArrayList<Seminar>();
	Map<Integer, Seminar> Mapseminars = new HashMap<Integer, Seminar>();
	Random rand = new Random(38);
	public SeminarService() {
		
	}
	public void saveSeminar(Seminar seminar) {
		Integer id = -1;
		while (id < 0 ){
			id = rand.nextInt(1000);
		}
		seminar.setId(id);
		Mapseminars.put(id, seminar);
		seminars.add(seminar);
	}
	public Seminar findOne(Integer id) {
		return Mapseminars.get(id);
	}
	//以List形式,获取所有的课程
	public List<Seminar> getAllSeminars(){
		return seminars;
	}
}
