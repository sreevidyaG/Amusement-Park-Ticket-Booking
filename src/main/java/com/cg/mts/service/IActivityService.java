package com.cg.mts.service;

import java.util.List;

import com.cg.mts.entities.Activity;

public interface IActivityService {

	public Activity insertCab(Activity activity);

	public Activity updateCab(Activity activity);

	public Activity deleteCab(Long activityId);

	public List<Activity> viewActivitiesOfCharges(Long charges);

	public Long countActivitiesOfCharges(Long charges);
}
