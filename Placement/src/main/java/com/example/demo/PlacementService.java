package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class PlacementService
{
	@Autowired
	private PlacementRepository repository;
	

	public List<Placement> listAll()
    {
		
		return repository.findAll();
	}


	public Placement get(Integer id) 
	{
		
		 return repository.findById(id).get();
	}


	public void save(Placement s) 
	{
		
		repository.save(s);
	}


	public void delete(Integer id) 
	{

	   repository.deleteById(id);
	}

}
