package com.week9.lab.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Item entity representing a sports brand
 * @Data - Lombok annotation that generates getters, setters, equals, hashCode, and toString methods
 * @AllArgsConstructor - Generates constructor with all arguments
 * @NoArgsConstructor - Generates no-args constructor (required by JPA)
 * @ToString - Generates toString method
 * @Entity - JPA annotation to make this class a database entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Item {

	/**
     * Constructor that takes only name parameter
     * Used for creating new items with just the name
     */
	public Item(String name) {
		this.name = name;
	}
	public Item() {}
	
	/**
     * ID field for the entity (primary key)
     * @Id marks this as the primary key
     * @GeneratedValue indicates the ID should be automatically generated
     */
	@Id
	@GeneratedValue
	private Long id;

	/**
     * Name field storing the sports brand name
     */
	private String name;
}
