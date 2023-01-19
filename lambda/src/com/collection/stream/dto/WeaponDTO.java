package com.collection.stream.dto;

import com.collection.stream.constant.WeaponType;

public class WeaponDTO {

	private String name;
	private String madeBy;
	private double price;
	private int madeOn;
	private WeaponType type;
	
	public WeaponDTO() {
		// TODO Auto-generated constructor stub
	}

	public WeaponDTO(String name, String madeBy, double price, int madeOn, WeaponType type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.price = price;
		this.madeOn = madeOn;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", maddeBy=" + madeBy + ", price=" + price + ", madeOn=" + madeOn
				+ ", type=" + type + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof WeaponDTO)
		{
			WeaponDTO dto=(WeaponDTO)obj;
			if(this.name.equals(dto.name)&& this.price==dto.price&& this.madeBy.equals(dto.madeBy)
			
					&& this.madeOn==dto.madeOn && this.type.equals(dto.type))
					{
				        System.out.println("equal");
				        
				        return true;
			
		}
	
	
	}
		return false;

	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	
	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	
	public double getPrice() {
		return price;
	}

	
	public void setPrice(double price) {
		this.price = price;
	}

	
	public int getMadeOn() {
		return madeOn;
	}

	/**
	 * @param madeOn the madeOn to set
	 */
	public void setMadeOn(int madeOn) {
		this.madeOn = madeOn;
	}

	/**
	 * @return the type
	 */
	public WeaponType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(WeaponType type) {
		this.type = type;
	}
}
