package com.cg.mts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Activity;

@Repository
public interface IActivityRepository extends JpaRepository<Activity, Long> {

	@Query(name = "SELECT u from Activity u where u.charges =:charges ", nativeQuery = true)
	List<Activity> findByCharges(Long charges);

	@Query(name = "SELECT count(*) from Activity u where u.charges =:charges ", nativeQuery = true)
	Long countByCharges(Long charges);

//	@Query(name = "SELECT u from Activity u where u.activity_id in :activitys ", nativeQuery = true)
//	List<Activity> fetchActivity(List<Long> activitys);

}