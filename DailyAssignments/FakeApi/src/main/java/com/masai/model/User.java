package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {
@Id
@NotNull
@Size(min=3,max=15,message="username min size=3")
private String username;
@NotNull
private String password;
@NotNull
@Email(message="enter valid email")
private String email;
@NotNull
private String role;
}
