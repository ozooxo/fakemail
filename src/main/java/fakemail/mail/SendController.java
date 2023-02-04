package fakemail.mail;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {
    
    @GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
