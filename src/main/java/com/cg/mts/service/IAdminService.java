package com.cg.mts.service;

import java.time.LocalDateTime;
import java.util.List;

import com.cg.mts.entities.Activity;
import com.cg.mts.entities.Admin;

public interface IAdminService {
	public Admin insertAdmin(Admin admin);

	public Admin updateAdmin(Admin admin);

	public Admin deleteAdmin(Long adminId);

	public List<Activity> getAllActivities(Long customerId);

	public List<Activity> getAllActivities();

	public List<Activity> getActivitiesCustomerwise();

	public List<Activity> getActivitiesDatewise();

	public List<Activity> getAllActivitiesForDays(Long customerId, LocalDateTime fromDate, LocalDateTime toDate);
}