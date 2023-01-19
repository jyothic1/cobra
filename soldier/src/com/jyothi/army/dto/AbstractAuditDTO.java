package com.jyothi.army.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public class AbstractAuditDTO implements Serializable {
	
	private String createdBy;
	private String updatedBy;
	private LocalDateTime updatedAt;
	private LocalDateTime createdAt;

}
