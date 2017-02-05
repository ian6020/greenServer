package com.mapps.controllers.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mapps.controllers.HelloController;
import com.mapps.utilities.Code;
import com.mapps.utilities.Status;


@RestController
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/login")
	public @ResponseBody ResponseStatus login(
			@RequestParam String user, @RequestParam String password) {
		logger.debug("user: " + user + "  password: " + password);
		return new ResponseStatus(Status.SUCCESS, Code.VALID, "Login successful");
	}
	
	@RequestMapping(value="/signup")
	public @ResponseBody ResponseStatus foo() {
		return new ResponseStatus(Status.SUCCESS, Code.VALID, "Signup successful");
	}
}
