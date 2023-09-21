package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlacementController
{
	@Autowired
	private PlacementService service;
	
	@GetMapping("/placements")
	public List<Placement> list()
	{
		return service.listAll();
		
	}
	
	@GetMapping("/placements/{Id}")
	
	public ResponseEntity<Placement> get(@PathVariable Integer Id)
	{
		try
		{
			Placement placement=service.get(Id);
			return new ResponseEntity<Placement>(placement, HttpStatus.OK);
		}
		catch(NoSuchElementException e) 
		{
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
			}
		}
	
	@PostMapping("/placements")
	public void add(@RequestBody  Placement placement)
	{
		service.save(placement);
	}
	
	@PutMapping("/placements/{Id}")
	public ResponseEntity<?> update(@RequestBody Placement placement,@PathVariable Integer Id)
	{
		try
		{
			Placement existPlacement=service.get(Id);
			service.save(placement);
			return new ResponseEntity<>(placement, HttpStatus.OK);
		} 
		
		catch (NoSuchElementException e)
		{
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
		@DeleteMapping("/placements/{Id}")
		public void delete(@PathVariable Integer Id)
		{
			service.delete(Id);
		}
	
	

	}
