package com.example.NurseryProject.Controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.NurseryProject.Entity.Nursery;
import com.example.NurseryProject.Repo.Repository;
import com.example.NurseryProject.Service.DataService;

@RestController
@CrossOrigin(origins = {"https://nurseryadmin.netlify.app/","https://nurseryuser.netlify.app/"})
public class Controller {
	@Autowired
	private Repository repository;
	
	@Autowired
	private DataService dataservice;
	
	
	@GetMapping("/data")
	public List<Nursery> getData(){
		return repository.findAll();
	}
	// getting data from user and send to dataservice to insert data into database
	@PostMapping("/send")
	public void createdata(@RequestParam("ProductImg") String ProductImg,
							@RequestParam("ProductName") String ProductName,
							@RequestParam("ProductDescription") String ProductDescription,
							@RequestParam("ProductCategery") String ProductCategery,
							@RequestParam("ProductPrice") Integer ProductPrice) {
		dataservice.createdata(ProductImg,ProductName,ProductDescription,ProductCategery,ProductPrice);
//		return "Success";
	}
	
	// getting data from user and send to dataservice to update data into database
	@PostMapping("/update")
    public void updateData(@RequestParam("ProductId") Integer ProductId,
			@RequestParam("ProductImg") String ProductImg,
			@RequestParam("ProductName") String ProductName,
			@RequestParam("ProductDescription") String ProductDescription,
			@RequestParam("ProductCategery") String ProductCategery,
			@RequestParam("ProductPrice") Integer ProductPrice) {
        dataservice.updateData(ProductId,ProductImg,ProductName,ProductDescription,ProductCategery,ProductPrice);
//        return "Update successful";
    }
	
	
	@PostMapping("/delete")
	public void deleteData(@RequestParam Integer PId) {
		dataservice.deleteData(PId);
//		return "Deletion Completed Successfully";
	}
}
