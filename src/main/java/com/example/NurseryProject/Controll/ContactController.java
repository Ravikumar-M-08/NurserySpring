package com.example.NurseryProject.Controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.NurseryProject.Entity.Contact;
import com.example.NurseryProject.Repo.ContactRepo;
import com.example.NurseryProject.Service.ContactService;



@RestController
@CrossOrigin(origins = {"https://nurseryadmin.netlify.app/","https://nurseryuser.netlify.app/"})
public class ContactController {
	@Autowired
	private ContactRepo contactrepo;
	
	@Autowired
	private ContactService contactservice;
	
	@GetMapping("/enquiry")
	public List<Contact> getData(){
		return contactrepo.findAll();
	}
	
	@PostMapping("/SendEnquiry")
	public void createdata(@RequestParam String Name,
							@RequestParam Long PhoneNumber,
							@RequestParam String Email,
							@RequestParam String Subject,
							@RequestParam String Message) {
		contactservice.createdata(Name,PhoneNumber,Email,Subject,Message);

	}
}
