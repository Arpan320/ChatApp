package in.arpan.main.controllar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllar {
	@GetMapping("/")
	public String openindex() {
		return "index";
	}
	@GetMapping("/chat1")
	public String openchat1() {
		return "chat1";
	}
	@GetMapping("/chat")
	public String openchat() {
		return "chat";
	}
}
