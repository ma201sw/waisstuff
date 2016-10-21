package hello;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	@PostConstruct
	public void init() {
		
	}
	
	public void testMethod() {
		System.out.println("test service working");
	}
}
