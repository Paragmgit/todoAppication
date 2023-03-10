package com.example.todoapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    private String title;
    private boolean status;

}
