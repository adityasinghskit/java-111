package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Min(value=1, message="eid cannot be negetive")
private Integer eid;
@NotNull
@Size(min=3, max=16, message="Name should be between 3 & 16 in size")
private String name;
@NotNull
@Min(value=1, message="Salary cannot be negetive")
private Integer salary;
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="dept")
private Department department;
}
