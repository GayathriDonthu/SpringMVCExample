package com.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvc.model.Activity;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	/* (non-Javadoc)
	 * @see com.springmvc.service.ExerciseService#findAllActivities()
	 */
	@Override
	public List<Activity> findAllActivities() {

		List<Activity> activities = new ArrayList<Activity>();

		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);

		Activity walk = new Activity();
		walk.setDesc("Walk");
		activities.add(walk);

		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);

		return activities;

	}

}
