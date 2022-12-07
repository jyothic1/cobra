package com.practice.core.boot;

import com.practice.core.coding.Teeth;
import com.practice.core.inter.ToothBrush;

public class ToothBrushRunner {

	public ToothBrushRunner() {
	
	}

	public static void main(String[] args) {
		ToothBrush brush=new Teeth();
		Teeth teeth =new Teeth();
		Object obj=new Teeth();
		Teeth t=(Teeth)obj;
	String comp	=brush.company("colgate");
		System.out.println(brush.brushing("daily brush madu"));
		System.out.println(teeth.color("ash"));
		System.out.println(teeth.price(2));
		System.out.println(teeth.company("oral=b"));
		System.out.println(t.quality(false));
		System.out.println(comp);
		
		


		
	

	}

}
