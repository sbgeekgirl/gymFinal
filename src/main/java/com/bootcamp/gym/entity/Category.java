package com.bootcamp.gym.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@Table(name="categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int category_id;
	
	@Column(name="category_name")
	private String category_name;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(mappedBy = "categories", cascade = CascadeType.PERSIST)
	private Set<Exercise> exercises = new HashSet<>();


}


/*
 * Removed 	
 * @JoinTable(name = "exercise_category",
 * joinColumns = @JoinColumn(name="exercise_id"),
 * inverseJoinColumns = @JoinColumn(name = "category_id"))
 * 
 * per dog rescue creating entities video 15:27
 * Replaced with mapped by
 */
