package com.tnsif.pm.College;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class CollegeService
{
	@Autowired
	private CollegeRepository repo;
	
	public List<College> listAll()
	{
		return repo.findAll();
	}
	
	public College get(Long id)
	{
		return repo.findById(id).get();
	}
	
	public College save(College college)
	{
		return repo.save(college);
	}
	
	public void delete(Long id)
	{
		repo.deleteById(id);
	}

}