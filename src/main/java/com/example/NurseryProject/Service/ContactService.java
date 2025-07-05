package com.example.NurseryProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NurseryProject.Entity.Contact;
import com.example.NurseryProject.Repo.ContactRepo;

@Service
public class ContactService {
	@Autowired
	private ContactRepo contactrepo;
	
	// get data from controller page using createdata() method and send to database
	public void createdata(String Name,Long PhoneNumber,String Email,String Subject,String Message) {
		 Contact contact = new Contact(Name,PhoneNumber,Email,Subject,Message);
		 contactrepo.save(contact);
	}
}
