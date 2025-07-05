package com.example.NurseryProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.NurseryProject.Entity.Nursery;

public interface Repository extends JpaRepository<Nursery ,Integer>{
	
}
