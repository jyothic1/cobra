package com.jyothi.army.repository;

import com.jyothi.army.dto.SoldierDTO;

public class SoldierRepositoryImplementation implements SoldierRepository{

	public SoldierRepositoryImplementation() {
		System.out.println("created no arg construtor of SoldierRepositoryImplementation ");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("runnning save method from SoldierRepositoryImplementation");
		System.out.println("soldier dto passes"+dto);
		return true;
	}

}
