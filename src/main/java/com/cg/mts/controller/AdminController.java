package com.cg.mts.controller;

import java.time.LocalDateTime;
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
import com.cg.mts.entities.Admin;
import com.cg.mts.service.IAdminService;

@RestController
@RequestMapping("/amusement/park/admin")
public class AdminController {

	@Autowired
	private IAdminService iAdminService;

	@PostMapping("/add")
	public ResponseEntity<Admin> insertAdmin(@RequestBody Admin admin) {
		return new ResponseEntity<>(iAdminService.insertAdmin(admin), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin) {
		return new ResponseEntity<>(iAdminService.updateAdmin(admin), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{adminId}")
	public ResponseEntity<Admin> deleteAdmin(@PathVariable Long adminId) {
		return new ResponseEntity<>(iAdminService.deleteAdmin(adminId), HttpStatus.OK);
	}

	@GetMapping("/view/{customerId}")
	public ResponseEntity<List<Activity>> getAllActivities(@PathVariable Long customerId) {
		return new ResponseEntity<>(iAdminService.getAllActivities(customerId), HttpStatus.OK);
	}

	@GetMapping("/view")
	public ResponseEntity<List<Activity>> getAllActivities() {
		return new ResponseEntity<>(iAdminService.getAllActivities(), HttpStatus.OK);
	}

	@GetMapping("/view/customer")
	public ResponseEntity<List<Activity>> getActivitiesCustomerwise() {
		return new ResponseEntity<>(iAdminService.getActivitiesCustomerwise(), HttpStatus.OK);
	}

	@GetMapping("/view/date")
	public ResponseEntity<List<Activity>> getActivitiesDatewise() {
		return new ResponseEntity<>(iAdminService.getActivitiesDatewise(), HttpStatus.OK);
	}

	@GetMapping("/view/days")
	public ResponseEntity<List<Activity>> getAllActivitiesForDays(Long customerId, LocalDateTime fromDate,
			LocalDateTime toDate) {
		return new ResponseEntity<>(iAdminService.getAllActivitiesForDays(customerId, fromDate, toDate), HttpStatus.OK);

	}

}
