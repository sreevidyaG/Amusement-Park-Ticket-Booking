package com.cg.mts.service.impl;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.mts.entities.Activity;
import com.cg.mts.entities.Admin;
import com.cg.mts.repository.IActivityRepository;
import com.cg.mts.repository.IAdminRepository;
import com.cg.mts.repository.ITicketBookingRepository;
import com.cg.mts.service.IAdminService;
@Service
public class IAdminServiceImpl implements IAdminService {

	@Autowired
	private IAdminRepository iAdminRepository;

	@Autowired
	private IActivityRepository iActivityRepository;

	
	@Override
	public Admin insertAdmin(Admin admin) {
		Admin ad = iAdminRepository.save(admin);
		return ad;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		Admin ad = iAdminRepository.save(admin);
		return ad;
	}

	@Override
	public Admin deleteAdmin(Long adminId) {
		Optional<Admin> ad = iAdminRepository.findById(adminId);
		if (ad.isPresent()) {
			return ad.get();
		}
		return null;
	}

	@Override
	public List<Activity> getAllActivities(Long customerId) {
		List<Activity> res = iActivityRepository.findAll();
		return res;
	}

	@Override
	public List<Activity> getAllActivities() {

		List<Activity> ticketList = iActivityRepository.findAll();
		return ticketList;
	}

	@Override
	public List<Activity> getActivitiesCustomerwise() {
		List<Activity> ticketList = iActivityRepository.findAll();
		return ticketList;
	}

	@Override
	public List<Activity> getActivitiesDatewise() {
		List<Activity> ticketList = iActivityRepository.findAll();
		return ticketList;
	}

	@Override
	public List<Activity> getAllActivitiesForDays(Long customerId, LocalDateTime fromDate, LocalDateTime toDate) {
		List<Activity> ticketList = iActivityRepository.findAll();
		return ticketList;
	}

}
