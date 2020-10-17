package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestAngularResult {

	int i = 0;
	@GetMapping(path = "/emp", produces = "application/json")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
		System.out.println("fsdfsdfsdfsdfsfdsdf === " + (i++));
		List<EmployeeEntity> list = this.getEmployee();

		return new ResponseEntity<List<EmployeeEntity>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	public List<EmployeeEntity> getEmployee() {
		List<EmployeeEntity> al = new ArrayList<>();

		al.add(new EmployeeEntity("Ram", "Razole"));
		al.add(new EmployeeEntity("Jaswin", "Bangalore"));

		return al;

	}

}
