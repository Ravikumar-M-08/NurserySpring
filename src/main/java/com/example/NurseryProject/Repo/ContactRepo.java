package com.example.NurseryProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.NurseryProject.Entity.Contact;


public interface ContactRepo extends JpaRepository<Contact ,Integer> {
	

}
