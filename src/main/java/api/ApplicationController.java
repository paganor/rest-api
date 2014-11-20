package api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ApplicationController {

	@RequestMapping("/hey")
	public String hello(@RequestParam(value="name", defaultValue="Dude") String name) {
		return "Hey, " + name + ".";
	}
}
