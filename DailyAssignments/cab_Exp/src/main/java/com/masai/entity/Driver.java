package com.masai.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Driver {



@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Min(value=1, message="id should be more than 1")
private Integer userId;
@Min(value=1, message="id should be more than 1")

private Integer licenseNo;
@Min(value=1, message="id should be more than 1")
private Double rating;
private Boolean available;

@OneToOne(cascade= CascadeType.ALL)
@JoinColumn(name="cabId")
private Cab cab;
/*
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="tripBookingId")
private TripBooking tripBooking;
*/
}
