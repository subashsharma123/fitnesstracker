package com.springmvc.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.models.Exercise;

@Controller
public class MinutesController {
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		System.out.println("exercise :" + exercise.getMinutes());
		return "forward:addMoreMinutes.html";// returning addMinutes.jsp page
	}

	@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
		System.out.println("exercising :" + exercise.getMinutes());
		return "addMinutes";// returning addMinutes.jsp page
	}
}