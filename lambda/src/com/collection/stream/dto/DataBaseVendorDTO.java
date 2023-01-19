package com.collection.stream.dto;

import com.collection.stream.constant.Type;

public class DataBaseVendorDTO {
private String name;
private String developedBy;
private int size;
private long locenseCost;
private Type type;
public DataBaseVendorDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public DataBaseVendorDTO(String name, String developedBy, int size, long licenseCost, Type type) {
	super();
	this.name = name;
	this.developedBy = developedBy;
	this.size = size;
	this.locenseCost = locenseCost;
	this.type = type;
}
@Override
public String toString() {
	return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", size=" + size + ", locenseCost="
			+ locenseCost + ", type=" + type + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDevelopedBy() {
	return developedBy;
}
public void setDevelopedBy(String developedBy) {
	this.developedBy = developedBy;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public long getLocenseCost() {
	return locenseCost;
}
public void setLocenseCost(long locenseCost) {
	this.locenseCost = locenseCost;
}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type = type;
}
@Override
public int hashCode() {
	
	return 223;
}
@Override
public boolean equals(Object obj) {
	if(obj!=null&&obj instanceof DataBaseVendorDTO)
	{
		DataBaseVendorDTO vendor=(DataBaseVendorDTO)obj;
		if(vendor.name.equals(this.name))
		return true;
		
	}
		
	return false;
}

}
