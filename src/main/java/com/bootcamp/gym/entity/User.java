package com.bootcamp.gym.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
	@Column(name="user_first_name")
	private String user_first_name;
	
	@Column(name="user_last_name")
	private String user_last_name;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval =  true)
	private Set<Entry> entries = new HashSet<>();
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval =  true)
	private Set<Exercise> exercises = new HashSet<>();
}

