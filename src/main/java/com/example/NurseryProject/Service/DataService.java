package com.example.NurseryProject.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NurseryProject.Entity.Nursery;
import com.example.NurseryProject.Repo.Repository;
@Service
public class DataService {
	@Autowired
	private Repository repository;
	
	// get data from controller page using createdata() method and send to database
	public void createdata(String ProductImg,String ProductName,String ProductDescription,String ProductCategery,Integer ProductPrice) {
		Nursery nursery = new Nursery(ProductImg,ProductName,ProductDescription,ProductCategery,ProductPrice);
		repository.save(nursery);
	}
	
	// get data from controller page using createdata() method and update into database
	public void updateData(Integer PId,String PImg,String PName,String PDescription,String PCategery,Integer PPrice) {
	    Optional<Nursery> optional = repository.findById(PId);
	    if (optional.isPresent()) {
	        Nursery nursery = optional.get();
	        nursery.setProductImg(PImg);
	        nursery.setProductName(PName);
	        nursery.setProductDescription(PDescription);
	        nursery.setProductCategery(PCategery);
	        nursery.setProductprice(PPrice);
	        repository.save(nursery);
	    } 
	}
	
	public void deleteData(Integer PId) {
		repository.deleteById(PId);
	}
}
