package com.bootcamp.gym.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@Table(name="exercises")
public class Exercise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int exercise_id;
	
	@Column(name="exercise_name")
	private String exercise_name;
	
	@Column(name="exercise_description")
	private String exercise_description;
	
	@Column(name="exercise_equipment")
	private String exercise_equipment;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "exercise_category",
		joinColumns = @JoinColumn(name="exercise_id"),
		inverseJoinColumns = @JoinColumn(name = "category_id"))
	private Set<Category> categories = new HashSet<>();

}

//20:32 in same video - @ToString.Exclude only in Entry, not here