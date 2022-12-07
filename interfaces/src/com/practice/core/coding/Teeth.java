package com.practice.core.coding;

import com.practice.core.inter.ToothBrush;

public class Teeth extends Object implements ToothBrush{

	public Teeth() {
		
	}

	@Override
	public String brushing(String brush) {
		
		return brush;
	}

	@Override
	public double price(double cost) {
		
		return cost;
	}

	@Override
	public String company(String comp) {
		
		return comp;
	}

	@Override
	public String color(String clr) {
	
		return clr;
	}

	@Override
	public boolean quality(boolean qual) {
		
		return qual;
	}

	
}


