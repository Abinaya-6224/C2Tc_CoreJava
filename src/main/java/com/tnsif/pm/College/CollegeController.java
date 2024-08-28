package com.tnsif.pm.College;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping 
public class CollegeController
{
	@Autowired
	private CollegeService service;


	@GetMapping("/college")
	public List<College> list()	
	{
		return service.listAll();
	}
	//Retrive By Id
	@GetMapping("/college/{id}")
	public ResponseEntity<College> get (@PathVariable Long id)
	{
		try
		{
			College college= service.get(id);
			return new ResponseEntity<College>(college,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new  ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}

	//create operation
	@PostMapping("/college")
	public void add(@RequestBody College college)
	{
		service.save(college);
	}
	
	//update operation
	@PutMapping("/college/{id}")
	public ResponseEntity<?> update(@RequestBody College college,@PathVariable Long id)
	{
		try
		{
			College existcollege= service.get(id);
			service.save(college);
			return new ResponseEntity<College>(college,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}

	 //delete operation
	@DeleteMapping("/college/{id}")
	public void delete(@PathVariable Long id)
	{
		service.delete(id);
	}
	
}
