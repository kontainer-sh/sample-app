package sh.kontainer.sampleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Some more Greetings from Spring Boot!!!!!";
	}

}
