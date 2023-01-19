package com.collection.stream.runner;

import java.util.Collection;
import java.util.LinkedHashSet;

import com.collection.stream.constant.Type;
import com.collection.stream.dto.DataBaseVendorDTO;

public class DataBaseVendorDTORunner {

	public static void main(String[] args) {
	
Collection<DataBaseVendorDTO> database=new LinkedHashSet<>();
database.add(new DataBaseVendorDTO("MongoDB","Merryman", 16, 0, Type.MONGODB));
database.add(new DataBaseVendorDTO("SQL","Boyce", 20, 5484, Type.SQL));
database.addAll(database);






}

}
