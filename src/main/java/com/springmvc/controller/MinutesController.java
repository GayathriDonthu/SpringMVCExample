package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.model.Activity;
import com.springmvc.model.Exercise;
import com.springmvc.service.ExerciseService;
import com.springmvc.service.ExerciseServiceImpl;

@Controller
public class MinutesController {

	@Autowired
	ExerciseService exerciseService = new ExerciseServiceImpl();

	@RequestMapping(value = "addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("exercise: " + exercise.getMinutes());
		System.out.println("exercise.activity: " + exercise.getActivity());
		return "addMinutes";

	}

	@RequestMapping(value = "activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {

		return exerciseService.findAllActivities();

	}

}
