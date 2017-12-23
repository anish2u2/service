package org.services.app.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@Controller
public class HomeController {

	@RequestMapping(method = RequestMethod.GET, value = { "/home.html" })
	public String getHomePage() {
		System.out.println("Executing home controller.");
		return "home";
	}

}
