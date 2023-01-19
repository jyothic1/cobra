package com.jyothi.army.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.jyothi.army.dto.SoldierDTO;
import com.jyothi.army.repository.SoldierRepository;

public class SoldierServiceImplementation implements SoldierService {
	private SoldierRepository repo;

	public SoldierServiceImplementation() {
	System.out.println("created no arg construtor of SoldierServiceImplementation");
	}
	public void setRepository(SoldierRepository repo)
	{
		this.repo=repo;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("running validateAndSave method from SoldierServiceImplementation");
		System.out.println("dto passed"+dto);
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
	Set<ConstraintViolation<SoldierDTO>> violations=validator.validate(dto);
	if(violations!=null)
	{
		System.out.println("there are errors");
violations.forEach(j -> System.out.println(j.getMessage()));
		return false;
	}
	else
	{
		System.out.println("data is valid");
	boolean saved=repo.save(dto);
	System.out.println("dto is saved using repo"+saved);
		return saved;
	}

}
}
