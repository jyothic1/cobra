package com.collection.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import com.collection.stream.constant.WeaponType;
import com.collection.stream.dto.WeaponDTO;

public class WeaponDTORunner {
	public static void main(String[] args) {
		
		Collection<WeaponDTO> dto = new ArrayList<WeaponDTO>();
		WeaponDTO dto1 = new WeaponDTO("knife", "jyothi", 10, 2023, WeaponType.CULINARY);
		WeaponDTO dto2 = new WeaponDTO("AK-47", "Drashan", 25, 2021, WeaponType.NONCULINARY);
		WeaponDTO dto3 = new WeaponDTO("AK-5", "jyothi", 67, 2017, WeaponType.NONCULINARY);
		WeaponDTO dto4 = new WeaponDTO("bomb", "akshay", 1, 2023, WeaponType.NONCULINARY);
		WeaponDTO dto5 = new WeaponDTO("fork", "yasmeen", 10, 2020, WeaponType.CULINARY);
		WeaponDTO dto6 = new WeaponDTO("gun", "manu", 16, 2027, WeaponType.NONCULINARY);

		dto.add(dto1);
		dto.add(dto2);
		dto.add(dto3);
		dto.add(dto4);
		dto.add(dto5);
		dto.add(dto6);
		dto.stream().filter(p1->p1.getPrice()>)
		
	}

	
	
}
