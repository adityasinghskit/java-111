package com.masai.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DriverDTO {
	private Integer userId;
	private String Username;
	private Long Mobile;
	private Address address;
	private String Email;
	private Integer licenseNo;
	private Double rating;
	private Boolean available;
}
