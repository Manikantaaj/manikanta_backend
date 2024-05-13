package com.project.bookmystay.bookmystay.usertable.entity;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "booking_info")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "booking_id")
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserTable user_id;
	
	@ManyToOne
	@JoinColumn(name = "accommodation_id", referencedColumnName = "accomm_id")
	private Accommodation accomm_id;
	
	@Column(name = "check_in_date")
	private double check_in_date;
	
	@Column(name = "check_out_date")
	private double check_out_date;
	
	@Column(name = "total_price")
	private double total_price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private UserTable userTable;
	
	@ManyToOne(cascade = CascadeType.ALL )
	private Accommodation accommodation;
	
}
