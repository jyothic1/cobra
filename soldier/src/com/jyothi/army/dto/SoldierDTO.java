package com.jyothi.army.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditDTO{
	@NotNull
	@Size(min=5,max=15,message="name length should be morethan 5 and lessthan 15")
	private String name;
	
	@Min(value=1,message="id should be morethan 1")
	@Max(value=30,message="id shd be lessthan 30")
	private int id;
	
	@Min(value=1,message="rank should be morethan 1")
	@Max(value=10,message="rank shd be lessthan 10")
	private int rank;
	
	@NotNull
	@Size(min=6,max=10,message="betallian name should be morethan 4 and lessthan 10")
	private String betallian;
	
	@NotNull
	@Size(min=4,max=10,message="country name should be morethan 4 and lessthan 10")
	private String country;
	

	
}
