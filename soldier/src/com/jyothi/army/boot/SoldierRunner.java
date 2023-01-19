package com.jyothi.army.boot;

import com.jyothi.army.dto.SoldierDTO;
import com.jyothi.army.repository.SoldierRepository;
import com.jyothi.army.repository.SoldierRepositoryImplementation;
import com.jyothi.army.service.SoldierService;
import com.jyothi.army.service.SoldierServiceImplementation;

public class SoldierRunner {

	public SoldierRunner() {
		System.out.println("running SoldierRunner using default constructor");
	}

	public static void main(String[] args) {
	
		SoldierDTO dto=new SoldierDTO("jyothi",5,2,"army12","india");
        SoldierServiceImplementation service=new SoldierServiceImplementation();
        SoldierRepositoryImplementation repository=new SoldierRepositoryImplementation();
        service.setRepository(repository);
        service.validateAndSave(dto);
	}

}
