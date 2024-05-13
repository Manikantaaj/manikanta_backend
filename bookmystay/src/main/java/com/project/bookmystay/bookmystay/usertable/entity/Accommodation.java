package com.project.bookmystay.bookmystay.usertable.entity;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "accommodation_info")
public class Accommodation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "accomm_id")
	private int accommodation_id;
	
	@Column(name = "hotel_name")
	private int name;
	
	@Column(name = "accommodation_details")
	private String description;
	
	@Column(name = "hotel_location")
	private String location;
	
	@Column(name = "total_rooms_available")
	private double total_rooms;
	
	@Column(name = "price_per_night")
	private double price_per_night;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "accommodation")
	private List<Booking> booking;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private UserTable userTable;
}
