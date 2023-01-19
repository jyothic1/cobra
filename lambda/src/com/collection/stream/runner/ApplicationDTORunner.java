package com.collection.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.collection.stream.dto.ApplicationDTO;

public class ApplicationDTORunner {
	public static void main(String[] args) {
		Collection<ApplicationDTO> appDTO=new ArrayList();
		appDTO.add(new ApplicationDTO("RoyalBrothers", 3.17, true, "Abhishek and Akash", 0));
		appDTO.add(new ApplicationDTO("Xworkz", 9.4, true, "Omkar", 16));
		appDTO.add(new ApplicationDTO("WhatsApp", 19.7, false,"Zukerberg", 23));
		appDTO.add(new ApplicationDTO("Blinkit", 4.8, true, "jyothi", 7));
		appDTO.add(new ApplicationDTO("Google earth", 7.8, true, "google", 6));

		System.out.println("to string");
	 System.out.println(appDTO);
	// System.out.println(appDTO); doubt
	 appDTO.stream().filter(ele->ele.isFree()&&ele.getDevelopedBy().equals("google")).collect(Collectors.toList()).forEach(ele->System.out.println(ele));			
	 System.out.println("filtering");
			
			appDTO.stream().filter(ele->ele.getVersion()>5).map(e->e.getName()).collect(Collectors.toList()).forEach(f->System.out.println(f));
//map doubt
		

	}

}
