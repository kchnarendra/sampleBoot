package com.narendra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.narendra.models.SampleModel;
import com.narendra.service.SampleService;

@RestController
@RequestMapping("/sample")
public class SampleDataResource {
	
	@Autowired
	SampleService sampleService;
	
	@GetMapping("/getallusers")
	List<SampleModel> getAllAgentsFromService(){	
		return sampleService.getAllUsersService();
	}
	
	@PostMapping("/insertuser")
	void insertNewAgent(@RequestBody SampleModel sampleModel){
		sampleService.insertUserstService(sampleModel);
	}
	
	
}
