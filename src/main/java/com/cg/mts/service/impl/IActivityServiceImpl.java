package com.cg.mts.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Activity;
import com.cg.mts.repository.IActivityRepository;
import com.cg.mts.service.IActivityService;

@Service
public class IActivityServiceImpl implements IActivityService {

	@Autowired
	private IActivityRepository iActivityRepository;

	@Override
	public Activity insertCab(Activity activity) {
		Activity act = iActivityRepository.save(activity);
		return act;
	}

	@Override
	public Activity updateCab(Activity activity) {
		Activity act = iActivityRepository.save(activity);
		return act;
	}

	@Override
	public Activity deleteCab(Long activityId) {
		Optional<Activity> act = iActivityRepository.findById(activityId);
		if (act.isPresent()) {
			iActivityRepository.deleteById(activityId);
			return act.get();
		}
		return null;
	}

	@Override
	public List<Activity> viewActivitiesOfCharges(Long charges) {
		List<Activity> act = iActivityRepository.findByCharges(charges);
		return act;
	}

	@Override
	public Long countActivitiesOfCharges(Long charges) {
		Long total = iActivityRepository.countByCharges(charges);
		return total;
	}

}
