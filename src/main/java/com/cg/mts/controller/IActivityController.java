package com.cg.mts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Activity;
import com.cg.mts.service.IActivityService;

@RestController
@RequestMapping("/amusement/park/activity")
public class IActivityController {

	@Autowired
	private IActivityService iActivityService;

	@PostMapping("/add")
	public ResponseEntity<Activity> insertCab(@RequestBody Activity activity) {
		return new ResponseEntity<>(iActivityService.insertCab(activity), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Activity> updateCab(@RequestBody Activity activity) {
		return new ResponseEntity<>(iActivityService.updateCab(activity), HttpStatus.OK);
	}

	@DeleteMapping("delete/{activityId}")
	public ResponseEntity<Activity> deleteCab(@PathVariable Long activityId) {
		return new ResponseEntity<>(iActivityService.deleteCab(activityId), HttpStatus.OK);
	}

	@GetMapping("/view/{charges}")
	public ResponseEntity<List<Activity>> viewActivitiesOfCharges(@PathVariable Long charges) {
		return new ResponseEntity<>(iActivityService.viewActivitiesOfCharges(charges), HttpStatus.OK);
	}

	@GetMapping("/count/{charges}")
	public ResponseEntity<Long> countActivitiesOfCharges(@PathVariable Long charges) {
		return new ResponseEntity<>(iActivityService.countActivitiesOfCharges(charges), HttpStatus.OK);
	}
}
