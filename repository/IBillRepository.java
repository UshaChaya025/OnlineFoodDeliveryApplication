package com.cg.ofda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ofda.dto.BillDto;

@Repository
public interface IBillRepository extends JpaRepository<BillDto, String>{
	
	

}
