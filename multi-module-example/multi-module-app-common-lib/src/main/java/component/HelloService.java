package component;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public String returnHello() {
		return "Hello world!";
	}
}
