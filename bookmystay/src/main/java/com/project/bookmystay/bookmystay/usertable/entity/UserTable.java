package com.project.bookmystay.bookmystay.usertable.entity;


import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_info")
public class UserTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "user_name")
	private String name;
	
	@Column(name = "user_email")
	private String email;
	
	@Column(name = "user_password")
	private double password;
	
	 @Column(name = "is_admin")
	 private boolean isAdmin;

	 @Column(name = "created_at")
	 @Temporal(TemporalType.TIMESTAMP)
	 private Date createdAt;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userTable")
	private List<Booking> booking;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userTable")
	private List<Accommodation> accommodation;
}
