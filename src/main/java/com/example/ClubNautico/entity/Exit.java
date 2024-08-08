package com.example.ClubNautico.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "exit")
public class Exit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "created")
	private LocalDateTime created;
	
	@Column(name = "destination")
	private String destination;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "patron_id")
	private Patron patron;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "boat_id")
	private Boat boat;
	
}
