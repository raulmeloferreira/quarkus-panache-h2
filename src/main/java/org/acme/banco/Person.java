package org.acme.banco;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Person extends PanacheEntity {
	
	
	public String name;
	
	public String document;
	
	
}
