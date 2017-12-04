package course.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import course.entity.Class;


@Service
public class ClassService {
	List<Class> classes = new ArrayList<Class>();
	Map<Integer, Class> Mapclasses = new HashMap<Integer, Class>();
	Random rand = new Random(32);
	public ClassService() {
		
	}
	public void saveClass(Class aclass) {
		Integer id = (int) -1;
		while (id < 0 ){
			id = rand.nextInt(1000);
		}
		aclass.setId(id);
		Mapclasses.put(id, aclass);
		classes.add(aclass);
	}
	public Class findOne(Integer id) {
		return Mapclasses.get(id);
	}
	//以List形式,获取所有的课程
	public void deleteClass(Integer id) {
		Mapclasses.remove(id);
		Iterator<Class> sListIterator = classes.iterator();  
		while(sListIterator.hasNext()){  
			Class e = sListIterator.next();  
		    if(e.getId()==id){  
		    sListIterator.remove();  
		    }  
		}
	}
	public List<Class> getAllClasses(){
		return classes;
	}
}
