package com.amanuel.aregay.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Book")

//Class
public class Item {
	
	// Attributes
    @Id 
	private int id;
	private String name;
	private String message;

}
