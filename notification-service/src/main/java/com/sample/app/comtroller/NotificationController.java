package com.sample.app.comtroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
	@RequestMapping("/")
	public String homePage() {
		return "Notification Service: Serve notifications";
	}
	
	@RequestMapping(value = "/notifications", method = RequestMethod.GET)
	public String notifications() {
		return "There is one pending notification";
	}
}
