package course.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

import course.entity.ErrorMessage;


@Service
public class ErrorService {
	List<ErrorMessage> errors = new ArrayList<ErrorMessage>();
	Map<String, ErrorMessage> MapErrors = new HashMap<String, ErrorMessage>();
	public ErrorService() {
		
	}
	public void saveError(ErrorMessage error) {
		errors.add(error);
		MapErrors.put(error.getName(), error);
	}
	public ErrorMessage findOne(String name) {
		return MapErrors.get(name);
	}
}
