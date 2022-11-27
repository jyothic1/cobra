package com.xworkz.equals.object.code;



public class God {
	private String name;
	private String place;
	private String flowers;
	private String weapon;
	private String prasadam;
	private int noOfTickets;
	private double priceOfTickets;
	private double timings;
	public God() {
	System.out.println("running default constructor");
	}
	public God(String name, String place, String flowers, String weapon, String prasadam, int noOfTickets,
			double priceOfTickets, double timings) {
		
		super();
		System.out.println("running parameter constructor");
		this.name = name;
		this.place = place;
		this.flowers = flowers;
		this.weapon = weapon;
		this.prasadam = prasadam;
		this.noOfTickets = noOfTickets;
		this.priceOfTickets = priceOfTickets;
		this.timings = timings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getFlowers() {
		return flowers;
	}
	public void setFlowers(String flowers) {
		this.flowers = flowers;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public String getPrasadam() {
		return prasadam;
	}
	public void setPrasadam(String prasadam) {
		this.prasadam = prasadam;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public double getPriceOfTickets() {
		return priceOfTickets;
	}
	public void setPriceOfTickets(double priceOfTickets) {
		this.priceOfTickets = priceOfTickets;
	}
	public double getTimings() {
		return timings;
	}
	public void setTimings(double timings) {
		this.timings = timings;
	}
	@Override
	public String toString() {
		return "God [name=" + name + ", place=" + place + ", flowers=" + flowers + ", weapon=" + weapon + ", prasadam="
				+ prasadam + ", noOfTickets=" + noOfTickets + ", priceOfTickets=" + priceOfTickets + ", timings="
				+ timings + "]";
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in god");
		if(obj instanceof God)
		{
			System.out.println("obj is type of god");
			God gd=(God)obj;
			if(this.prasadam.equals(gd.prasadam))
			{
				System.out.println("onde prasada");
				return true;
			}
			else {
				System.out.println("bere prasada");
				return false;
			}
			
		}
		else {
			System.err.println("obj is not god");
		}
		
		
		
		return false;
	}
	

}
