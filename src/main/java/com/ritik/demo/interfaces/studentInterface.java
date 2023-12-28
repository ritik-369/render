package com.ritik.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ritik.demo.entities.student;

public interface studentInterface extends JpaRepository<student, Integer> {
	
}
