package ru.saubulprojects.searchapp.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products", uniqueConstraints = {@UniqueConstraint(columnNames = "name", name = "name_constraint")})
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String sku;
	
	private String name;
	
	private String description;
	
	private boolean active;
	
	private String imageUrl;
	
	@CreationTimestamp
	@Column(name = "date_created")
	private LocalDateTime dateCreated;
	
	@UpdateTimestamp
	@Column(name = "date_updated")
	private LocalDateTime dateUpdated;
	
}
